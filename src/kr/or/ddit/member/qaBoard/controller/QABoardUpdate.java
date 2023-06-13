package kr.or.ddit.member.qaBoard.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.qaBoard.service.IQABoardService;
import kr.or.ddit.member.qaBoard.service.QABoardServiceImpl;
import kr.or.ddit.member.vo.QaboardVO;


@WebServlet("/qABoardUpdate.do")
public class QABoardUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/qABoardUpdate.do 문의 게시글 수정 서블릿 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("qa_code 값 : "+qa_code);
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		List<QaboardVO> list = (List<QaboardVO>) service.selectQaBoardByQaCode(qa_code);
		
		System.out.println("수정할 내용 저장");
				
		request.setAttribute("TheQAPost", list);
		request.setAttribute("viewPage", "/WEB-INF/view/member/QaBoard_Update.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
