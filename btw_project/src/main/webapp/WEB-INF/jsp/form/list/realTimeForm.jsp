<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script src="/library/js/jquery-3.2.1.js"></script>
<title>일반 Form</title>
</head>
<body>

<h1>2. 실시간 전송 (완료)</h1>

	<div>
		<form action="" method="post">
			<input type="text" name="id" value="id_01"> <br/>
			<input type="text" name="name" value=""><br/>
			<textarea name="description" rows="5" cols="3"></textarea><br/>
			<input type="text" name="age" value="31"><br/>
			<input type="text" name="day" value="5"><br/>
			
			<select name="selection" onchange="document.getElementById('realTime').submit();">
				<option value="1988">1988</option>
				<option value="1994">1994</option>
				<option value="1997">1997</option>
			</select>
			<br/>
			<input type="radio" name="option" value="A" onclick="document.getElementById('realTime').submit();">
			<input type="radio" name="option" value="B" onclick="document.getElementById('realTime').submit();">
			<input type="radio" name="option" value="C" onclick="document.getElementById('realTime').submit();">
			<br/>
			<input type="checkbox" name="check" onclick="document.getElementById('realTime').submit();" >
			<br/>
			<input type="checkbox" name="ch1" value="B" onclick="document.getElementById('realTime').submit();">
			<input type="checkbox" name="ch1" value="T" onclick="document.getElementById('realTime').submit();">
			<br/>
		</form>
	</div>
	
<hr/>


<h1>2. 연속적 row 전송</h1>

	<div>
		<form  class="formSubmit"  action="" method="post">
			<input type="text" name="id" value="id_02"> <br/>
			<input type="text" name="name" value=""><br/>
			<textarea name="description" rows="5" cols="3"></textarea><br/>
			<input type="text" name="age" value="31"><br/>
			<input type="text" name="day" value="5"><br/>
			
			<select name="selection" >
				<option value="1988">1988</option>
				<option value="1994">1994</option>
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
			<input type="submit" value="전송">
		</form>
	</div>
	
	<div>
		<form  class="formSubmit"  action="" method="post">
			<input type="text" name="id" value="id_03"> <br/>
			<input type="text" name="name" value=""><br/>
			<textarea name="description" rows="5" cols="3"></textarea><br/>
			<input type="text" name="age" value="31"><br/>
			<input type="text" name="day" value="5"><br/>
			
			<select name="selection" >
				<option value="1988">1988</option>
				<option value="1994">1994</option>
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
			<input type="submit" value="전송">
		</form>
	</div>
	
	<hr/>
	<button id="sendBtn">전송하기</button>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#sendBtn").click(function(){
				$.each($(".formSubmit"), function(){
					$.ajax({
						url:'/form/saveRealRestTime.bt',
						type:'post',
						data: $(this).serialize(),
						success:function(data){
							console.log(data);
						}
					}); 
				});
			});
			
		});
	</script>
</body>
</html>