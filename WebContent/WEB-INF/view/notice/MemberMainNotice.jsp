<%@page import="kr.or.ddit.notice.vo.Paging"%>
<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    
<style type="text/css">
*{
   margin: 0;
   padding: 0;
}

html{
   font-size:10px;
}

ul, li{
   list-style: none;
}
a{
   text-decoration: none;
   color: inherit;
}
/*------------------------------*/
.board_wrap{
   width: 1200px;
   margin: 0px auto;
}
.board_title{
   margin-bottom: 30px;
   
}
.board_title strong {
   font-size: 3rem;
}


.board_subtitle p{
   
   margin-top: 15px;
   font-size: 1.4rem;
}



.bt_wrap{
   margin-top: 30px;
   text-align: center;
   font-size: 0;
   
}
/**/
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

/* 보드 리스트 */
.board_list{
   width: 100%;
   border-top: 2px solid #000;
}

.board_list > div{
   border-bottom: 1px solid #ddd;
   font-size: 0;
}

.board_list > div.top{
   border-bottom: 1px solid #999;
}
.board_list > div.top{
   border-bottom: 1px solid #999;
}

.board_list > div > div{
   display: inline-block;
   padding: 15px 0;
   text-align:center;
   font-size: 1.4rem;
}

.board_list > div.top > div{
   font-weight: 600;
}

.board_list .num{
   width: 10%;
   
}
.board_list .title{
   width: 60%;
   text-align: left;
   
}
.board_list .top .title{
   text-align: center;
}

.board_list .writer{
   width: 10%;
   
}
.board_list .date{
   width: 10%;
   
}
.board_list .count{
   width: 10%;
   
}

/*페이지*/

.board_page{
   margin-top: 30px;
   text-align: center;
   font-size: 0;
}

.board_page a{
   display: inline-block;
   width: 32px;
   height: 32px;
   box-sizing: border-box;
   vertical-align: middle;
   border: 1px solid #ddd;
   border-left: 0;
   line-height: 100%;
}

.board_page a.bt{
   padding-top: 10px;
   font-size: 1.2rem;
   letter-spacing: -2px;
}
.board_page a.num{
   padding-top: 9px;
   font-size: 1.4rem;
}

.board_page a.num.on{
   border-color: #000;
   background: #000;
   color: #fff;
}

.board_page a:first-child {
   border-left: 1px solid #ddd;
}

.pagingMove{
	width: 100px;
    margin-left:40%;
   	display:flex;
}

.pagebtn{
/* 	display:flex; */
	padding:10px 5px ;
}


<button type="button" class="w-btn-outline w-btn-indigo-outline" data-bs-toggle="popover" title="버튼 설명">버튼</button>


</style>
<script type="text/javascript">
function Registration() {
	 location.href = "<%=request.getContextPath()%>/noticeRegistration.do";
}

function changeView(value){
	location.href = "<%=request.getContextPath()%>/noticeView.do?n_code=" + value;
	
}
</script>
<%
List<NoticeVO> noticelist = (List<NoticeVO>)request.getAttribute("noticeList");
Paging paging = (Paging) request.getAttribute("paging");
NoticeVO noticeVO = new NoticeVO();
%>

   <div class="container mt-3">
  <table class="table">
    
    </table>
      <div class="board_list_wrap">
         <div class="board_list">
            <div class="top">
               <div class="num">번호</div>
               <div class="title">제목</div>
               <div class="writer">작성자</div>
               <div class="date">작성일</div>
             <div class="count">조회</div>
            </div>
<%
if(noticelist == null || noticelist.size() == 0){
%>
<tr><td colspan="7" style="text-algne:center;"> 저장된 게시글이 하나도 없습니다.</td></tr>
<%
}else{
	for(NoticeVO noticevo : noticelist){
		
%>
             
            <div>
               <div class="num"><%=noticevo.getN_code() %></div>
               <div class="title"><a onclick="changeView(<%=noticevo.getN_code()%>)"><%=noticevo.getN_title() %></a></div>
               <div class="writer"><%=noticevo.getN_writer() %></div>
               <div class="date"><%=noticevo.getN_ddate() %></div>
               <div class="count"><%=noticevo.getN_count() %></div>               
            </div>
   <%
	}
}
%>

<div class="pagingMove">

	  <%       
 			if(paging.isPrev()) {
	  %>
	  
      		<div class="pagebtn">
      		<button type="button"  onclick="location.href='<%=request.getContextPath()%>/noticeboard.do?page=<%=paging.getBeginPage() - 1%>'" class="w-btn-outline w-btn-indigo-outline">◁</button>
	  		</div>
	  <%
 			}for (int i = paging.getBeginPage(); i <= paging.getEndPage(); i++) {
            if (i == paging.getPage()) {
      %>	
      		
      		<div class="pagebtn">
      		<button type="button" onclick="location.href='<%=request.getContextPath()%>/noticeboard.do?page=<%=i%>'" class="w-btn-outline w-btn-indigo-outline"><%=i%></button>
      		</div>
      <%
             }else {
      %>
      		<div class="pagebtn">
             <button type="button"  onclick="location.href='<%=request.getContextPath()%>/noticeboard.do?page=<%=i%>'" class="w-btn-outline w-btn-indigo-outline"><%=i%></button>
     		</div>
      <%
             }
            
        	 }if (paging.isNext()) {
      %>
      		<div class="pagebtn">
     		<button type="button"  onclick="location.href='<%=request.getContextPath()%>/noticeboard.do?page=<%=paging.getEndPage() + 1%>'" class="w-btn-outline w-btn-indigo-outline">▷</button>
			</div>
	  <%
      }
      %>
            
      </div>
   </div>
</div>
