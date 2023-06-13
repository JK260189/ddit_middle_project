<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, 그리고 Bootstrap 기여자들">
    <meta name="generator" content="Hugo 0.104.2">
    <title>로그인</title>


<style type="text/css">

.w-btn-indigo-outline {
    border: 3px solid aliceblue;
    border-radius: 15px;
    
    width: 100px;
    height: 50px;
    
    margin: 5px;
    
    color: #1e6b7b;
    font-size: 20px;
    letter-spacing: 2px;
}

.w-btn-indigo-outline:hover {
    color: #1e6b7b;
    background: aliceblue;
}


</style>
    

    



    <!-- Favicons -->

<meta name="theme-color" content="#712cf9">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
      
      #loginForm{
 		margin-top: 100px;     
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>
  
<%
	// 세션 정보를 확인하기 위해 세션값을 구한다.
	// JSP문서에서 세션은 'session'이라는 이름으로 이미 생성되어 저장되어 있다.
	MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");	//session.setAttribute("LoginMember", loginMember);로 저장한 값 불러오기
	AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
%>

<%
	if(loginMemVo==null || loginAdminVo == null){
%>

<body class="text-center">
<br>
<br>
<br>
<form action="<%=request.getContextPath() %>/memberLogin.do" id = "loginForm">
	<main class="form-signin w-100 m-auto">	
    <h1 class="h3 mb-3 fw-normal">로 그 인</h1>

    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" style="width: 30%; margin-left: 35%;" placeholder="text" name="M_ID">
      <label for="floatingInput" style="margin-left: 35%;">ID</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" style="width: 30%;margin-left: 35%;" placeholder="Password" name="M_PASS">
      <label for="floatingPassword" style="margin-left: 35%;">Password</label>
    </div>

    <button class="w-btn-outline w-btn-indigo-outline" style="width: 30%" type="submit">로그인</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017–2023</p>
	</main>
</form>
<%
	} else{
%>

<!-- 로그인 되었을 때 나타날 영역 시작-->
	<h3><%=loginMemVo.getM_name() %>님 반갑습니다.</h3><br><br>
<!-- 로그인 되었을 때 나타날 영역 끝-->

<%} %>

  </body>
</html>