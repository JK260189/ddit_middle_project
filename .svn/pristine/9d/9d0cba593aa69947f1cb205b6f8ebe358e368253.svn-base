package kr.or.ddit.notice.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.notice.service.NoticeServiceImpl;
import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.notice.vo.Paging;

/**
 * Servlet implementation class Noticeboard
 */
@WebServlet("/noticeboard.do")
public class Noticeboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   request.setCharacterEncoding("utf-8");
	       NoticeServiceImpl service = NoticeServiceImpl.getinstance();
	        int page = 1;
	        if (request.getParameter("page") != null) {
	            page = Integer.parseInt(request.getParameter("page"));
	        }
	        
	        int productConunt = service.getCount();
	        Paging paging = new Paging();
	        paging.setPage(page);
	        paging.setTotalCount(productConunt);
	        Map<String, Object> paramMap = new HashMap<String, Object>();
	        paramMap.put("paging", paging);
	        List<NoticeVO> noticeList = service.getAllList(paramMap);
	       
	        
	        HttpSession session = request.getSession();
		      MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		      AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
		      
		      
		      if(loginAdminVo !=null) {
		    	 request.setAttribute("noticeList", noticeList);
			     request.setAttribute("paging", paging);
		         request.setAttribute("viewPage", "/WEB-INF/view/notice/MainNotice.jsp");
		         request.setAttribute("topPage", "/layout/header_base3.jsp");
		         request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);         
		      }else if(loginMemVo != null) {
		    	 request.setAttribute("noticeList", noticeList);
			     request.setAttribute("paging", paging);
		         request.setAttribute("viewPage", "/WEB-INF/view/notice/MemberMainNotice.jsp");
		         request.setAttribute("topPage", "/layout/header_base2.jsp");
		         request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);         
		      }else {
		    	 request.setAttribute("noticeList", noticeList);
			     request.setAttribute("paging", paging);
		         request.setAttribute("viewPage", "/WEB-INF/view/notice/MainNotice.jsp");
		         request.setAttribute("topPage", "/layout/header_base1.jsp");
		         request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);         
		      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
