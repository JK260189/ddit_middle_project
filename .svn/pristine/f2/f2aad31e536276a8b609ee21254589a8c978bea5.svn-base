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
	int m_code = (int) session.getAttribute("m_code");
	List<QaboardVO> list = (List<QaboardVO>)request.getAttribute("QaBoardList");
	
	MemberVO mvo = new MemberVO();
	ScheduleVO svo = new ScheduleVO();
%>


<h1>문의 게시글 작성</h1>
<form action="qABoardInsertForm.do" method="post">
	<div class="form-row">
		<label for="writer" class="col-sm-2 col-form-label">글쓴이</label>
		<div class="col-sm-10">
<%
	if(m_code == mvo.getM_code()) {
%>
			<input type="text" readonly class="form-control-plaintext" id="staticEmail" value="<%=mvo.getM_name() %>" name="qaM_name">
			<input type="text" readonly value="<%=m_code %>" name="qaM_code" style="visiblity:none;">
		</div>
	</div>
<%
}
%>
    <div class="col-md-4 mb-3">
		<label for="title" class="col-sm-2 col-form-label">제목</label>
		<div class="col-sm-10">
		<input type="text" class="form-control is-valid" id="validationServer01" placeholder="제목을 입력하세요." name="qaTitleInsert" required>
		</div>
	</div>
  
	<div class="form-group">
    	<select class="custom-select" name="s_code_select" required>
			<option selected>패키지 여행 선택</option>
<%
	for(QaboardVO qvo : list) {
		if( qvo.getS_code()==0 ) {
%>
			<option value="s_code">여행 일정이 존재하지 않습니다.</option>
<%		} else {
			if(qvo.getS_code()==svo.getS_code()){
%>
				<option value="qaS_Title"><%=svo.getS_title() %></option>
				<input id="qaS_Code" name="qaS_Code" style="visibility:none;"><%=qvo.getS_code() %>
<%
			}
		}
	}
%>
		</select>
	</div>
	<div class="form-group">
		<label for="exampleFormControlTextarea1">문의 내용</label>
		<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="qaContentInsert"></textarea>
	</div>
	<button class="w-100 btn btn-lg btn-primary" id="qaButton" type="submit">작성 완료</button>
</form>
