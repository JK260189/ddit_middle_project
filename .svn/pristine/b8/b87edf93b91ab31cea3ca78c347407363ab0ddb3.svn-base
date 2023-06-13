package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class MemberInsert
 */
@WebServlet("/memberInsert.do")
public class MemberInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String M_ID = request.getParameter("M_ID");
		String M_NAME = request.getParameter("M_NAME");
		String M_PASS = request.getParameter("M_PASS");
		String M_EMAIL = request.getParameter("M_EMAIL");
		String M_ADDR = request.getParameter("M_ADDR");
		
		MemberServiceImpl service = MemberServiceImpl.getInstance();
		MemberVO memberVO = new MemberVO();
		memberVO.setM_id(M_ID);
		memberVO.setM_name(M_NAME);
		memberVO.setM_pass(M_PASS);
		memberVO.setM_email(M_EMAIL);
		memberVO.setM_addr(M_ADDR);
		
		
		service.insertMember(memberVO);
		
		response.sendRedirect(request.getContextPath() + "/index.jsp"); // 페이지 이동시에는 보통
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
