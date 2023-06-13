package kr.or.ddit.purchase.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.purchase.service.PurchaseServiceImpl;
import kr.or.ddit.purchase.vo.PurchaseVO;

@WebServlet("/purchase/do_purchase.do")
public class Do_Purchase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PurchaseVO pVo = (PurchaseVO) request.getAttribute("PurVo");
		int cnt = 0;
		PurchaseServiceImpl service = PurchaseServiceImpl.getInstance();
		cnt = service.insertDoPurchase(pVo);
		
		request.setAttribute("viewPage", "/WEB-INF/view/main/main.jsp");
		request.setAttribute("topPage", "/layout/header_base2.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		PurchaseVO pVo = new PurchaseVO();
		
		HttpSession session = request.getSession();

		MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		
		
		int m_code = Integer.parseInt(request.getParameter("m_code"));
		int do_code = Integer.parseInt(request.getParameter("do_code"));
		String p_name = request.getParameter("do_name");
		String p_sdate = request.getParameter("p_sdate");
		String p_edate = request.getParameter("p_edate");
		int p_people = Integer.parseInt(request.getParameter("quantity"));
		int p_price = Integer.parseInt(request.getParameter("price"));
		int p_amount = Integer.parseInt(request.getParameter("quantity"));
		
		pVo.setM_code(m_code);
		pVo.setDo_code(do_code);
		pVo.setP_name(p_name);
		pVo.setP_sdate(p_sdate);
		pVo.setP_edate(p_edate);
		pVo.setP_people(p_people);
		pVo.setP_price(p_price);
		pVo.setP_amount(p_amount);
		pVo.setS_title(p_name);
		pVo.setS_sday(p_sdate);
		pVo.setS_eday(p_edate);
		
		int cnt = 0;
		PurchaseServiceImpl service = PurchaseServiceImpl.getInstance();
		cnt = service.insertDoPurchase(pVo);
		
		pVo.setP_code(cnt);
		
		service.insertDoSchedule(pVo);
		
		
		request.setAttribute("pVo", pVo);
		request.setAttribute("viewPage", "/WEB-INF/view/purchase/Purchase_Do.jsp");
		request.setAttribute("topPage", "/layout/header_base2.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
	}

}
