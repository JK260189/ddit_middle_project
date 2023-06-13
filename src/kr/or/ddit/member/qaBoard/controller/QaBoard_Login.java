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
import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;


@WebServlet("/qaBoard_Login.do")
public class QaBoard_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/qaBoard_Login.do 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
		List<AdminVO> adminInfoList = service.selectAdminInfo();
		System.out.println("adminInfoList 값 : "+adminInfoList);
		List<MemberVO> memInfoList = service.selectMemberInfo();
		System.out.println("memInfoList 값 : " +memInfoList);
		
		HttpSession session = request.getSession();
		
		// 로그인 정보
		AdminVO currAdVo = (AdminVO) session.getAttribute("loginAdminVo");
		System.out.println("관리자 정보 : "+currAdVo);
		MemberVO currMemVo = (MemberVO) session.getAttribute("LoginMember");
		System.out.println("회원 정보 : "+currMemVo);
		
		if(currAdVo==null&&currMemVo==null) {
			// 로그인 보내기
			response.sendRedirect(request.getContextPath()+"/memberLogin1.do");
		} else {
			// 관리자
			if(currAdVo!=null) {
				System.out.println("관리자 정보 찾기");
				int a_code = currAdVo.getAdmin_code();
				System.out.println("a_code 값 : "+a_code);
				String a_id = "";
				// 로그인 유효성 확인
				for(AdminVO avo : adminInfoList) {
					if(a_code == avo.getAdmin_code()) {
						// 있으면 관리자
						a_id = avo.getAdmin_id();
						System.out.println("a_id 값 : "+a_id);
						request.setAttribute("a_code", a_code);
						request.setAttribute("a_id", avo.getAdmin_id());
						request.setAttribute("a_pass", avo.getAdmin_pass());
					}
				}
				System.out.println("관리자 아이디 유무 확인");
				
				if(a_id!=null) {
					
					request.getRequestDispatcher("/admin_QABoardList.do").forward(request, response);

				}
				
				
			} else if (currMemVo!=null) {

				System.out.println("회원 정보 찾기");
				// 회원
				int m_code = currMemVo.getM_code();
				String m_name = "";
				for(MemberVO mvo : memInfoList) {
					if(m_code == mvo.getM_code()) {
						m_name = mvo.getM_name();
						request.setAttribute("m_code", m_code);
						request.setAttribute("m_name", mvo.getM_name());
					}
				}
				
				System.out.println("회원 아이디 유무 확인");
				if(m_name!=null) {
					request.getRequestDispatcher("/qABoardList.do").forward(request, response);
				
				} 
			}

		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
