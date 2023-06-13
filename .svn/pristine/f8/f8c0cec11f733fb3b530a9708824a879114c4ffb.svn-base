package kr.or.ddit.product.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.product.service.ProductServiceImpl;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.Pack_ImgVO;

@WebServlet("/product/viewImage.do")
public class viewImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int imgCode = Integer.parseInt(request.getParameter("img_code"));
		
		ProductServiceImpl service = ProductServiceImpl.getInstance();
		Pack_ImgVO pVo = service.getImg(imgCode);
		String filePath =  "d:/d_other/uploadFiles";
		
		String fileName = pVo.getImg_id();
		if (fileName == null) {
			fileName = "noImage.png";
		}
		
		String imgFilePath = filePath + File.separator + fileName;
		
		File file = new File(imgFilePath);
		
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		if (file.exists()) {
			try {
				bin = new BufferedInputStream(new FileInputStream(file));
				bout = new BufferedOutputStream(response.getOutputStream());
				
				byte[] temp = new byte[1024];
				int len = 0;
				while ((len = bin.read(temp)) > 0) {
					bout.write(temp, 0 ,len);
				}
				bout.flush();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}finally {
				if(bout!=null) try {bout.close(); } catch(IOException e) {}
				if(bin!=null) try {bout.close(); } catch(IOException e) {}
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
