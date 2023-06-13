package kr.or.ddit.member.qaBoard.controller;

import java.io.IOException;
import java.util.List;

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

// 게시글 보기(제목 선택)
@WebServlet("/qaBoardView.do")
public class QaBoardView extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("제목 클릭 후 QaBoardView 서블릿 시작");
		request.setCharacterEncoding("utf-8");
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("qa_code 값:"+qa_code);
		
		HttpSession session = request.getSession();
		MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		int m_code = loginMemVo.getM_code();
		System.out.println("m_code 값: "+m_code);
		
		int postHit = service.updateCount(qa_code);
		System.out.println("postHit 값 : " +postHit);
		
		List<QaboardVO> list = service.selectQaBoardByQaCode(qa_code);
		System.out.println("글 상세 내용 sql 처리 : "+list);
		
		request.setAttribute("QaBoard_View", list);
		request.setAttribute("viewPage", "/WEB-INF/view/member/QaBoard_View.jsp");

		// view(jsp) 페이지로 이동
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
