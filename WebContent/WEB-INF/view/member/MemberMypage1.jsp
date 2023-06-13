<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script type="text/javascript">

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
<form action="<%=request.getContextPath() %>/memberUpdate.do?M_ID=<%=loginMemVo.getM_id() %>" method="post">
<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <div class="col-sm-2"></div>
                <div class="col-sm-9">
                    <h2 class="text-center">나의 정보 보기</h2>
                    <table class="table table-striped">
                      <tr>
                        <td>아이디</td>
                        <td><input type="text" value="<%= loginMemVo.getM_id() %>" name="" readonly style="border: none;"> </td>
                      </tr>
                       
                      <tr>
                        <td>이름</td>
                        <td><input type="text" value="<%= loginMemVo.getM_name() %>" name="M_NAME" readonly style="border: none;"></td>
                      </tr>
                      
                      <tr>
                        <td>비밀번호</td>
                        <td><input type="password" value="" id="pass1" name="M_PASS"></td>
                      </tr>
                      
                      <tr>
                        <td>비밀번호 확인</td>
                        <td><input type="password" value="" id="pass2" name=""></td>
                      </tr>
                       
                     <tr>
                        <td>주소</td>
                       <td><input type="text" value="<%= loginMemVo.getM_addr() %>" name="M_ADDR" id="M_ADDR" ></td>
                      </tr>
                       
                      <tr>
                        <td>이메일</td>
                       <td><input type="text" value="<%= loginMemVo.getM_email() %>" name="M_EMAIL" id="email"></td>
                      </tr>
                
                    <tr>
                         <td class="text-center" colspan="2">
<button id="전송" type="submit" class="btn btn-primary">수정완료</button>

                         </td>    
                    </tr> 
                 
                       
                    </table>
                    
                </div>
        </div> <!-- col-sm-12 -->
    </div><!-- row -->
</div> <!-- container end-->
</form>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
window.onload = function(){
    document.getElementById("M_ADDR").addEventListener("click", function(){ //주소입력칸을 클릭하면
        //카카오 지도 발생
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
                document.getElementById("M_ADDR").value = data.address; // 주소 넣기
                $('input[name=address_detail]').focus(); //상세입력 포커싱
            }
        }).open();
    });
    let password1 = document.getElementById('pass1');
    let password2 = document.getElementById('pass2');
    let email = document.getElementById('email');
$('#전송').on('click',function(e){
    if(password1.value !== password2.value){
        alert('비밀번호가 같지않습니다.')
        e.preventDefault();
    }if(password1.value.length < 6){
    	console.log(password1.value.length)
          alert('비밀번호 6자리 이상 입력해주세요')
        e.preventDefault();	
    }if(/\S+@\S+.\S+/.test(email.value) === false){
        alert('올바른 이메일형식이 아닙니다.')
        e.preventDefault();
   		}
	});
};

</script>
     
</body>
</html>