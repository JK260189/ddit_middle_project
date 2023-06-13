package kr.or.ddit.notice.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.notice.service.NoticeService;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;



/**
 * Servlet implementation class NoticeUpdate
 */
@WebServlet("/noticeUpdate.do")
@MultipartConfig
public class NoticeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uploadPath = "D:/D_other/uploadFiles";

		// 저장될 폴더가 없으면 생성한다.
		File fileUploadDir = new File(uploadPath);
		if (!fileUploadDir.exists()) {
			fileUploadDir.mkdirs();
		}
		
		request.setCharacterEncoding("utf-8");
		System.out.println("도착");
		NoticeVO noticeVO = new NoticeVO();
		
		String n_title = request.getParameter("n_title");
		String n_content = request.getParameter("n_content");
		String old_photo = request.getParameter("old_photo");
		int n_code = Integer.parseInt(request.getParameter("n_code"));
		
		System.out.println(n_title);
		System.out.println(n_content);
		System.out.println(n_code);
		System.out.println(old_photo);
		
		
		NoticeServiceImpl noticeServiceImpl = NoticeServiceImpl.getinstance();
		noticeVO.setN_title(n_title);
		noticeVO.setN_content(n_content);
		noticeVO.setN_code(n_code);
		noticeVO.setN_image(old_photo);
		
		Part part = request.getPart("n_image");
				
		if(part != null) {
			String photo = extractFileName(part);
			if(!"".equals(photo)) {
				try {
					String savePhoto = UUID.randomUUID().toString();
					part.write(uploadPath + File.separator + savePhoto);
					noticeVO.setN_image(savePhoto); // 수정파일이 있으면 새로운 파일명으로 셋팅
							 
					}catch(IOException e) {
							
				}
			}
						
		}
		
		
		
		int cnt = noticeServiceImpl.updateNotice(noticeVO);
		if(cnt > 0) {
			System.out.println("실행완료");
		request.setAttribute("viewPage", "/WEB-INF/view/notice/UpdeteSuccess.jsp");
		request.setAttribute("topPage", "/layout/header_base3.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}else {
			request.setAttribute("viewPage", "/WEB-INF/view/notice/UpdateFail.jsp");
			request.setAttribute("topPage", "/layout/header_base3.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}
	}
		private String extractFileName(Part part){
			String fileName = ""; 
			String contentDisposition = part.getHeader("Content-Disposition");
			String[] items = contentDisposition.split(";");
			for (String item : items) {
				if (item.trim().startsWith("filename")) {
					fileName = item.substring(item.indexOf("=") + 2, item.length() - 1);
				}
			}
			return fileName;
		
		
		
//		int n_code = Integer.parseInt(request.getParameter("n_code"));
//	
//		
//		NoticeService service = NoticeServiceImpl.getinstance();
//		
//		// 게시판 VO 셋팅
//		NoticeVO notiVo = (NoticeVO)service.getNotice("n_code");
//		
//		request.setAttribute("noticeVo", notiVo);
//		request.setAttribute("viewPage", "/WEB-INF/view/notice/NoticeUpdate.jsp");
//		RequestDispatcher rd = request.getRequestDispatcher("/layout/layout.jsp");
//		
//		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		NoticeVO notivo = new NoticeVO();
//		
//		String n_title = request.getParameter("n_title");
//		String n_content = request.getParameter("n_content");
//		int n_code = Integer.parseInt(request.getParameter("n_code"));
//		
//		NoticeService service = NoticeServiceImpl.getinstance();
//		
//		notivo.setN_title(n_title);
//		notivo.setN_content(n_content);
//		notivo.setN_code(n_code);
//		
//		int cnt = service.updateNotice(notivo);
//		if(cnt > 0) {
//			request.setAttribute("viewPage", "/WEB-INF/view/notice/NoticeUpdate.jsp");
//			request.setAttribute("topPage", "/layout/header_base3.jsp");
//			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
//			doGet(request, response);
		doGet(request, response);
		}
		
	}


