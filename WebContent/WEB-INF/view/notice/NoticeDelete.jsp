<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 삭제</title>
</head>
<body>
<script type="text/javascript">
	alert("공지사항 삭제가 정상처리되었습니다.");
	location.href="<%=request.getContextPath()%>/noticeboard.do";
</script>
</body>
</html>