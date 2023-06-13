package kr.or.ddit.admin.answer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.admin.answer.service.AnswerServiceImpl;
import kr.or.ddit.admin.answer.service.IAnswerService;


@WebServlet("/admin_QaBoard_AnswerDel.do")
public class Admin_QaBoard_AnswerDel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("문의 게시글 목록에서 게시글을 각각 삭제하는 admin_QaBoardDel.do 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		int ans_code = Integer.parseInt(request.getParameter("ans_code"));
		System.out.println("ans_code 값 : "+ans_code);
		
		IAnswerService service = AnswerServiceImpl.getAnswerService();
		
		int cnt = service.deleteSelectByAnswer(ans_code);
		
		System.out.println("cnt 값 : "+cnt);

		response.setCharacterEncoding("utf-8");
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		String temp="";
		
		if(cnt>0) {
			System.out.println("답변 삭제 성공");
			
			temp = "{\"flag\" : \"성공\"}";
			
//			request.setAttribute("qa_code", qa_code);
//			request.setAttribute("viewPage", "/WEB-INF/view/admin/Admin_QaBoardView.jsp");
//
//			// view(jsp) 페이지로 이동
//			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			
		} else {
			System.out.println("답변 삭제 실패");
			temp = "{\"flag\" : \"실패\"}";
		}
		
		pw.write(temp);
		response.flushBuffer();
	}

}
