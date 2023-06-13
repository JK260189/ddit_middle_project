package kr.or.ddit.admin.answer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.qaBoard.service.IQABoardService;
import kr.or.ddit.member.qaBoard.service.QABoardServiceImpl;


@WebServlet("/admin_QaBoardDel.do")
public class Admin_QaBoardDel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("문의 게시글 목록에서 게시글을 각각 삭제하는 admin_QaBoardDel.do 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("qa_code 값 : "+qa_code);
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		int cnt = service.deleteQaBoardByOne(qa_code);
		
		System.out.println("cnt 값 : "+cnt);
		
		if(cnt>0) {
			System.out.println("삭제 성공");
			
			request.setAttribute("viewPage", "/WEB-INF/view/admin/Admin_QABoardList.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			
		} else {
			System.out.println("삭제 실패");
		}
	}

}
