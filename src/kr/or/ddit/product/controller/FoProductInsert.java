package kr.or.ddit.product.controller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import kr.or.ddit.product.service.IProductService;
import kr.or.ddit.product.service.ProductServiceImpl;
import kr.or.ddit.product.vo.FlightVO;
import kr.or.ddit.product.vo.FoProductVO;
import kr.or.ddit.product.vo.HotelVO;
import kr.or.ddit.product.vo.Pack_ImgVO;

@WebServlet("/product/foProdInsert.do")
@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 10, maxFileSize = 1024 * 1024 * 30,
		maxRequestSize = 1024 * 1024 * 100
)
public class FoProductInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProductService service = ProductServiceImpl.getInstance();
		
		List<HotelVO>hList = service.getAllHotel();
		List<FlightVO>fList = service.getAllFlight();
		
		request.setAttribute("flight", fList);
		request.setAttribute("hotel", hList);
		request.setAttribute("viewPage", "/WEB-INF/view/product/foProdInsert.jsp");
		request.setAttribute("topPage", "/layout/header_base3.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		FoProductVO fVo = new FoProductVO();
		
		String fo_name = request.getParameter("fo_name");
		int fo_min = Integer.parseInt(request.getParameter("fo_min"));
		int fo_max = Integer.parseInt(request.getParameter("fo_max"));
		String fo_dept = request.getParameter("fo_dept");
		String fo_arri = request.getParameter("fo_arri");
		String fo_content = request.getParameter("fo_content");
		int fo_price = Integer.parseInt(request.getParameter("price"));
		int fo_flight = Integer.parseInt(request.getParameter("foFlight"));
		int fo_hotel = Integer.parseInt(request.getParameter("foHotel"));
		fVo.setFo_name(fo_name);
		fVo.setFo_min(fo_min);
		fVo.setFo_max(fo_max);
		fVo.setFo_department(fo_dept);
		fVo.setFo_arrival(fo_arri);
		fVo.setFo_price(fo_price);
		fVo.setFlight_code(fo_flight);
		fVo.setH_code(fo_hotel);
		fVo.setFo_content(fo_content);
		
		IProductService service = ProductServiceImpl.getInstance();
		int fo_code = service.insertFoProduct(fVo);
		System.out.println(fo_code);
		
		String uploadPath =  "d:/d_other/uploadFiles";
		File f = new File(uploadPath);
		if(!f.exists()) {
			f.mkdirs();
		}
		
		String fileName = "";
		List<Pack_ImgVO> iList = new ArrayList<Pack_ImgVO>();
		
		for (Part part : request.getParts()) {
			fileName = extractFileName(part);
			
			if (!"".equals(fileName)) {
				Pack_ImgVO iVo = new Pack_ImgVO();
				String saveFileName = UUID.randomUUID().toString();
				iVo.setImg_id(saveFileName);
				iVo.setFo_code(fo_code);
				try {
					part.write(uploadPath + File.separator + saveFileName);
				} catch (Exception e) {
					e.printStackTrace();
				}	
				iList.add(iVo);
				
			}
			
			
		}
		
		for (Pack_ImgVO pack_ImgVO : iList) {
			service.insertImgFo(pack_ImgVO);
		}
		request.setAttribute("viewPage", "/WEB-INF/view/product/foProdTerminal.jsp");
		request.setAttribute("topPage", "/layout/header_base3.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);
		
		
		
	}
	
	private String extractFileName(Part part) {
		String fileName = "";
		String contentDispostion = part.getHeader("content-disposition");
		String[] items = contentDispostion.split(";");
		for(String item : items) {
			if(item.trim().startsWith("filename")) {
				fileName = item.substring(item.indexOf("=") + 2, item.length() -1);
			}
		}
		return fileName;
		
	}

}
