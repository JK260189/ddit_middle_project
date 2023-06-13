<%@page import="kr.or.ddit.member.dao.MemberDaoImpl"%>
<%@page import="kr.or.ddit.admin.dao.AdminDaoImpl"%>
<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%

String M_ID = (String)request.getAttribute("M_ID");
String M_PASS = (String)request.getAttribute("M_PASS");
   
if(M_ID.equals("admintest")){
	AdminVO adminVo = new AdminVO();
	adminVo.setAdmin_id(M_ID);
	adminVo.setAdmin_pass(M_PASS);
	AdminDaoImpl dao = AdminDaoImpl.getInstance();
	boolean adminCheck = dao.adminIdCheck(M_ID);
	boolean adminPassCheck = dao.adminPassCheck(M_PASS);
	if(adminCheck && adminPassCheck){
		AdminVO loginAdminVo = dao.getAdmininfo(adminVo);
		if(loginAdminVo!=null) {	
		session.setAttribute("loginAdminVo", loginAdminVo);
		}
	%>
		<script type="text/javascript">
		location.href="<%=request.getContextPath()%>/adminMainPage.do";
		</script>	
<% 	
}else{
 %>
<script type="text/javascript">
alert('아이디 또는 비밀번호가 틀렸습니다.');
history.go(-1);
</script>
 
<%  
	}
}else{
	MemberVO memVo = new MemberVO();
	memVo.setM_id(M_ID);
	memVo.setM_pass(M_PASS);
	
	MemberDaoImpl dao = MemberDaoImpl.getInstance();
	boolean check = dao.idCheck(M_ID);
	boolean passCheck = dao.passCheck(M_PASS);
	if(check && passCheck) {
		MemberVO loginMember = dao.getMemberinfo(memVo);
		if(loginMember!=null) {	
			session.setAttribute("LoginMember", loginMember);
		}
		%>
		<script type="text/javascript">
		location.href="<%=request.getContextPath()%>/memberMain.do";
		</script>	
		<% 	
		}else {	
		%>	
		<script type="text/javascript">
		alert('아이디 또는 비밀번호가 틀렸습니다.');
		history.go(-1);
		</script>
		<%
			}
		%>	
<%
}
%>		


	
		   
		
	
	


</head>
<body>

</body>
</html>