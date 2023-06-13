package kr.or.ddit.admin.answer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.qaBoard.service.IQABoardService;
import kr.or.ddit.member.qaBoard.service.QABoardServiceImpl;


@WebServlet("/admin_QaBoard_SelectDel.do")
public class Admin_QaBoard_SelectDel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("체크박스 선택하여 삭제하는 /admin_QaBoard_SelectDel.do 진입 성공");
		request.setCharacterEncoding("utf-8");
		
		String[] qa_codeArr = request.getParameterValues("checkArr");//ajax에서 지정한 데이터 키값
		System.out.println("checkArr ==> " + Arrays.toString(qa_codeArr));
		
		IQABoardService service = QABoardServiceImpl.getQABoardService();
		int cnt=0;
		
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		String temp="";
		
		if(qa_codeArr != null && qa_codeArr.length>0) {
			System.out.println("빈 배열이 아닌 경우");
			for(int i=0; i<qa_codeArr.length; i++) {
				int qa_code = Integer.parseInt(qa_codeArr[i]);
				
				cnt=service.deleteQaBoardByOne(qa_code);
				
				System.out.println("cnt 값 : "+cnt);
				
				if(cnt>0) {
					System.out.println("게시글 체크박스 선택 삭제 성공");
					
					temp = "{\"flag\" : \"성공\"}";
					
				} else {
					System.out.println("게시글 체크박스 선택 삭제 실패");
					temp = "{\"flag\" : \"실패\"}";
				}
			}
		}
		
		
		pw.write(temp);
		response.flushBuffer();
		


	}

}
