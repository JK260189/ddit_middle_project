package kr.or.ddit.member.qaBoard.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.qaBoard.service.IQABoardService;
import kr.or.ddit.member.qaBoard.service.QABoardServiceImpl;
import kr.or.ddit.member.vo.QaboardVO;


@WebServlet("/qABoardInsertForm.do")
public class QABoardInsertForm extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("/qABoardInsertForm.do 진입 성공");
		//입력받은 값 처리하는 서블릿
		
		//qaM_code
		//qaTitleInsert
		//s_code_select
		//qaContentInsert
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		int m_code = Integer.parseInt(request.getParameter("m_code"));//글쓴이
		System.out.println("m_code 값 :"+m_code);
		String qa_title = request.getParameter("qa_title");//제목
		System.out.println("qa_title 값:"+qa_title);
		int s_code = Integer.parseInt(request.getParameter("s_code"));//여행타이틀
		System.out.println("s_code 값 : "+s_code);
		String qa_content = request.getParameter("qa_content");//내용
		System.out.println("qa_content 값 : "+qa_content);
		
		if(qa_title==null||s_code==0||qa_content==null) {
			System.out.println("자료 부족");
		}
		
		QaboardVO qaboardVO = new QaboardVO();
		qaboardVO.setM_code(m_code);
		qaboardVO.setQa_title(qa_title);
		qaboardVO.setS_code(s_code);
		qaboardVO.setQa_content(qa_content);
		
		int cnt = service.insertQaBoard(qaboardVO);
		
		

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
		
		
		
		/*
		if(cnt==1) {
			System.out.println("게시글 작성 성공");
			request.setAttribute("viewPage", "/WEB-INF/view/member/QABoard_insertSuccess.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		} else {
			System.out.println("게시글 작성 실패");
			request.setAttribute("viewPage", "/WEB-INF/view/member/QABoard_insertFail.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}*/
		
		
		
		
		
	}

}
