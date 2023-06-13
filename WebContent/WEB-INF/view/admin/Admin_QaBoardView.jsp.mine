<%@page import="kr.or.ddit.admin.answer.service.AnswerServiceImpl"%>
<%@page import="kr.or.ddit.admin.answer.service.IAnswerService"%>
<%@page import="kr.or.ddit.admin.answer.vo.AnswerVO"%>
<%@page import="kr.or.ddit.member.qaBoard.service.QABoardServiceImpl"%>
<%@page import="kr.or.ddit.member.qaBoard.service.IQABoardService"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.vo.ScheduleVO"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.member.vo.QaboardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	System.out.println("Admin_QaBoard_View.jsp 진입 성공");
	// 게시물 내용 화면(수정화면X)
	
	//이전 작성 내용
	List<QaboardVO> list = (List<QaboardVO>) request.getAttribute("Admin_QaBoard_View");
	
	int qa_code = (int)request.getAttribute("qa_code");
	
	int m_code = (int)request.getAttribute("m_code");
	
	
	IQABoardService service = QABoardServiceImpl.getQABoardService();
	
	if(list==null||list.size()==0) {
		System.out.println("게시글 상세 내용 없음");
	%>
		<h2>게시글 내용이 존재하지 않습니다.</h2>
	<% 	
		
	} else{
		int s_code=0;
		
		for(QaboardVO qvo : list) {
			System.out.println("게시글 상세 내용 진입 성공");
			
			List<ScheduleVO> stitle_list = (List<ScheduleVO>)service.selectSTitle(m_code);
			
			s_code=qvo.getS_code();
			
%>
<div id="main">
	<p class="title">1: 1 문의 게시글 작성</p>
	<hr>
	<input type="hidden" id="qa_code" name="qa_code" value="<%=qa_code %>">
	
	<div id="totalBox">

		<label for="writer" class="writerLabel">글쓴이</label>
		<div type="text" readonly id="writer" name="qaM_name"><%=m_code %></div>

	
    <hr>	
	<div class="qaboardTitle">
		<label for="title" class="qaTitle">제목</label>
		<div type="text" id="qa_title" name="qa_title">><%=qvo.getQa_title() %></div>
	</div>
  
	<div class="packageSelect">
		<label for="title" class="checkedPackage">패키지 여행</label>
		<div type="text" id="qa_title">
<%
		for(ScheduleVO svo : stitle_list) {
			System.out.println("선택한 패키지 여행");
			
			if(s_code==svo.getS_code()) {
	
%>
		<%=svo.getS_title() %>
<%
			}
		}
%>
		</div>
	</div>


	<hr>
	<div class="qaboardContent">
		<label for="qa_content" class="qaContent">문의 내용</label>
		<div id="qa_content" name="qa_content"><%=qvo.getQa_content() %></div>
	</div>
	
	<hr>
	<div id="answer_head"><p>답변</p>
	<%
	
		IAnswerService ansService = AnswerServiceImpl.getAnswerService();
	
		List<AnswerVO> ansList = ansService.selectByAnswerList(qa_code);
	
		System.out.println("ansList 값 : "+ansList);
	
		for(AnswerVO ansVO : ansList){
			if(ansVO.getQa_code()==qa_code){
			
	%>
	<div>답변 │ 답변일(<%=ansVO.getAns_date() %>)
		<div><%=ansVO.getAns_content() %>
		</div>
		<input type="hidden" id="ans_code" name="ans_code" value="<%=ansVO.getAns_code() %>">
		<button type="button" class="w-100 btn btn-lg btn-primary" id="qaButton" onclick="delQaBoard_AnswerByOne(this)">삭제</button>
	</div>
<%
			}
		
		}

		}
	}
	System.out.println("qa_code 값 : "+qa_code);
%>
	<hr>
	<div id="answerBox">
		<div id="answer">
			<p>답변 입력 형식</p>
			<form method="post">
				<textarea id="answerContent" rows="10" cols="100" placeholder="답변을 입력하십시오."></textarea>

				<button type="button" class="w-100 btn btn-lg btn-primary" id="iqaButton" onclick="insertAnswer(this)">답변 완료</button>
			</form>
		</div>
		
	</div>

	
	
	<button type="button" class="w-100 btn btn-lg btn-primary" id="qaButton" onclick="delQaBoardByOne(this)">삭제</button>
	<button class="w-100 btn btn-lg btn-primary" id="qaButton" type="reset" onclick=location.href="<%=request.getContextPath() %>/qABoardList.do">취소</button>