<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
   alert("게시글 등록을 실패했습니다.");
   
   location.href="<%=request.getContextPath()%>/qABoardList.do";
</script>



</body>
</html>