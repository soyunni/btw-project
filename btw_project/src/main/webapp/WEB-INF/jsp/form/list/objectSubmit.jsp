<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="/library/js/jquery-3.2.1.js"></script>

</head>
<body>
	<form id="realTime" action="/form/saveRealRestTime.bt" method="post">
		<div>
			<h1>row submit1</h1>
				<input type="text" name="id" value="id_01"> <br/>
				<input type="text" name="name" value=""><br/>
				<textarea name="description" rows="5" cols="3"></textarea><br/>
				<input type="text" name="age" value="31"><br/>
				<input type="text" name="day" value="5"><br/>
				
				<select name="selection" >
					<option value="1988">1988</option>
					<option value="1994" selected="selected">1994</option>
					<option value="1997">1997</option>
				</select>
				<br/>
				<input type="radio" name="option" value="A" >
				<input type="radio" name="option" value="B" >
				<input type="radio" name="option" value="C" >
				<br/>
				<input type="checkbox" name="check" >
				<br/>
				<input type="checkbox" name="ch1" value="B" >
				<input type="checkbox" name="ch1" value="T" >
				<br/>
		</div>
		
		<div>
			<input type="text" name="id" value="id_02"> <br/>
			<input type="text" name="name" value=""><br/>
			<textarea name="description" rows="5" cols="3">ffffffffff</textarea><br/>
			<input type="text" name="age" value="21"><br/>
			<input type="text" name="day" value="5"><br/>
			
			<select name="selection" >
				<option value="1988" selected="selected">1988</option>
				<option value="1994" >1994</option>
				<option value="1997">1997</option>
			</select>
			<br/>
			<input type="radio" name="option" value="A" >
			<input type="radio" name="option" value="B" >
			<input type="radio" name="option" value="C" checked="checked">
			<br/>
			<input type="checkbox" name="check" >
			<br/>
			<input type="checkbox" name="ch1" value="B" >
			<input type="checkbox" name="ch1" value="T" >
			<br/>
		</div>
		
		<input type="button" id="btnSend" value="전송">
	</form>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#btnSend").click(function(){
				var $formList = $("#realTime").find("div");
				var objArray = [];
				
				$.each($formList, function() {
					objArray.push({
						"id" : $(this).find("[name='id']").val()
						, "name" : $(this).find("[name='name']").val()
						, "description" : $(this).find("[name='description']").val()
						, "age" : $(this).find("[name='age']").val()
						, "day" : $(this).find("[name='day']").val()
						, "option" : $(this).find("[name='option']").val()
						, "selection" : $(this).find("[name='selection']").val()
						, "check" : $(this).find("[name='check']").val()
						, "checkList" : $(this).find("[name='checkList']").val()
					});
				});
				$.ajax({
						headers: {
							"Accept": "application/json",
							"Content-Type": "application/json"
						},
						url:'/form/saveRestObject.bt',
						type:'post',
						dataType : "json",
						contentType: "application/x-www-form-urlencoded; charset=UTF-8",  
						data: JSON.stringify( objArray ),
						success:function(data){
							console.log(data);
						}
				});
				
			});
				
		});
	</script>
</body>
</html>