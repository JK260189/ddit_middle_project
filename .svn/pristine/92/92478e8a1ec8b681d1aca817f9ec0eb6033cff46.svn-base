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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.product.service.IProductService;
import kr.or.ddit.product.service.ProductServiceImpl;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.Pack_ImgVO;


@WebServlet("/product/doProductList.do")
public class DoProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl service = ProductServiceImpl.getInstance();
		
		List<DoProductVO> list = service.getAllDoProduct();
		
		for (DoProductVO dVo : list) {
			dVo.setiList(service.getAllDoImg(dVo.getDo_code()));
		}
		
		
		request.setAttribute("doList", list);
		
		HttpSession session = request.getSession();
		MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
		AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
		
		
		if(loginAdminVo !=null) {
			request.setAttribute("viewPage", "/WEB-INF/view/product/doProductList.jsp");
			request.setAttribute("topPage", "/layout/header_base3.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}else if(loginMemVo != null) {
			request.setAttribute("viewPage", "/WEB-INF/view/product/doProductList.jsp");
			request.setAttribute("topPage", "/layout/header_base2.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}else {
			request.setAttribute("viewPage", "/WEB-INF/view/product/doProductList.jsp");
			request.setAttribute("topPage", "/layout/header_base1.jsp");
			request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);			
		}
	}
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String do_date = request.getParameter("do_date").substring(0, 10);
		
		System.out.println(do_date);
		IProductService service = ProductServiceImpl.getInstance();
		
		List<DoProductVO> dList = service.getselectedDateDo(do_date);
		System.out.println(dList);
		
		for (DoProductVO dVo : dList) {
			dVo.setiList(service.getAllDoImg(dVo.getDo_code()));;
		}
		
		Map<String, Object> dMap = new HashMap<String, Object>();
		
		dMap.put("dList", dList);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();		
		
		Gson gson = new Gson();
		String jSonStr = gson.toJson(dMap);
		
		out.write(jSonStr);
		response.flushBuffer();
		
		
		
	}

}
