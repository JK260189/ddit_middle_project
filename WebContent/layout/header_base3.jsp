<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script>
function MainPage(){
	location.href="<%=request.getContextPath()%>/adminMainPage.do";
}
</script>
<%

AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");

%>
<%-- 로그인 전 화면 상단 고정 --%>
<div id="container-header">
	<nav class="navbar navbar-expand-md navbar-dark fixed-top  bg-white">
		<div class="container-fluid">
			<div id="top-left">
			<img id="top-logo" src="http://localhost/MiddleTermProject/images/logo.jpg" onclick="MainPage()">
			</div>
			
			<div class="collapse navbar-collapse" id="navbarCollapse">
			<div class="top-blank"></div>
			
			<!-- 검색 -->	
			<form id="top-search" role="search" >

				<input type="text" class="form-search" placeholder="검색어를 입력해 주세요" name="search">

				<button type="button" class="btn btn-outline-secondary">
					<span class="search-btn" id="search-ico">
						<svg xmlns="http://www.w3.org/2000/svg" width="2em" height="2rem" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
							<path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
						</svg>
					</span>
				</button>
			</form>


			<div class="top-blank"></div>


			<div class="top-right" style = "float:right" >
				<div class="top-letters">
					<a href="<%=request.getContextPath() %>/noticeboard.do" style="font-size: 0.8em">공지게시판</a>&nbsp;
					<a href="<%=request.getContextPath() %>/memberLogout.do" style="font-size: 0.8em">로그아웃</a>&nbsp;
					<a href="<%=request.getContextPath() %>/memberList.do" style="font-size: 0.8em">회원정보</a>&nbsp;
				</div>
					
				
			</div>	
		</div>
	</div>



<div id="selectMenu">
	<nav class="container d-flex flex-column flex-md-row justify-content-between">
    	<a class="py-2 d-none d-md-inline-block" href="<%=request.getContextPath()%>/product/doProductList.do">국내패키지상품</a>
    	<a class="py-2 d-none d-md-inline-block" href="<%=request.getContextPath()%>/product/foProductList.do">해외패키지상품</a>
    
  </nav>
</div>

	</nav>
</div>