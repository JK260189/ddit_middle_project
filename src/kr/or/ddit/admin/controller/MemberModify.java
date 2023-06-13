package kr.or.ddit.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class MemberModify
 */
@WebServlet("/memberModify.do")
public class MemberModify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String M_ID = request.getParameter("M_ID");
		String M_PASS = request.getParameter("M_PASS");
		String M_NAME = request.getParameter("M_NAME");
		String M_EMAIL = request.getParameter("M_EMAIL");
		String M_ADDR = request.getParameter("M_ADDR");
		
		
		MemberVO member = new MemberVO(M_ID, M_PASS, M_NAME, M_EMAIL, M_ADDR);
		
		request.setAttribute("member", member);
		request.setAttribute("viewPage", "/WEB-INF/view/admin/MemberModify.jsp");
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
