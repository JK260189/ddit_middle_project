package kr.or.ddit.member.qaBoard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.qaBoard.service.IQABoardService;
import kr.or.ddit.member.qaBoard.service.QABoardServiceImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.QaboardVO;


@WebServlet("/qABoardDelete.do")
public class QABoardDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/qABoardDelete.do 삭제 서블릿 get 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		
		HttpSession session = request.getSession();
		//List<QaboardVO> list = (List<QaboardVO>) request.getAttribute("TheQAPost");

		//m_code 정보
		MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		
		int m_code = loginMemVo.getM_code();
		System.out.println("m_code 값 : "+m_code);
		
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("qa_code 값 : "+qa_code);
		
		QaboardVO qvo = new QaboardVO();
		qvo.setM_code(m_code);
		qvo.setQa_code(qa_code);
		
		
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		int cnt = service.deleteQaBoard(qvo);
		
		if(cnt==1) {
			System.out.println("문의 게시글 삭제 sql 메서드 성공");
			
			request.setAttribute("viewPage", "/WEB-INF/view/member/QABoard_DeleteSuccess.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		} else {
			System.out.println("게시글 작성 실패");
			request.setAttribute("viewPage", "/WEB-INF/view/member/QABoard_DeleteFail.jsp");

			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
