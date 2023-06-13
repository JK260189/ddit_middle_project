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
	System.out.println("QaBoard_View.jsp 진입 성공");
	// 게시물 내용 화면(수정화면X)
	int qa_code = Integer.parseInt(request.getParameter("qa_code"));
	System.out.println("qa_code 받음 : "+qa_code);
	
	//이전 작성 내용
	List<QaboardVO> list = (List<QaboardVO>) request.getAttribute("QaBoard_View");
	System.out.println("/qaBoardView.do 에서 보낸 리스트"+list);
	
	MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
	
	System.out.println("loginMemvo 값 : " + loginMemVo);
	
	int m_code = loginMemVo.getM_code();
	
	
	if(list==null||list.size()==0) {
		System.out.println("게시글 상세 내용 없음");
	%>
		<h2>게시글 내용이 존재하지 않습니다.</h2>
	<% 	
		
	} else{
		for(QaboardVO qvo : list) {
			System.out.println("게시글 상세 내용 진입 성공");
			
			if(qa_code == qvo.getQa_code()){
%>
<div id="main">
	<p class="title">1: 1 문의 게시글</p>
	<hr>
	<input type="hidden" id="qa_code" name="qa_code" value="<%=qa_code %>">
	<div id="totalBox">
		
			<label for="writer" class="writerLabel">글쓴이</label>
			<div id="writer" type="text" readonly="readonly" name="qaM_name"><%=loginMemVo.getM_name() %></div>
		
	<hr>	
		<div class="qaboardTitle">
			<label for="title" class="qaTitle">제목</label>
			<div type="text" id="qa_title" name="qa_title"><%=qvo.getQa_title() %></div>
		</div>
  
		<hr>
  
		<div class="packageSelect">
			<label for="title" class="checkedPackage">패키지 여행</label>
			<div type="text" id="qa_title">
		
		
<%
		IQABoardService service = QABoardServiceImpl.getQABoardService();

		List<ScheduleVO> stitle_list = (List<ScheduleVO>)service.selectSTitle(m_code);

		for(ScheduleVO svo : stitle_list) {
			System.out.println("선택한 패키지 여행");
			
			if(qvo.getS_code()==svo.getS_code()) {
	
%>
				<%=svo.getS_title() %></div>
<%
			}
		}
%>
			
		</div>
		<hr>
		<div class="qaboardContent">
			<label for="qa_content" class="qaContent">문의 내용</label>
			<textarea id="qa_content" name="qa_content" placeholder="문의 내용을 입력하십시오."readonly="readonly"><%=qvo.getQa_content() %></textarea>
<!-- <div id="result_qa_content" name="qa_content"><%=qvo.getQa_content() %></div>-->
		</div>

		<hr>
	
	<%
	
	IAnswerService ansService = AnswerServiceImpl.getAnswerService();
	
	List<AnswerVO> ansList = ansService.selectByAnswerList(qa_code);

	System.out.println("ansList 값 : "+ansList);

	for(AnswerVO ansVO : ansList){
		if(ansVO.getQa_code()==qa_code){
			
			%>
		<p class="answer_title">1: 1 문의 게시글 작성</p>
		<hr>
		<div id="answer_head"><p>답변</p> <p><%=ansVO.getAns_date() %></p>
			<div id="answer"><%=ansVO.getAns_content() %></div>
		</div>

		<%
					}
				}


			}
		}
	}
	
%>
	<div class="buttonArea">
	<button id="qaButtonInsert1" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글 수정 버튼" type="submit" onclick=location.href="<%=request.getContextPath() %>/qABoardUpdate.do?qa_code=<%=qa_code %>">수정</button>
	<button type="button"  id="qaButtonInsert2" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글 삭제 버튼"  onclick="memDelQaBoardByOne(this)">삭제</button>
	<button type="reset"  id="qaButtonInsert2" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글 목록 돌아가기 버튼" onclick=location.href="<%=request.getContextPath() %>/qABoardList.do">돌아가기</button>
	</div>
	</div>
</div>
<script src="<%=request.getContextPath() %>/js/admin_qaboard.js"></script>