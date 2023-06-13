<%@page import="java.util.ArrayList"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="kr.or.ddit.member.vo.AdminVO"%>
<%@page import="kr.or.ddit.product.vo.Pack_ImgVO"%>
<%@page import="kr.or.ddit.product.vo.DoProductVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src = "../js/jquery-3.6.3.min.js" type="text/javascript"></script>
<title>Insert title here</title>
<%
List<DoProductVO> list = (List<DoProductVO>) request.getAttribute("doList");
List<List<Pack_ImgVO>> iList = (List<List<Pack_ImgVO>>) request.getAttribute("imgList");
AdminVO loginAdminVo = (AdminVO) session.getAttribute("loginAdminVo");
MemberVO loginMemVo = (MemberVO) session.getAttribute("LoginMember");
%>
<style type="text/css">

</style>
<script type="text/javascript">
function selectDoChange() {
	value = $('#changeDo option:selected').val();
	console.log(value);
	$.ajax({
		url : '<%=request.getContextPath()%>/product/doProductList.do',
		type : 'post',
		data : {"do_date" : value},
		success : function(dMap){
			$('#prodList').hide();	
			values = dMap.dList;
			console.log(values.do_code);
			iValues = dMap.imgList;
			str = "";
			str += `<table class = "table table-striped" id = "prodList">`;
			$.each(values, function(index, value){
				str += `<tr><td>`
				console.log(value.do_code);
				str += `<div id="demo" class="carousel slide" data-bs-ride="carousel">`;
				str += `<div class="carousel-indicators">`;
				str += `<button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>`;
				str += `<button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>`;
				str += `<button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>`;
				str += `</div>`;
				str += `<div class="carousel-inner">`;
				$.each(value.iList, function(i, v){
					console.log(v.img_code);
					str += `<div class = "carousel-item active">`;
					str += `<div class = "img-wrapper">`;
					str += 	`<img alt= "" 
					src = "http://localhost/MiddleTermProject/product/viewImage.do?img_code=\${v.img_code}"
					onclick = "location.href = 'http://localhost/MiddleTermProject/product/doProductDetail.do?do_code=\${value.do_code}'"
							class = "d-block">`;
					str += `</div></div>`;
				})
				str += `</div>`;
				str += `<button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">`;
				str += `<span class="carousel-control-prev-icon"></span>`;
				str += `</button>`;
				str += `<button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">`;
				str += `<span class="carousel-control-next-icon"></span>`;
				str += `</button>`;
				str += `</div>`
				str += `</td>`
				str += `</tr>`
				str += `<tr>`
				str += `<td>`
				str += `<div class = "text-box" >`
				str += `<div class = "prodTitle">`;
				str += `<h3>\${value.do_name}</h3>`;
				str += `</div>`;
				str += `<div class = "prodPrice">`;
				str += `<h4>\${value.do_price}</h4>`;
				str += `</div>`;
				str += `</div>`;
				str += `</td>`;
				str += `</tr>`
			});
			str += `</table>`
				$('#selectedList').html(str);
		},
		error : function(xhr){
			alert(xhr.status);
		},
		dataType :'json',
		async : false
		
		
	})
}
$(function(){
	$('#changeDo:selected').val();
})
</script>
<style type="text/css">


#ChangeDoInput{
	display : none;
}
#changeDo{
	margin-top : 3%;
	padding : .8em .5em;
	float : right;
	margin-right: 7%;
}

#prodList{
	width : 60%;
	margin-left : 450px;
}
.d-block{
	width : 100%;
	margin : auto;
	top: 0;
    left: 0;
    min-width: 100%;
    min-height: 400px;
}

.text-box{
	margin : auto;
}

</style>
</head>
<body style = "overflow:auto">


<div>
	<input type = "text" id="ChangeDoInput" name = "do"/>
	<select id = "changeDo" onchange="selectDoChange()">
	<%
		ArrayList<String> arrayList = new ArrayList<String>();
		for(DoProductVO dVo: list){
			if(!arrayList.contains(dVo.getDo_department().substring(0,10))){
				arrayList.add(dVo.getDo_department().subSequence(0, 10).toString());
			}
		}
		for(String date : arrayList){
	%>
	<option value = "<%=date%>">
	<%= date%>
	</option>
	<%  
		}
	%>
	</select>
</div>
<br>
<br>	
<br>	


<table class = "table table-striped" id = "prodList">
<%
	
	for(DoProductVO dVo : list){
%>
<tr>
	<td>

	<div id="demo" class="carousel slide" data-bs-ride="carousel">
	<div class="carousel-indicators">
    	<button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
   		<button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
   		<button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
  	</div>
  	
  	<div class="carousel-inner">
	<%
		for(Pack_ImgVO pVo : dVo.getiList()){
	%>
			<div class = "carousel-item active">
				<div class = "img-wrapper">
				<img alt= "" src = "<%=request.getContextPath() %>/product/viewImage.do?img_code=<%=pVo.getImg_code()%>"
					onclick="location.href = '<%=request.getContextPath() %>/product/doProductDetail.do?do_code=<%=dVo.getDo_code()%>'"
					class="d-block w-100 h-100">
				</div>
			</div>
	<% 
		}
 	%>	
		</div>
		
		<button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
 			<span class="carousel-control-prev-icon"></span>
 		</button>
 		<button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
    		<span class="carousel-control-next-icon"></span>
  		</button>
		
	</div>
	</td>
</tr>	
<tr>

	
	<td style = "margin : auto">
	<div class = "text-box" >
		<div class = "prodTitle">
			<h3><%=dVo.getDo_name() %></h3>
		</div>
		<div class = "prodPrice">
			<h4><%=dVo.getDo_price() %>원</h4>
		</div>
	</div>
	</td>
</tr>
	
<%
	}
%>
</table>



<div id = "selectedList">

</div>
<%
if(loginAdminVo !=null  && loginAdminVo.getAdmin_id().equals("admintest")){
	
%>
 
 <a href = "<%= request.getContextPath()%>/product/doProdInsert.do">국내패키지상품 추가</a>
<%
} 

%>

 
</body>
</html>