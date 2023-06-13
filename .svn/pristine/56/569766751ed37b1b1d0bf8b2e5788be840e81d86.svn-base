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
import kr.or.ddit.admin.answer.vo.AnswerVO;


@WebServlet("/admin_QaBoardInsert.do")
public class Admin_QaBoardInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/admin_QaBoardInsert.do 진입 성공");
		
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("qa_code 값 : "+qa_code);
		String ans_content = request.getParameter("ansContent");
		System.out.println("ansContent 값 : "+ans_content);


		
		IAnswerService service = AnswerServiceImpl.getAnswerService();
		
		AnswerVO answerVO = new AnswerVO();
		answerVO.setQa_code(qa_code);
		answerVO.setAns_content(ans_content);
		
		int cnt = service.insertQaBoardAnswer(answerVO);
		
		
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		String temp="";
		
		if(cnt>0) {
			System.out.println("답변 입력 성공");
			
			temp = "{\"flag\" : \"성공\"}";
			
//			request.setAttribute("qa_code", qa_code);
//			request.setAttribute("viewPage", "/WEB-INF/view/admin/Admin_QaBoardView.jsp");
//
//			// view(jsp) 페이지로 이동
//			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			
		} else {
			System.out.println("답변 입력 실패");
			temp = "{\"flag\" : \"실패\"}";
		}
		
		pw.write(temp);
		response.flushBuffer();
	}

}
