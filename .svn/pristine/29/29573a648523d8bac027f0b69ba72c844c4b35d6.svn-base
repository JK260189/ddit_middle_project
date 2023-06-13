<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.member.vo.ScheduleVO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.qaBoard.service.QABoardServiceImpl"%>
<%@page import="kr.or.ddit.member.qaBoard.service.IQABoardService"%>
<%@page import="kr.or.ddit.member.vo.QaboardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("QaBoard_Update.jsp 진입 성공");

	List<QaboardVO> list = (List<QaboardVO>) request.getAttribute("TheQAPost");

	//m_code 정보
	MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");

	int m_code = loginMemVo.getM_code();
	
	IQABoardService service = QABoardServiceImpl.getQABoardService();
	List<ScheduleVO> selectStitleList = (List<ScheduleVO>)service.selectSTitle(m_code);
	
	int qa_code=0;
%>

<div id="main">
	<p class="title">1: 1 문의 게시글 수정</p>
	<hr>
<form action="qABoardUpdateForm.do" method="post">
<%
	for(QaboardVO qvo : list){
		qa_code = qvo.getQa_code();
%>
	<input type="text" value="<%=qa_code %>" name="qa_code" style="display:none;">
	
	<div id="totalBox">
	
	
	<label for="writer" class="writerLabel">글쓴이</label>
	<input type="text" readonly="readonly" id="writer" value="<%=loginMemVo.getM_name() %>" name="qaM_name">
	<input type="text" value="<%=loginMemVo.getM_code() %>" name="qaM_code" style="display:none;">
	

    <hr>

	<div class="qaboardTitle">
		<div id="text">
		<label for="qaTitleInsert" class="qaTitle">제목</label>
		<input type="text" id="qaTitleInsert2"  name="qaTitleUpdate" required value="<%=qvo.getQa_title() %>">
		</div>
		
	</div>
  
  
  
	<hr>
  
	<div class="packageSelect">
		<label class="checkedPackage">패키지 여행</label>
    	<select class="custom-select" name="qaBoard_s_code_select" required>
			<option selected>패키지 여행 선택</option>
<%
			System.out.println("if문 진입 이전");

		if(selectStitleList==null || selectStitleList.size() ==0) {
			System.out.println("게시글 없음");
%>
			<option selected>주문한 패키지 여행이 없습니다.</option>
<%
		}else{
			for(ScheduleVO schvo : selectStitleList) {
          		System.out.println("게시글 있음");
          		int s_code = schvo.getS_code();
          		System.out.println("s_code 값: "+s_code);
          		String s_title = schvo.getS_title();
          		System.out.println("s_title 값: "+s_title);

          		if(qvo.getS_code()==s_code){
%>
          			<option value="<%=s_code %>" selected><%=s_title %></option>
          			<%
          		} else {
	%>
					<option value="<%=s_code %>"><%=s_title %></option>
	<%
				}
			}
		}
	%>
		</select>
	</div>
	
	<hr>
	
	<div class="qaboardContent">
		<label for="qa_content" class="qaContent">문의 내용</label>
		<div id="text">
		<textarea  id="qa_content2" name="qaContentUpdate"><%=qvo.getQa_content() %></textarea>
		</div>
	</div>
<%
	}
%>

	<div class="buttonArea">
	<button id="qaButtonInsert1" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글 수정 완료 버튼" type="submit">수정 완료</button>
	<button type="button" id="qaButtonInsert1" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글 수정 취소하기 버튼" type="reset" onclick=location.href="<%=request.getContextPath() %>/qABoardList.do?qa_code=<%=qa_code %>">취소</button>

	
</form>
</div>