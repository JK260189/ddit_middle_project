package kr.or.ddit.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.notice.service.NoticeService;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

/**
 * Servlet implementation class NoticeUpdate1
 */
@WebServlet("/noticeUpdate1.do")
public class NoticeUpdate1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		NoticeVO noticeVo = new NoticeVO();
		String n_code = request.getParameter("n_code");
		
		NoticeService service = NoticeServiceImpl.getinstance();
		
		
		noticeVo = (NoticeVO)service.getNotice(n_code);
		
		request.setAttribute("noticeVo",noticeVo);

		request.setAttribute("viewPage", "/WEB-INF/view/notice/NoticeUpdate.jsp");
		request.setAttribute("topPage", "/layout/header_base3.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
