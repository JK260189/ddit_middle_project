package kr.or.ddit.member.qaBoard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.qaBoard.service.IQABoardService;
import kr.or.ddit.member.qaBoard.service.QABoardServiceImpl;
import kr.or.ddit.member.vo.QaboardVO;

/**
 * 수정한 게시글 데이터를 처리하는 서블릿
 * @author PC-23
 *
 */
@WebServlet("/qABoardUpdateForm.do")
public class QABoardUpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("수정 데이터 처리 서블릿 진입 성공");
		request.setCharacterEncoding("utf-8");
		//qaM_code
		//qaTitleUpdate
		//qaBoard_s_code_select
		//qaContentUpdate
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("----------------------");
		System.out.println("qa_code 값 :"+qa_code);
		
		int m_code = Integer.parseInt(request.getParameter("qaM_code"));
		System.out.println("m_code 값 :"+m_code);
		
		String qa_title = request.getParameter("qaTitleUpdate");
		System.out.println("qa_title 값:"+qa_title);
		
		int s_code = Integer.parseInt(request.getParameter("qaBoard_s_code_select"));
		System.out.println("s_code 값 : "+s_code);
		
		String qa_content = request.getParameter("qaContentUpdate");
		System.out.println("qa_content 값 : "+qa_content);
		
		
		// 파라미터로 넣을 수 있게 저장
		QaboardVO qvo = new QaboardVO();
		qvo.setQa_code(qa_code);
		qvo.setM_code(m_code);
		qvo.setQa_title(qa_title);
		qvo.setS_code(s_code);
		qvo.setQa_content(qa_content);
		
		int cnt = service.updateQaBoard(qvo);
		
		if(cnt==1) {
			System.out.println("게시글 작성 성공");
			
			request.setAttribute("viewPage", "/WEB-INF/view/member/QABoard_UpdateSuccess.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		} else {
			System.out.println("게시글 작성 실패");
			
			request.setAttribute("viewPage", "/WEB-INF/view/member/QABoard_UpdateFail.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}
		
	}

}
