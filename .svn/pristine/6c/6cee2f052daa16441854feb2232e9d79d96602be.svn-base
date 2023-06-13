<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<script type="text/javascript">
function Update() {
	location.href = "<%=request.getContextPath() %>/mypage1.do";
}
function Delete() {
	location.href = "<%=request.getContextPath() %>/deletepage.do";
}
</script>
    <!-- 1.데이터 베이스에서 한회원의 정보를 가져옴 2. table태그를 이용하며 화면에 회원의 정보를 출력 -->
<%

MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");	

%>
<div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="#">Macaronics.net</a>
        </div>     
</div>
 
<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="col-sm-2"></div>
                <div class="col-sm-9">
                    <h2 class="text-center">나의 정보 보기</h2>
                    <table class="table table-striped">
                      <tr>
                        <td>아이디</td>
                        <td><%= loginMemVo.getM_id() %></td>
                      </tr>
                       
                      <tr>
                        <td>이름</td>
                        <td><%= loginMemVo.getM_name() %></td>
                      </tr>
                       
                     <tr>
                        <td>주소</td>
                        <td><%= loginMemVo.getM_addr() %></td>
                      </tr>
                       
                      <tr>
                        <td>이메일</td>
                        <td><%= loginMemVo.getM_email() %></td>
                      </tr>
                       
                    <tr>
                         <td class="text-center" colspan="2">
<button onclick="Update()" class="btn btn-primary">나의정보수정</button>
<button onclick="Delete()" class="btn btn-danger">회원탈퇴</button>

                         </td>    
                    </tr> 
                 
                       
                    </table>
                </div>
        </div> <!-- col-sm-12 -->
    </div><!-- row -->
</div> <!-- container end-->
     
     
</body>
</html>