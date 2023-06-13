package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class MemberUpdate
 */
@WebServlet("/memberUpdate.do")
public class MemberUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String M_PASS = request.getParameter("M_PASS");
		String M_EMAIL = request.getParameter("M_EMAIL");
		String M_ADDR = request.getParameter("M_ADDR");
		String M_ID = request.getParameter("M_ID");
		
		MemberVO memberVO = new MemberVO();
		MemberServiceImpl memberServiceImpl = MemberServiceImpl.getInstance();
		
		memberVO.setM_pass(M_PASS);
		memberVO.setM_email(M_EMAIL);
		memberVO.setM_addr(M_ADDR);
		memberVO.setM_id(M_ID);
		 int cnt = memberServiceImpl.updateMember(memberVO);
		 
		request.setAttribute("viewPage", "/WEB-INF/view/main/main.jsp");
		request.setAttribute("topPage", "/layout/header_base2.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			
			
		 
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
