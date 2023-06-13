
<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
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
   font-size: 3rem;
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

<button type="button" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="버튼 설명">버튼</button>
</style>

<script>
function changeView(){
	location.href = "<%=request.getContextPath()%>/noticeboard.do";
	
}


</script>
<%
AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");

%>

<body>
	<form action="<%=request.getContextPath() %>/noticeInsert.do" method="post" enctype="multipart/form-data">
   <div class="board_wrap">
      <div class="board_write_title">
         <strong>공지 글쓰기</strong>
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
               <dt>제목</dt>
               <dd><input type="text" name="title" class="form-control" id="Title" placeholder="제목 입력 " ></dd>
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
               <dt>글쓴이</dt>
               <dd><input type="text" value="<%=loginAdminVo.getAdmin_id() %>" name="writer" placeholder="로그인한관리자"></dd>
            </dl>
         </div>
                  
         <div class="content">
          <pre><textarea placeholder="" name="content" id="Content"></textarea></pre>
          </div>
          
           </div>
   
         <div class="bt_wrap">
            <button type="submit" class="on 등록 w-btn-outline w-btn-indigo-outline" id="sub">등록</button>
            <button type="button" onclick="changeView()" class="btn-outline w-btn-indigo-outline">취소</button> 
         
      </div>
   </div>
  </form>
  <script type="text/javascript">
  
  $('.등록').on('click',function (e){
	    let title = document.getElementById('Title')
	    let content = document.getElementById('Content')
	    if(title.value === '' || content.value  === ''){
	        alert('제목이나 내용을 입력해주세요');
	        e.preventDefault();
	        return;
	    }
	});
  
  </script>