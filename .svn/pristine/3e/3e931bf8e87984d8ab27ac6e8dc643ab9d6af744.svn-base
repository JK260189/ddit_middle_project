
<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
<style>
.board_wrap{
   width: 1200px;
   margin: 0px auto;
}
.board_write_title{
   text-align: center;
   margin-bottom: 30px;
   
}
.board_write_title strong {
   font-size: 1.5rem;
}

.board_write{
   border-top: 2px solid #000;
}

.board_write .title{
   border-bottom: 1px dashed #ddd;
}

.board_write .photo{
   border-bottom: 1px dashed #ddd;
}

.board_write .photo img{
   width: 50px;
   height: 50px;
}

.board_write .title,
.board_write .info,
.board_write .photo{
   padding: 15px;
}

.board_write .info{
   
   border-bottom: 1px solid #000;
   font-size: 0; /* 확인필요 */
}

.board_write .title dl{
   font-size: 0;
}


.board_write .info dl{
   display: inline-block;
   width: 50%;
   vertical-align: middle;
}

.board_write .title dt,
.board_write .title dd,
.board_write .photo dt,
.board_write .photo dd,
.board_write .info dt,
.board_write .info dd{
   /* background: blue; */
   display: inline-block;
   vertical-align: middle;
   font-size: 1.0rem;
   
}
.board_write .title dt,
.board_write .photo dt,
.board_write .info dt{
   width: 100px;
}
.board_write .title dd{
   width: calc(100% - 100px);
}

.board_write .title input[type="text"],
.board_write .info input[type="text"],
.board_write .info input[type="password"]{
   padding: 10px;
}

.board_write .title input[type="text"]{
   width: 80%;
}

.board_write .content{
   border-bottom:  1px solid #000;
}

.board_write .content textarea{
   display: block;
   width: 100%;
   height: 300px;
   padding: 15px;
   box-sizing: border-box;
   border: 0;
   resize: vertical;
}


.bt_wrap{
   margin-top: 30px;
   text-align: center;
   font-size: 0;
   
}
.bt_wrap a{
   display: inline-block;
   min-width: 80px;
   margin-left:10px;
   padding: 10px;
   border: 1px solid #000;
   border-radius: 2px;
   font-size: 1.4rem;
}

.bt_wrap a:first-child {
   margin-left: 0; /*넌 옆으로 멀어지지 말아라*/
}

.bt_wrap a.on{ /*버튼 활성화*/
   background: #000;
   color: #fff;
}

.btnplace{
	float: right;
}

<button type="button" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="버튼 설명">버튼</button>
</style>


	


<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.6.3.min.js"></script>

<script type="text/javascript">



	$(document).on("click", "#nList", function(){
	var form = document.getElementById("noticeForm");
	form.action = "<%=request.getContextPath()%>/noticeboard.do";
	form.submit();
	});

	

</script>
</head>
<body>
<%
	NoticeVO noticeVo = (NoticeVO)request.getAttribute("noticeVo");
	AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
%>
<h2>공지사항 수정</h2>
<form action="<%=request.getContextPath()%>/noticeUpdate.do" method="post" enctype="multipart/form-data" name="noticeForm" id="noticeForm">
	<input type="hidden" name="n_code" value="<%=noticeVo.getN_code()%>">
	<input type="hidden" name="old_photo" value="<%=noticeVo.getN_image()%>">
<table border="1">
<tbody>
	 <div class="board_wrap">
      <div class="board_write_title">
         <strong>공지사항 글 수정</strong>
      </div>
      
      <div class="board_write_wrap">
         <div class="board_write">
         
         <div class="title">
            <dl>
               <dt>게시판 구분</dt>
               <dd>공지사항</dd>
            </dl>
         </div>
         <div class="title">
            <dl>
               <dt><b>글 제목</b></dt>
               <dd><input type="text" name="n_title" class="form-control" value="<%=noticeVo.getN_title()%>" ></dd>
            </dl>
         </div>
         
         <div class="photo">
            <dl>
               <dt>사진</dt>
               <dd><input type="file" name="n_image"></dd>
            </dl>
         </div>
         
         <div class="info">
            <dl>
               <dt>작성자 </dt>
               <dd><input type="text" value="<%=loginAdminVo.getAdmin_id() %>" name="writer" placeholder="로그인한관리자"></dd>
            </dl>
         </div>
                  
         
         <tr>
         	<td>글 내용</td>
            <td><textarea rows="15" cols="150" class="content" name="n_content"><%=noticeVo.getN_content()%></textarea><br></td>
        </tr>	
         
      </div>
   </div>
	
</tbody>
</table>

<table>

		<tr>
		<td colspan="2" style="text-align:center;">
			<button type="submit" value="저장">저장</button> 
			<input type="button" id="nList" value="글 목록"></td>
		</tr>
</table>
</form>

</body>
</html>