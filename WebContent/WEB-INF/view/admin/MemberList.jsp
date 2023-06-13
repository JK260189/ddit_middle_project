<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>회원목록</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.1/css/bootstrap.min.css" integrity="sha512-Ez0cGzNzHR1tYAv56860NLspgUGuQw16GiOOp/I2LuTmpSK9xDXlgJz3XN4cnpXWDmkNBKXR/VDMTCnAaEooxA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.1/js/bootstrap.min.js" integrity="sha512-EKWWs1ZcA2ZY9lbLISPz8aGR2+L7JVYqBAYTq5AXgBkSjRSuQEGqWx8R1zAX16KdXPaCjOCaKE8MCpU0wcHlHA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script type="text/javascript">


function AdminMemberDelete(btn){
	if(confirm('정말 삭제 하시겠습니까')){
		let a = prompt('아이디를 입력해주세요');
		let $trTag = $(btn).closest(".member");
		let id = $trTag.find("input[name='M_ID']").val() ;
		if(a == id){
			location.href="<%=request.getContextPath()%>/memberAdminDelete.do?M_ID=" + id;
		}else{
			alert('아이디가 맞지 않습니다.')
			btn.preventDefault();
		}
		
    }
	
}

function AdminMemberModify(btn){
	let $trTag = $(btn).closest(".member");
// 	console.log($trTag.find("input[name='M_ID']").val() )
	$("#M_ID").val( $trTag.find("input[name='M_ID']").val() );
	$("#M_PASS").val( $trTag.find("input[name='M_PASS']").val() );
	$("#M_NAME").val( $trTag.find("input[name='M_NAME']").val() );
	$("#M_EMAIL").val( $trTag.find("input[name='M_EMAIL']").val() );
	$("#M_ADDR").val( $trTag.find("input[name='M_ADDR']").val() );
	
	$("#modifyForm").submit();
	
}

</script>
</head>
<body>
<%

List<MemberVO> memlist = (List<MemberVO>)request.getAttribute("memList");
MemberVO MemVo = new MemberVO();
%>

<form action="<%=request.getContextPath()%>/memberModify.do" id="modifyForm" method="post">
	<input type="hidden"  id="M_ID" name="M_ID" >
    <input type="hidden"  id="M_PASS" name="M_PASS">
    <input type="hidden"  id="M_NAME" name="M_NAME">
    <input type="hidden"  id="M_EMAIL" name="M_EMAIL">
    <input type="hidden"  id="M_ADDR" name="M_ADDR"> 
</form>

<div style="padding-top: 70px">
<table class="table">
 <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">비밀번호</th>
      <th scope="col">이름</th>
      <th scope="col">이메일</th>
      <th scope="col">주소</th>
    </tr>
  </thead>
   <tbody>
<%
if(memlist == null || memlist.size() == 0){
%>
<tr><td colspan="7" style="text-algne:center;"> 저장된 회원이 하나도 없습니다.</td></tr>


<%
}else{
	for(MemberVO memVo : memlist){
		
%>


  
  
    <tr class="member">
      <td><input type="text" value="<%=memVo.getM_id() %>" readonly name="M_ID" style="border: none;"> </td>
      <td><input type="text" value="<%=memVo.getM_pass() %>" readonly name="M_PASS" style="border: none;"> </td>
      <td><input type="text" value="<%=memVo.getM_name() %>" readonly name="M_NAME" style="border: none;"> </td>
      <td><input type="text" value="<%=memVo.getM_email() %>" readonly name="M_EMAIL" style="border: none;"> </td>
      <td><input type="text" value="<%=memVo.getM_addr() %>" readonly name="M_ADDR" style="border: none;"> </td>	
      <td><button type="button" onclick="AdminMemberModify(this)">수정</button> 
      	  <button type="button" onclick="AdminMemberDelete(this)">삭제</button> </td>
    </tr>
  

<%
	}
	%>
	
<%
}
%>
		</tbody>
	</table>
</div>

<script type="text/javascript">

</script>


</body>
</html>