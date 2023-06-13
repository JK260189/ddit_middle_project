<%@page import="kr.or.ddit.purchase.vo.PurchaseVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src = "../js/jquery-3.6.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
<meta charset="UTF-8">
<style>
#purchaseInfo{
	width : 50%;
	height: 10%;
 	margin : auto;
 	margin-top: 50px;
}
</style>
<title>Insert title here</title>
<%
	PurchaseVO pVo = (PurchaseVO) request.getAttribute("pVo");
	String name = pVo.getP_name();
	int merchanID = pVo.getP_code();
	int price = pVo.getP_price();
	
%>
</head>
<body>
<script>
	var today = new Date();   
	var hours = today.getHours(); // 시
	var minutes = today.getMinutes();  // 분
	var seconds = today.getSeconds();  // 초
	var milliseconds = today.getMilliseconds();
	var makeMerchantUid = hours +  minutes + seconds + milliseconds;
	var IMP = window.IMP; 
    IMP.init("imp33542555");
    
     function requestPay() {
         IMP.request_pay({
        	 pg : 'kakaopay.TC0ONETIME',
        	 merchant_uid: "<%=pVo.getP_code()%>" + makeMerchantUid, // 상점에서 관리하는 주문 번호
        	 name : '주문명:결제테스트',
        	 amount :  <%=pVo.getP_price()%>,
        	 buyer_email : 'tour@gmail.com',
        	 buyer_name : 'DDIT',
        	 buyer_tel : '042-222-8202',
        	 buyer_addr : '대전광역시 중구 계룡로 846, 3-4층',
        	 buyer_postcode : '123-456'
         }, function (rsp) { // callback
             if (rsp.success) {
                 console.log(rsp);
                 var msg = '결제가 완료되었습니다.';
                 alert(msg);
                 location.href='<%=request.getContextPath()%>/product/foProductList.do';
             } else {
                 console.log(rsp);
                 var msg = '결제에 실패하였습니다.';
                 alert(msg);
             }
         });
     }
    </script>

<table class = "table table-striped" id = "purchaseInfo">
	<tr>
		<td colspan="2" >
			<h4>결제 정보를 확인해주세요</h4>
		</td>
	</tr>

	<tr>
		<td>결제 상품</td>
		<td><%=pVo.getP_name() %></td>
	</tr>

	<tr>
		<td>수량</td>
		<td><%=pVo.getP_people() %></td>
	</tr>

	<tr>
		<td>결제가격</td>
		<td><%=pVo.getP_price() %></td>
	</tr>

	<tr>
		<td colspan="2">
			<button onClick = "requestPay()">결제하기</button>
			<button onClick = "history.go(-1)" >취소하기</button>
		</td>
	</tr>
</table>


</body>
</html>