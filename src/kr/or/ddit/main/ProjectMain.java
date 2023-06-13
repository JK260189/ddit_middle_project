package kr.or.ddit.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 웹 페이지 시작 요청 처리
@WebServlet("/index.do")
public class ProjectMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//request.setAttribute("viewPage", "/WEB-INF/view/해당서블릿에서이어지는뷰-마이메뉴");
		//request.setAttribute("viewPage", "/WEB-INF/view/해당서블릿에서이어지는뷰-찜");;
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
