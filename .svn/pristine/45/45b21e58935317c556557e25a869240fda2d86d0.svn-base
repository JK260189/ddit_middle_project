<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.notice.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

.board_subtitle #options{
/*    display: inline-block; */
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
</style>
<script type="text/javascript">
function Registration() {
	 location.href = "<%=request.getContextPath() %>/noticeRegistration.do";
}
</script>
<%
MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");	
MemberVO MemVo =  new MemberVO();
%>

   <div class="board_wrap">
      <div class="board_title">
         <strong>나의리뷰</strong>
      </div>
         <div class="board_subtitle">
         </div>
      
      
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
if(loginMemVo.getR_title() == null){
%>
<span>작성한 리뷰가 없습니다.</span>
<%
}else{
	for(int i= 0;  i < loginMemVo.getR_title().length(); i++ ){
		
%>
            
               
            <div>
               <div class="R_title"><a onclick="changeView(1)"><%=loginMemVo.getR_title() %></a></div>
               <div class="R_content"><%=loginMemVo.getR_content() %></div>           
            </div>
      
   <%
	}
}
%>      
            </div>
         <div class="board_page">
         <a href="#" class="bt first">◁◁</a>
         <a href="#" class="bt prev">◁</a>
         <a href="#" class="num on">1</a>
         <a href="#" class="num">2</a>
         <a href="#" class="num">3</a>
         <a href="#" class="num">4</a>
         <a href="#" class="num">5</a>
         <a href="#" class="bt next">▷</a>
         <a href="#" class="bt last">▷▷</a>
         </div>
         <div class="bt_wrap">
            <a onclick="Registration()" class="on">등록</a>
            <!-- <a href="#" >수정</a> -->
         
         </div>
      </div>
   </div>