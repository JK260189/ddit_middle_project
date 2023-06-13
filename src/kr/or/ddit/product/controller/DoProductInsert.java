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
import kr.or.ddit.product.vo.BusVO;
import kr.or.ddit.product.vo.CityVO;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.HotelVO;
import kr.or.ddit.product.vo.Pack_ImgVO;


@WebServlet("/product/doProdInsert.do")
@MultipartConfig(
		fileSizeThreshold = 1024 * 1024 * 10, maxFileSize = 1024 * 1024 * 30,
		maxRequestSize = 1024 * 1024 * 100
)
public class DoProductInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProductService service = ProductServiceImpl.getInstance();
		
		List<BusVO> bList = service.getAllBus();
		List<HotelVO> hList = service.getAllHotel();
		List<CityVO> cList = service.getAllCity();
		
		request.setAttribute("bus", bList);
		request.setAttribute("hotel", hList);
		request.setAttribute("city", cList);
		
		request.setAttribute("viewPage", "/WEB-INF/view/product/doProdInsert.jsp");
		request.setAttribute("topPage", "/layout/header_base3.jsp");
		request.getRequestDispatcher("/layout/layout.jsp").forward(request, response);	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		DoProductVO dVo = new DoProductVO();
		
		
		String doName = request.getParameter("do_name");
		int doMin = Integer.parseInt(request.getParameter("do_min"));
		int doMax = Integer.parseInt(request.getParameter("do_max"));
		String doDept = request.getParameter("do_dept");
		String doArri = request.getParameter("do_arri");
		String doContent = request.getParameter("do_content");
		int doPrice = Integer.parseInt(request.getParameter("price"));
		int doBus = Integer.parseInt(request.getParameter("doBus"));
		int doHotel = Integer.parseInt(request.getParameter("doHotel"));
		dVo.setDo_name(doName);
		dVo.setDo_min(doMin);
		dVo.setDo_max(doMax);
		dVo.setDo_department(doDept);
		dVo.setDo_arrival(doArri);
		dVo.setDo_price(doPrice);
		dVo.setBus_code(doBus);
		dVo.setH_code(doHotel);
		dVo.setDo_content(doContent);
		
		IProductService service = ProductServiceImpl.getInstance();
		int do_code = service.insertDoProduct(dVo);
		
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
				iVo.setDo_code(do_code);
				try {
					part.write(uploadPath + File.separator + saveFileName);
				} catch (Exception e) {
					e.printStackTrace();
				}	
				iList.add(iVo);
			}
			
			
		}
		for (Pack_ImgVO pack_ImgVO : iList) {
			service.insertImgDo(pack_ImgVO);
		}
		
		
		request.setAttribute("viewPage", "/WEB-INF/view/product/doProdTerminal.jsp");
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
