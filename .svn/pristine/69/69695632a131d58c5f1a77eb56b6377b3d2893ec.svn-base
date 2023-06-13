<%@page import="kr.or.ddit.product.vo.HotelVO"%>
<%@page import="kr.or.ddit.product.vo.FlightVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src = "../js/jquery-3.6.3.min.js" type="text/javascript"></script>
<script type="text/javascript">
function selectFlightChange(value) {
	console.log(value);
	$('#ChangeFlightInput').val(value);
}

function selectHotelChange(value) {
	console.log(value);
	$('#ChangeHotelInput').val(value);
}
</script>

<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
#ChangeFlightInput{
	display:none;
}
#ChangeHotelInput{
	display:none;
}
#ProdInsert{
	margin-top: 5%;
	margin-left : auto;
	margin-right : auto;
	
}
form
{
	width : 60%;
	margin : auto;
}

</style>
<title>Insert title here</title>
</head>
<body>
<%
	List<FlightVO>fList = (List<FlightVO>) request.getAttribute("flight");
	List<HotelVO>hList = (List<HotelVO>) request.getAttribute("hotel");
%>

<form action = "<%= request.getContextPath()%>/product/foProdInsert.do" method = "post" enctype = "multipart/form-data">
	
	<table border = '1' bordercolor = 'blue' id="ProdInsert" class = "table table-striped">
		<tr>
			<td>패키지 상품명</td>
			<td><input type="text" name="fo_name" id="id"></td>
		</tr>
		
		<tr>
			<td>최소인원</td>
			<td><input type="text" name="fo_min"></td>
		</tr>
		
		<tr>
			<td>최대인원</td>
			<td><input type="text" name="fo_max"></td>
		</tr>
		
		<tr>
			<td>출발날짜</td>
			<td><input type="text" name="fo_dept"></td>
		</tr>
		
		<tr>
			<td>도착날짜</td>
			<td><input type="text" name="fo_arri"></td>
		</tr>
		
		<tr>
			<td>가격</td>
			<td><input type="text" name="price"></td>
		</tr>		
		
		<tr>
			<td>상품소개</td>
			<td><input type="text" name="fo_content"></td>
		</tr>
		
		<tr>
			<td>항공번호</td>
			<td>
			<input type = "text" id="ChangeFlightInput" name = "foFlight" />
			<select id = "changeFlight" onchange="selectFlightChange(this.value)">
			<%
				for(FlightVO fVo : fList){
			%>
			<option value = "<%=fVo.getFlight_code() %>">
			<%=fVo.getDep_loca2()%> <%=fVo.getDep_date1().substring(0, 10) %>
			</option>
			<%
				}
			%>
			</select>
			</td>
		</tr>
		
		<tr>
			<td>호텔번호</td>
			<td>
			<input type = "text" id="ChangeHotelInput" name = "foHotel"/>
			<select id = "changeHotel" onchange="selectHotelChange(this.value)">
			<%
				for(HotelVO hVo: hList){
			%>
			<option value = "<%= hVo.getH_code()%>">
			<%= hVo.getH_name()%> 
			</option>
			<%
				}
			%>
			</select>
			</td>
		</tr>
		
		<tr>
			<td>상품사진</td>
			<td><input type="file" name="userPhoto" multiple></td>
		</tr>
		
		<tr>
			<td colspan = '2'>
			<input type="submit" value="저장">
			<input type="reset" value="취소">
			</td>
		</tr>
	</table>
</body>
</html>