package kr.or.ddit.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.admin.dao.AdminDaoImpl;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;



/**
 * Servlet implementation class MemberLogin
 */
@WebServlet("/memberLogin.do")
public class MemberLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String M_ID = request.getParameter("M_ID");
		String M_PASS = request.getParameter("M_PASS");
		
		request.setAttribute("M_ID", M_ID);
		request.setAttribute("M_PASS", M_PASS);
		request.setAttribute("viewPage", "/WEB-INF/view/member/MemberLoginCheck.jsp");
	    request.setAttribute("topPage", "/layout/header_base.jsp");
	    request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		
		 
	
			
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
