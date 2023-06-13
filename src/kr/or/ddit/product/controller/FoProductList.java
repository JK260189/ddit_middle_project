package kr.or.ddit.product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.product.service.IProductService;
import kr.or.ddit.product.service.ProductServiceImpl;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.FoProductVO;
import kr.or.ddit.product.vo.Pack_ImgVO;


@WebServlet("/product/foProductList.do")
public class FoProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl service = ProductServiceImpl.getInstance();
		
		List<FoProductVO> list = service.getAllFoProduct();
		List<Pack_ImgVO> iList = null;
		
		for (FoProductVO fVo : list) {
			fVo.setiList(service.getAllFoImg(fVo.getFo_code()));
		}
		request.setAttribute("foList", list);
		
		
		HttpSession session = request.getSession();
		MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
		
		
		if(loginAdminVo !=null) {
			request.setAttribute("viewPage", "/WEB-INF/view/product/foProductList.jsp");
			request.setAttribute("topPage", "/layout/header_base3.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}else if(loginMemVo != null) {
			request.setAttribute("viewPage", "/WEB-INF/view/product/foProductList.jsp");
			request.setAttribute("topPage", "/layout/header_base2.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}else {
			request.setAttribute("viewPage", "/WEB-INF/view/product/foProductList.jsp");
			request.setAttribute("topPage", "/layout/header_base1.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String fo_date = request.getParameter("fo_date").substring(0, 10);
		
		System.out.println(fo_date);
		IProductService service = ProductServiceImpl.getInstance();
		
		List<FoProductVO> fList = service.getselectedDateFo(fo_date);
			
		for (FoProductVO fVo : fList) {
			fVo.setiList(service.getAllFoImg(fVo.getFo_code()));
		}
		
		Map<String, Object> fMap = new HashMap<String, Object>();
		
		fMap.put("fList", fList);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();		
		
		Gson gson = new Gson();
		String jSonStr = gson.toJson(fMap);
		
		out.write(jSonStr);
		response.flushBuffer();
	}

}
