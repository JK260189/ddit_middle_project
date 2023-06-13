<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.member.service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	
	MemberServiceImpl service = MemberServiceImpl.getInstance();
	MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
	String id = loginMemVo.getM_id();
	int check = service.deleteMember(id);
	
	if(check > 0) {		
		session.invalidate();
%>
		<script>
			alert("회원 탈퇴가 정상처리되었습니다.");
			location.href="<%=request.getContextPath() %>/index.jsp";
		</script>
<%
	}else {
%>
		<script>
			alert("회원 탈퇴에 실패했습니다.");
			location.href="<%=request.getContextPath() %>/index.jsp";
		</script>
<%
	}
%>
