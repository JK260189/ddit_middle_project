<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.member.qaBoard.service.QABoardServiceImpl"%>
<%@page import="kr.or.ddit.member.qaBoard.service.IQABoardService"%>
<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>하나모두노랑풍선투어</title>

<%-- 공통 부분  --%>
	<jsp:include page="/layout/common_lib.jsp" flush="false"/>	

</head>
<body>
<header>
<%
	// 상단 다른 새로운 요소 없으면 고정 요소 사용
	String topPage = (String)request.getAttribute("topPage");
	if(topPage == null || "".equals(topPage)) topPage = "/layout/header_base.jsp";
	
	String leftPage = (String)request.getAttribute("leftPage");
	if(leftPage == null || "".equals(leftPage)) {
// 		System.out.println("홈 페이지 진입 성공");
// 		request.setCharacterEncoding("utf-8");
		
// 		IQABoardService service = QABoardServiceImpl.getQABoardService();
		
// 		List<AdminVO> adminInfoList = service.selectAdminInfo();
// 		System.out.println("adminInfoList 값 : "+adminInfoList);
// 		List<MemberVO> memInfoList = service.selectMemberInfo();
// 		System.out.println("memInfoList 값 : " +memInfoList);

		
		// 로그인 정보
		AdminVO currAdVo = (AdminVO) session.getAttribute("loginAdminVo");
		System.out.println("관리자 정보 : "+currAdVo);
		MemberVO currMemVo = (MemberVO) session.getAttribute("LoginMember");
		System.out.println("회원 정보 : "+currMemVo);
		
			// 관리자
			if(currAdVo!=null) {
// 				System.out.println("관리자 정보 찾기");
// 				int a_code = currAdVo.getAdmin_code();
// 				System.out.println("a_code 값 : "+a_code);
// 				String a_id = "";
// 				// 로그인 유효성 확인
// 				for(AdminVO avo : adminInfoList) {
// 					if(a_code == avo.getAdmin_code()) {
// 						// 있으면 관리자
// 						a_id = avo.getAdmin_id();
// 						System.out.println("a_id 값 : "+a_id);
// 						request.setAttribute("a_code", a_code);
// 						request.setAttribute("a_id", avo.getAdmin_id());
// 						request.setAttribute("a_pass", avo.getAdmin_pass());
// 					}
// 				}
// 				System.out.println("관리자 아이디 유무 확인");
				
// 				if(a_id!=null) {
					leftPage = "/layout/Leftpage_Admin.jsp";
// 				}
				
				
			} else if (currMemVo!=null) {

// 				System.out.println("회원 정보 찾기");
// 				// 회원
// 				int m_code = currMemVo.getM_code();
// 				String m_name = "";
// 				for(MemberVO mvo : memInfoList) {
// 					if(m_code == mvo.getM_code()) {
// 						m_name = mvo.getM_name();
// 						request.setAttribute("m_code", m_code);
// 						request.setAttribute("m_name", mvo.getM_name());
// 					}
// 				}
				
// 				System.out.println("회원 아이디 유무 확인");
// 				if(m_name!=null) {
					leftPage = "/layout/Leftpage_Mem.jsp";
					
				
				
// 			}

		} else {
			leftPage = "/layout/Leftpage_empty.jsp";
		}
	}
		
	
	String viewPage = (String)request.getAttribute("viewPage");
	if(viewPage == null || "".equals(viewPage)) viewPage = "/WEB-INF/view/main/main.jsp";

%>
	<%-- 기본 header_base.jsp --%>
	<jsp:include page="<%=topPage %>" flush="false"/>
</header>

<div id="body-wrapper">
	<%-- 메뉴 바 --%>

	<jsp:include page="<%=leftPage %>" flush="false"/>
	

<main>
	<div id="body-content">
	<%-- 기본 main.jsp --%>
	<jsp:include page="<%=viewPage %>" flush="false"/>
	</div>
</main>

<!-- FOOTER -->
<footer id="footer">
	<p>&copy; 2022년 11월 306호 중급 프로젝트 </p>
	<button class="w-btn-neon2" type="button">
        <p class="float-end"><a href="#">Back to top</a></p>
    </button>
    <div id="tempBlank"></div>
    <div
 		 id="kakao-talk-channel-add-button"
 		 data-channel-public-id="_SqaRb"
 		 data-size="small"
 		 data-support-multiple-densities="true"
	></div>	
</footer>
</div>
</body>
<script>
  window.kakaoAsyncInit = function() {
    Kakao.Channel.createAddChannelButton({
      container: '#kakao-talk-channel-add-button',
    });
  };

  (function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = 'https://t1.kakaocdn.net/kakao_js_sdk/2.1.0/kakao.channel.min.js';
    js.integrity = 'sha384-MEvxc+j9wOPB2TZ85/N6G3bt3K1/CgHSGNSM+88GoytFuzP4C9szmANjTCNfgKep';
    js.crossOrigin = 'anonymous';
    fjs.parentNode.insertBefore(js, fjs);
  })(document, 'script', 'kakao-js-sdk');
</script>
</html>