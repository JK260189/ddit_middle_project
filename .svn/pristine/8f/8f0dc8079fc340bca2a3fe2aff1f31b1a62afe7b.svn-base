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
	System.out.println("QABoardInsert.jsp 진입성공");

	MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
	
	System.out.println("loginMemvo 값 : " + loginMemVo);
	
	int m_code = loginMemVo.getM_code();
	
	IQABoardService service = QABoardServiceImpl.getQABoardService();
	
	List<ScheduleVO> list = (List<ScheduleVO>)service.selectSTitle(m_code);
%>

<div id="main">
	<p class="title">1: 1 문의 게시글 작성</p>
	<hr>
	<form action="qABoardInsertForm.do" method="post">
		<div id="totalBox">
		<div class="insertBox">
			<label for="writer" class="writerLabel">글쓴이</label>
			<input id="writer" type="text" readonly="readonly" value="<%=loginMemVo.getM_name() %>" name="qaM_name">
			<input type="hidden" id="qaM_code" name="qaM_code" value="<%=loginMemVo.getM_code() %>">
		</div>
		
		<hr>

		<div class="qaboardTitle">
			<label for="qaTitleInsert" class="qaTitle">제목</label>
			<input type="text" id="qa_title" name="qaTitleInsert" placeholder="제목을 입력하세요." required>
		</div>
		
		<hr>
  
		<div class="packageSelect">
			<label class="checkedPackage">패키지 여행</label>
			<select  id="s_code" data-style="btn-info" name="qaBoard_s_code_select" data-live-search="true" required>
				<option id="s_code_select" style="color: #5a5a5a;" selected>패키지 여행 선택</option>
<%
	System.out.println("if문 진입 이전");

	if(list==null || list.size() ==0) {
		System.out.println("게시글 없음");
%>
				<option selected>주문한 패키지 여행이 없습니다.</option>
<%
	}else{
		for(ScheduleVO schvo : list) {
			System.out.println("게시글 있음");
			int s_code = schvo.getS_code();
			System.out.println("s_code 값: "+s_code);
			String s_title = schvo.getS_title();
			System.out.println("s_title 값: "+s_title);
%>
				<option id="qaS_code" class="checkedOption" value="<%=s_code %>"><%=s_title %></option>
<%
		}
	}
%>
			</select>
		</div>
	
		<hr>	

		<div class="qaboardContent">
			<label for="qa_content" class="qa_content">문의 내용</label>
			<textarea id="qa_content" name="qa_content" placeholder="문의 내용을 입력하십시오."></textarea>
		</div>
		
		<div class="buttonArea">
			<button type="button" id="qaButtonInsert1" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글 작성 완료 버튼" onclick="insertQaboard(this)">작성 완료</button>
			<button type="button" id="qaButtonInsert2" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="작성 취소 버튼" type="reset" onclick=location.href="<%=request.getContextPath() %>/qABoardList.do">취소</button>
		
		<!--  <button class="w-100 btn btn-lg btn-primary" id="qaButton" type="button" onclick="insertQaboard(this)">작성 완료</button>
		<button class="w-100 btn btn-lg btn-primary" id="qaButton" type="reset" onclick=location.href="<%=request.getContextPath() %>/qABoardList.do">취소</button>-->
		</div>
		</div>
	</form>
</div>

<script src="<%=request.getContextPath() %>/js/admin_qaboard.js"></script>
