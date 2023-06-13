<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8"/>
<title>Insert title here</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
	
	td { 
    border-spacing: 0px;
}
	th{
	font-size: 1.5rem;
}

</style>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.6.3.min.js"></script>

<script type="text/javascript">

$(function(){
	
	$(document).on("click", "#btnUpdate",function(){
		alert("게시글을 수정합니다.")
		var form = document.getElementById("noticeForm");
//		form.method = "GET";
		form.action = "<%=request.getContextPath()%>/noticeUpdate1.do";
		form.submit();
	});
	
	$(document).on("click", "#btnDelete", function(){
		var result = confirm("게시글을 삭제하시겠습니까?");
		if(result){
		    alert("게시글을 삭제합니다.");
		var form = document.getElementById("noticeForm");
		form.action = "<%=request.getContextPath()%>/noticeDelete.do";
		form.submit();
		}else{
		    alert("게시글로 돌아갑니다.");
		}
	});
	
	
	$(document).on("click", "#nList", function(){
		var form = document.getElementById("noticeForm");
		form.action = "<%=request.getContextPath()%>/noticeboard.do";
		form.submit();
	});
	
});

</script>
</head>
<body>
<% 	NoticeVO notiVo = (NoticeVO)request.getAttribute("noticeVo"); %>
<h1 class="mt-4">Board</h1>
<form name="noticeForm" id="noticeForm" >
	<input type="hidden" id="n_code" name="n_code" value="<%=notiVo.getN_code()%>">
	<input type="hidden" id="n_title" name="n_title" value="<%=notiVo.getN_title()%>">
	<input type="hidden" id="n_content" name="n_content" value="<%=notiVo.getN_content()%>">
	<input type="hidden" id="n_ddate" name="n_ddate" value="<%=notiVo.getN_ddate()%>">
<table border="1">
 <table class="table table-striped">
    
    <thead>
    <tr>
     <th style="width:300px"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=notiVo.getN_title()%></b></th><br>
    </tr>
</thread>	
	<tr>
		<td style="width:500px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=notiVo.getN_writer()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=notiVo.getN_ddate()%></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;조회수 :&nbsp;&nbsp;<%=notiVo.getN_count()+1%></td>
	</tr>
	

<tbody>
	
	<tr>
		<td colspan="1" style="text-align:center; width:500px;"><img src="<%=request.getContextPath() %>/imageView.do?n_code=<%=notiVo.getN_code() %>" width="400" height="300"></td>
		<td><pre><%=notiVo.getN_content()%></pre></td>
	</tr>
	
	<tr>
		
	</tr>
	<tr>
		
	</tr>
	
</tbody>

</table>
</table>
<table>
	<tr>
		<td colspan="2" style="float:right;">
			<input id="btnUpdate" type="button" value="수정"> 
			<input id="btnDelete" type="button" value="삭제"> 
			<input type="button" id="nList" value="글 목록"></td>
	</tr>
</table>
</form></body></html>