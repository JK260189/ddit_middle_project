package kr.or.ddit.admin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberAdminDelete
 */
@WebServlet("/memberAdminDelete.do")
public class MemberAdminDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String M_ID = request.getParameter("M_ID");
		
		request.setAttribute("M_ID", M_ID);
		
		MemberServiceImpl service = MemberServiceImpl.getInstance();
		
		boolean idCheck = service.idCheck(M_ID);
		if(!idCheck) {
			request.setAttribute("viewPage", "/WEB-INF/view/admin/MemberAdminDeleteFail.jsp");
			request.setAttribute("topPage", "/layout/header_base3.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}else {
			int check = service.deleteMember(M_ID);
			if(check > 0) {
				request.setAttribute("viewPage", "/WEB-INF/view/admin/MemberAdminDelete.jsp");
				request.setAttribute("topPage", "/layout/header_base3.jsp");
				request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			}else {
				request.setAttribute("viewPage", "/WEB-INF/view/admin/MemberAdminDeleteFail.jsp");
				request.setAttribute("topPage", "/layout/header_base3.jsp");
				request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			}
			
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
