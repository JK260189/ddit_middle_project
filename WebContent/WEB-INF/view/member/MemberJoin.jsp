<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>DDIT 여행사 회원가입</title>
  <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
  <script type="text/javascript">
      function idCheck() {
          let userId = $('.input_id').val();
          $.ajax({
              url : "<%=request.getContextPath()%>/idChechServlet.do",
              type : "post",
              data : {userId : userId},
              dataType : "json",
              success : function(result){
                  if(result){
                      $('#checkId').html('사용할수없는 아이디입니다');
                  }else{
                      $('#checkId').html('사용가능합니다.');
                      $('#전송').attr('disabled',false);
                  }
              },
              error : function () {
                  alert('서버요청실패');
              }
          })
      }
  </script>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

  <style type="text/css">
      body {
          min-height: 100vh;

          background: -webkit-gradient(linear, left bottom, right top, from(#92b5db), to(#1d466c));
          background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
          background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
          background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
          background: linear-gradient(to top right, #92b5db 0%, #1d466c 100%);
      }

      .input-form {
          max-width: 680px;

          margin-top: 80px;
          padding: 32px;

          background: #fff;
          -webkit-border-radius: 10px;
          -moz-border-radius: 10px;
          border-radius: 10px;
          -webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
          -moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
      }


  </style>
</head>
<body>

<div class="input-form-backgroud row">
  <div class="input-form col-md-12 mx-auto">
    <h4 class="mb-3">회원가입</h4>
    <form action="<%=request.getContextPath() %>/memberInsert.do" method="post" class="validation-form" novalidate>

      <div class="row">
        <div class="col-md-12 mb-3">
          <label for="ID">회원ID</label><button onclick="idCheck()" type="button" class="btn btn-info" style="margin-left: 50px">중복체크</button>
          <span id="checkId"></span>
          <input type="text" class="form-control input_id" id="id" name="M_ID" placeholder="" value="" required>
          <div class="invalid-feedback">
            회원 ID 입력해주세요
          </div>
        </div>
      </div>

      <div class="mb-3">
        <label for="email">비밀번호</label>
        <input type="password" class="form-control" id="pass" name="M_PASS" placeholder="*****" required>
        <div class="invalid-feedback">
          비밀번호 입력해주세요
        </div>
      </div>

      <div class="mb-3">
        <label for="email">비밀번호확인</label>
        <input type="password" class="form-control" id="password2" placeholder="*****" required>
        <div class="invalid-feedback">
          비밀번호 입력해주세요
        </div>
      </div>

      <div class="mb-3">
        <label for="address">주소</label>
        <input type="text" class="form-control" id="M_ADDR" name="M_ADDR" placeholder="서울시 강남구" required>
        <div class="invalid-feedback">
          주소를 입력해주세요.
        </div>

      </div>
      <div class="row">
        <div class="col-md-12 mb-3">
          <label for="ID">회원이름</label>
          <input type="text" class="form-control" id="name" name="M_NAME" value="" required>
          <div class="invalid-feedback">
            회원 이름 입력해주세요
          </div>
        </div>
      </div>


      <div class="mb-3">
        <label for="telNumber">이메일</label>
        <input type="text" class="form-control" id="email" name="M_EMAIL" placeholder="asdfd@naver.com">
      </div>
      <button id="전송" class="btn btn-primary btn-lg btn-block" type="submit" disabled="disabled">회원가입</button>
    </form>
  </div>
</div>



<footer class="my-3 text-center text-small">
  <p class="mb-1">&copy; 2023 YD</p>
</footer>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>

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
        $('#전송').on('click',function(e){
            let password1 = document.getElementById('pass').value;
            let password2 = document.getElementById('password2').value;
            let email = document.getElementById('email');
            let pass = document.getElementById('pass');
            let id = document.getElementById('id');
            let name = document.getElementById('name');
            let addr = document.getElementById('M_ADDR')
            if(password1 != password2){
                alert('비밀번호가 같지않습니다.')
                e.preventDefault();
                return;
            }if(pass.value.length < 6){
                alert('비밀번호 6자리 이상 입력해주세요')
                e.preventDefault();
                return;
            }
            if(/\S+@\S+.\S+/.test(email.value) === false){
                alert('올바른 이메일형식이 아닙니다.')
                e.preventDefault();
                return;
            }if(email.value === '' || pass.value === '' || id.value === '' || name.value === '' || addr.value === ''){
                alert('기입하지 않은곳을 기입해주세요')
                e.preventDefault();
                return;
            }
        });
    };


</script>
</body>
</html>