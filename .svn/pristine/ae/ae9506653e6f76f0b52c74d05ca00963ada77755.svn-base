package kr.or.ddit.admin.answer.controller;

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
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;

/**
 * 관리자 1:1 문의 게시판 열람
 * @author PC-23
 *
 */
@WebServlet("/admin_QABoardList.do")
public class Admin_QABoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("/admin_QABoardList.do 진입 성공");
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		HttpSession session = request.getSession();
		
		AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
		
		// 회원정보
		MemberService memService = MemberServiceImpl.getInstance();
		List<MemberVO> AllMemList = memService.getAllMemberinfo();
		
		request.setAttribute("AllMemList", AllMemList);
		
		request.setAttribute("viewPage", "/WEB-INF/view/admin/Admin_QABoard_List.jsp");
		
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
