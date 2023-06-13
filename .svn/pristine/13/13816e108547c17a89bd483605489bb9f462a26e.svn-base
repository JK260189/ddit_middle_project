package kr.or.ddit.admin.answer.controller;

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


@WebServlet("/admin_QaBoardView.do")
public class Admin_QaBoardView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("제목 클릭 후 /admin_QaBoardView.do 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		int qa_code = Integer.parseInt(request.getParameter("qa_code"));
		System.out.println("qa_code 값:"+qa_code);
		
		List<QaboardVO> list = service.selectQaBoardByQaCode(qa_code);
		System.out.println("글 상세 내용 sql 처리 : "+list);
		
		int m_code=0;
		for(QaboardVO qvo : list) {
			m_code = qvo.getM_code();
		}
		System.out.println("m_code 값 : "+m_code);
		
		
		/* 관리자가 조회하는 경우 : 조회수 변동 없음
		 * int postHit = service.updateCount(qa_code); System.out.println("postHit 값 : "
		 * +postHit);
		 */
		
		request.setAttribute("qa_code", qa_code);
		request.setAttribute("m_code", m_code);
		request.setAttribute("Admin_QaBoard_View", list);
		request.setAttribute("viewPage", "/WEB-INF/view/admin/Admin_QaBoardView.jsp");

		// view(jsp) 페이지로 이동
		//request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		

			
			request.setAttribute("qa_code", qa_code);
			request.setAttribute("viewPage", "/WEB-INF/view/admin/Admin_QaBoardView.jsp");
//
//			// view(jsp) 페이지로 이동
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
			

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
