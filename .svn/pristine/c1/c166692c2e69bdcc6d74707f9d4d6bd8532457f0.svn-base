<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script>
function MainPage(){
	location.href="<%=request.getContextPath()%>/index.do";
}

</script>
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
			<form id="top-search" role="search">

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


			<div class="top-right">
				<div class="top-letters">
					<a href="<%=request.getContextPath() %>/memberLogin1.do" class="login">로그인</a>&nbsp;
					<a href="<%=request.getContextPath() %>/memberJoin1.do">회원가입</a>&nbsp;
					<a href="#">고객센터</a>
				</div>
					
				<div class="top-right-button">
					<div class="top-btn-in">
						<div class="fs-2 mb-3">
							<div class="top-icon-1" onclick=""> <!-- 마이메뉴 경로 --------------------    -->
								<svg id="myMenu" xmlns="http://www.w3.org/2000/svg" width="100%" height="100%" fill="currentColor" class="bi bi-airplane" viewBox="0 0 16 16">
									<path d="M6.428 1.151C6.708.591 7.213 0 8 0s1.292.592 1.572 1.151C9.861 1.73 10 2.431 10 3v3.691l5.17 2.585a1.5 1.5 0 0 1 .83 1.342V12a.5.5 0 0 1-.582.493l-5.507-.918-.375 2.253 1.318 1.318A.5.5 0 0 1 10.5 16h-5a.5.5 0 0 1-.354-.854l1.319-1.318-.376-2.253-5.507.918A.5.5 0 0 1 0 12v-1.382a1.5 1.5 0 0 1 .83-1.342L6 6.691V3c0-.568.14-1.271.428-1.849Zm.894.448C7.111 2.02 7 2.569 7 3v4a.5.5 0 0 1-.276.447l-5.448 2.724a.5.5 0 0 0-.276.447v.792l5.418-.903a.5.5 0 0 1 .575.41l.5 3a.5.5 0 0 1-.14.437L6.708 15h2.586l-.647-.646a.5.5 0 0 1-.14-.436l.5-3a.5.5 0 0 1 .576-.411L15 11.41v-.792a.5.5 0 0 0-.276-.447L9.276 7.447A.5.5 0 0 1 9 7V3c0-.432-.11-.979-.322-1.401C8.458 1.159 8.213 1 8 1c-.213 0-.458.158-.678.599Z"/>
								</svg>
								<p>마이메뉴</p>
							</div>
						

							
						</div>
					</div>
				</div>
			</div>
				
		</div>
	</div>
	
	
	<div id="selectMenu">
	<nav class="container d-flex flex-column flex-md-row justify-content-between">
    	<a class="py-2 d-none d-md-inline-block" href="<%=request.getContextPath()%>/product/doProductList.do\">국내패키지상품</a>
    	<a class="py-2 d-none d-md-inline-block" href="<%=request.getContextPath()%>/product/foProductList.do\">해외패키지상품</a>
    	
  </nav>
</div>
	
	
	</nav>
</div>


