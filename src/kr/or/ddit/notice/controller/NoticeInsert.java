package kr.or.ddit.notice.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

/**
 * Servlet implementation class NoticeInsert
 */
@WebServlet("/noticeInsert.do")
@MultipartConfig
public class NoticeInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자가 업로드한 파일이 저장될 서버쪽의 폴더 경로 설정
		String uploadPath = "D:/D_other/uploadFiles";

		// 저장될 폴더가 없으면 생성한다.
		File fileUploadDir = new File(uploadPath);
		if (!fileUploadDir.exists()) {
			fileUploadDir.mkdirs();
		}
		
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		HttpSession session = request.getSession();
		NoticeVO noticeVO = new NoticeVO();
		AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
		int code = loginAdminVo.getAdmin_code();
		noticeVO.setN_title(title);
		noticeVO.setN_content(content);
		noticeVO.setN_writer(writer);
		noticeVO.setAdmin_code(code);
		
		
		Part part = request.getPart("n_image");
		
		if(part != null) {
			String photo = extractFileName(part);
			if(!"".equals(photo)) {
				try {
					String savePhoto = UUID.randomUUID().toString();
					part.write(uploadPath + File.separator + savePhoto);
					noticeVO.setN_image(savePhoto);
				}catch(IOException e) {
					noticeVO.setN_image(null);
				}
			}
		}		
		NoticeServiceImpl service = NoticeServiceImpl.getinstance();
		
		int cnt = service.insertNotice(noticeVO);
		
		if(cnt > 0) {
			request.setAttribute("viewPage", "/WEB-INF/view/notice/NoticeRegistrationSuccess.jsp");
			request.setAttribute("topPage", "/layout/header_base3.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}else {
			
		}
		
	}
		private String extractFileName(Part part) {
			String fileName = ""; 
			String contentDisposition = part.getHeader("Content-Disposition");
			String[] items = contentDisposition.split(";");
			for (String item : items) {
				if (item.trim().startsWith("filename")) {
					fileName = item.substring(item.indexOf("=") + 2, item.length() - 1);
				}
			}
			return fileName;
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
