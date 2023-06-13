package kr.or.ddit.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.notice.service.NoticeService;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;

/**
 * Servlet implementation class NoticeView
 */
@WebServlet("/noticeView.do")
@MultipartConfig
public class NoticeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		NoticeVO noticeVo = new NoticeVO();
		String n_code = request.getParameter("n_code");
		int n_code2 = Integer.parseInt(request.getParameter("n_code"));
		
		NoticeService service = NoticeServiceImpl.getinstance();
		
		
		noticeVo = (NoticeVO)service.getNotice(n_code);
		int cnt = service.setCountIncrement(n_code2);

		HttpSession session = request.getSession();
	      MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
	      AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
	      
	      
	      if(loginAdminVo !=null) {
	    	  request.setAttribute("noticeVo",noticeVo);
	         request.setAttribute("viewPage", "/WEB-INF/view/notice/noticeView.jsp");
	         request.setAttribute("topPage", "/layout/header_base3.jsp");
	         request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);         
	      }else if(loginMemVo != null) {
	    	  request.setAttribute("noticeVo",noticeVo);
	         request.setAttribute("viewPage", "/WEB-INF/view/notice/NoticeMemberView.jsp");
	         request.setAttribute("topPage", "/layout/header_base2.jsp");
	         request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);         
	      }else {
	    	  request.setAttribute("noticeVo",noticeVo);
	         request.setAttribute("viewPage", "/WEB-INF/view/notice/noticeView.jsp");
	         request.setAttribute("topPage", "/layout/header_base1.jsp");
	         request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);         
	      }
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
