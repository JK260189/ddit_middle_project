package kr.or.ddit.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.product.service.IProductService;
import kr.or.ddit.product.service.ProductServiceImpl;
import kr.or.ddit.product.vo.DetailVO;
import kr.or.ddit.product.vo.Pack_ImgVO;


@WebServlet("/product/doProductDetail.do")
public class DoProductDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int do_code = Integer.parseInt(request.getParameter("do_code"));
		IProductService service = ProductServiceImpl.getInstance();
		System.out.println(do_code);
		
		DetailVO dVo = service.getDetailProdDo(do_code);
		List<Pack_ImgVO> iList = service.getAllDoImg(do_code);
		
		request.setAttribute("dVo", dVo);
		request.setAttribute("iList", iList);
		
		HttpSession session = request.getSession();
		MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
		
		
		if(loginAdminVo !=null) {
			request.setAttribute("viewPage", "/WEB-INF/view/product/doProductDetail.jsp");
			request.setAttribute("topPage", "/layout/header_base3.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}else if(loginMemVo != null) {
			request.setAttribute("viewPage", "/WEB-INF/view/product/doProductDetail.jsp");
			request.setAttribute("topPage", "/layout/header_base2.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}else {
			request.setAttribute("viewPage", "/WEB-INF/view/product/doProductDetail.jsp");
			request.setAttribute("topPage", "/layout/header_base1.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
