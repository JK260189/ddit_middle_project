package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.MemberServiceImpl;

/**
 * Servlet implementation class IdChechServlet
 */
@WebServlet("/idChechServlet.do")
public class IdChechServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	
		
		request.setCharacterEncoding("utf-8");
	 	response.setCharacterEncoding("utf-8");
		 String userId = request.getParameter("userId");
		 PrintWriter out = response.getWriter();
         
         
       
         MemberServiceImpl service = MemberServiceImpl.getInstance();
         
         boolean idCheck = service.idCheck(userId);
         
         
         if(idCheck) {
             System.out.println("이미존재하는 아이디입니다");
         }else {
        	 System.out.println("사용가능한 아이디입니다.");
         }
         out.write(idCheck + "");
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
