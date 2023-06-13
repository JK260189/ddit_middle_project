<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.product.vo.Pack_ImgVO"%>
<%@page import="kr.or.ddit.product.vo.DetailVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src = "../js/jquery-3.6.3.min.js" type="text/javascript"></script>
<style type="text/css">
img{
	width : 20%;
	height : 20%;
}

</style>
<meta charset="UTF-8">
<script type="text/javascript">
$(function(){
	var $quantity = $('.quantity'),
		$unitprice =  $quantity.attr('data-unitprice')
		$qtyBtn = $quantity.find('span'),
		$qtyInput = $quantity.find('input'),
		$targetTotal = $('.price');
	$qtyBtn.click(function(){
		console.log($unitprice);
		var currentCount = $qtyInput.val();
		if ($(this).hasClass('plus')){
			
			$qtyInput.val(++currentCount);
		}else {
			if(currentCount > 1){
			$qtyInput.val(--currentCount);
			}
		}
		var total = currentCount * $unitprice;
		console.log(total);
		$targetTotal.html(total + '원');
		$('input[name=price]').attr('value', total);
		
	})
})
</script>
<style type="text/css">
.purchaseInfo{ 
	display : none; 
 } 
 form{
 	width : 60%;
 	margin : auto;
 	overflow : hidden;
 }
 img{
	width : 200px;
	height :200px;
	margin : auto;
}
#body-wrapper{
	overflow: auto;
}
</style>
<title>Insert title here</title>
</head>
<%
	DetailVO dVo  = (DetailVO)request.getAttribute("dVo");
	List<Pack_ImgVO> iList = (List<Pack_ImgVO>) request.getAttribute("iList");
	MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
	int m_code = 0;
	if(loginMemVo != null){
		m_code = loginMemVo.getM_code();
		
	}
%>
<body style = "overflow:auto">

<form action="<%= request.getContextPath()%>/purchase/do_purchase.do" method = "post">
	<input class="purchaseInfo" type = "text" name = "m_code" value = "<%=m_code %>">
	<input class="purchaseInfo" type = "text" name = "do_code" value = "<%=dVo.getDo_code() %>">
	<input class="purchaseInfo" type = "text" name = "price" value = "">
	<input class="purchaseInfo" type = "text" name = "p_sdate" value = "<%=dVo.getDo_department().substring(0, 10) %>">
	<input class="purchaseInfo" type = "text" name = "p_edate" value = "<%=dVo.getDo_arrival().substring(0, 10) %>">
	<input class="purchaseInfo" type = "text" name = "do_name" value = "<%=dVo.getDo_name() %>">
	<table border = '1' bordercolor = 'blue' class ="table table-striped">
	<tr>
		<td colspan = '2'>
		<% for(Pack_ImgVO pVo : iList){ %>
		<img alt = "" src = "<%=request.getContextPath()%>/product/viewImage.do?img_code=<%=pVo.getImg_code()%>">
		<% } %>
		</td>	
	</tr>
	<tr>
		<td colspan = '2' >
		<h4><%=dVo.getDo_name() %></h4>
		</td>
	</tr>	
	<tr>
		<td>상품 소개</td>
		<td>
		<%=dVo.getDo_content().replace("\r\n", "<br>") %>
		</td>
	</tr>

	<tr>
		<td>호텔소개</td>
		<td>
		<%=dVo.getH_name() %><br>
		<%=dVo.getH_content().replace("\r\n", "<br>") %>
		</td>
	</tr>
	
	<tr>
		<td>출발 / 도착지</td>
		<td><%=dVo.getBus_dep_loca() %> / <%=dVo.getBus_arr_loca() %></td>
	</tr>
	
	<tr>
		<td>지도</td>
		<td id = "map" style = "height:600px;"> </td>
		<script type="text/javascript">
		function foMap(){
			let mapOptions = {
					center:new google.maps.LatLng(<%=dVo.getCity_lati()%>, <%=dVo.getCity_long()%>),
		            zoom:12,
			};
			var map = new google.maps.Map( 
		             document.getElementById("map") 
		            , mapOptions );
			
			hotel =[ {label: "A", name: "<%= dVo.getH_name()%>", lat: <%=dVo.getH_lati()%>, lng: <%=dVo.getH_long()%>}];
			hotel.forEach(({label, name, lat, lng}) => {
				const marker = new google.maps.Marker({
					position: {lat, lng},
					label,
					map,
				});
			});
			
		};
		</script>
		<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD3NWsclJOJ9S0-rguahJJFyNYb4-Roll8&callback=foMap"></script>
	</tr>
	
	<tr>
		<td>최소인원</td>
		<td><%=dVo.getDo_min() %><br>
			단, 1명 예약시 2인 기준의 호텔 요금이 발생하므로 추가 요금이 부가될 수 있습니다.
		</td>
	</tr>
	
	<tr>
		<td>최대인원</td>
		<td><%=dVo.getDo_max() %><br>
			
		</td>
	</tr>
	
	<tr>
		<td>출발날짜</td>
		<td><%=dVo.getDo_department().substring(0, 10) %> / </td>
	</tr>
	
	<tr>
		<td>도착날짜</td>
		<td><%=dVo.getDo_arrival().substring(0, 10) %> / </td>
	</tr>
	
	<tr>
		<td>가격</td>
		<td class = "selectPrice" value = "<%=dVo.getDo_price() %>"><%=dVo.getDo_price() %>원</td>
	</tr>
		
	<tr>
		<td>수량</td>
		<td class = "quantity" data-unitprice= "<%=dVo.getDo_price() %>">
			<span class = "plus">+</span>
			<input name = "quantity" type = "text" readonly value = "1" >
			<span class = "minus">-</span>
		</td>
	</tr>
	<tr>
		<td class = "totalPrice">총 가격</td>
		<td class = "price" name = "price">
		</td>
	</tr>
	
	<tr>
		<td colspan="2" >
		<input type = "submit" value = "결제" id = "purchaseBtn">
		</td>
	</tr>	
	</table>
	
</form>

</body>
</html>