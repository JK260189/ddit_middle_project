<%@page import="kr.or.ddit.admin.answer.service.AnswerServiceImpl"%>
<%@page import="kr.or.ddit.admin.answer.vo.AnswerVO"%>
<%@page import="kr.or.ddit.admin.answer.service.IAnswerService"%>
<%@page import="kr.or.ddit.member.qaBoard.service.QABoardServiceImpl"%>
<%@page import="kr.or.ddit.member.qaBoard.service.IQABoardService"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.member.vo.QaboardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("/Admin_QABoardList.jsp 진입 성공");

	List<MemberVO> AllMemList = (List<MemberVO>)request.getAttribute("AllMemList");
	System.out.println("회원 정보 받기 성공 성공");
	
	IQABoardService service = QABoardServiceImpl.getQABoardService();
	
%>
	<div id="main">
	<p class="title">1 : 1 문의 게시판</p><br>
	<hr>
	<div id="qaboardListBox">
	<div id="qaboardAnswer2">
		<table id="qaboardTable2">
		<thead>
			<tr>
				<th>선택</th>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>작성일자</th>
				<th>조회수</th>
				<th>답변수</th>
				<th>삭제</th>
			</tr>
		</thead>
          
		<tbody>
<%	
	
	for(MemberVO mvo : AllMemList) {
		System.out.println("모든 회원 정보 뿌리기 성공");
		
		System.out.println("m_code 값 : "+mvo.getM_code());

		List<QaboardVO> qaList = (List<QaboardVO>)service.selectQaBoardList();
		
%>

	

<%
		System.out.println("if문 진입 이전");

		if(qaList==null || qaList.size()==0) {
			System.out.println("게시글 없음");
%>
		<tr>
			<td colspan="8">게시글이 존재하지 않습니다.</td>
		</tr>
<%
		} else {
			for(QaboardVO qvo : qaList) {
				System.out.println("게시글 있음");
				
				
				
				System.out.println("모든 회원들의 1:1 문의글 담기 성공");
				
				if(mvo.getM_code()==qvo.getM_code()){
					System.out.println("m_code 특정 성공");
				
				
				
				
%>
		<label>
			<tr>
				<td>
					<input type="checkbox" name="qaBoardSelectDel" id="qaBoardSelectDel" value="<%=qvo.getQa_code() %>">
				</td>
				<td id="qa_code"><%=qvo.getQa_code() %></td>
				<td>
					<a href="<%=request.getContextPath()%>/admin_QaBoardView.do?qa_code=<%=qvo.getQa_code() %>"><%=qvo.getQa_title() %></a>
				</td>
				<td ><%=mvo.getM_name() %>
					<input style="display:none;" id="m_code" value="<%=qvo.getM_code() %>">
				</td>
				<td><%=qvo.getQa_date() %></td>
				<td><%=qvo.getQa_count() %></td>
<%
	IAnswerService ansService = AnswerServiceImpl.getAnswerService();

	List<AnswerVO> ansList = ansService.selectByAnswerList(qvo.getQa_code());

	System.out.println("ansList 값 : "+ansList);
	int answerCount=0;
	for(AnswerVO ansVO : ansList){
		if(ansVO.getQa_code()==qvo.getQa_code()){
			answerCount= ansService.countAnswer_QaBoardByOne(qvo.getQa_code());
		}
	}
%>
              <td><%=answerCount %></td>
				<td>
					<button type="button" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="1:1 문의 게시글을 삭제합니다." id="qaButton" onclick="delQaBoardByOne(this)">삭제</button>
				</td>
			</tr>
		</label>
<%
				
				}
			}
		}
	}
%>
          </tbody>
        </table>
  
      <div class="buttonArea">
      <button type="button" id="qaButtonInsert1" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="체크박스 선택한 게시글 삭제" onclick="selectQaBoardDel(this)">선택 삭제</button>
      <button type="button" id="qaButtonInsert1" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="체크박스 선택한 게시글 삭제" type="reset" onclick=location.href="<%=request.getContextPath() %>/index.do">취소</button>
      </div>
</form>
</div>
</div>
</div>
      
