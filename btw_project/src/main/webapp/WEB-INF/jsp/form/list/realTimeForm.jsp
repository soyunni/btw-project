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

<h1>Column</h1>

	<div>
		<form id="realTime" action="/form/saveRealTime.bt" method="post">
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
			<input type="submit" value="전송">
		</form>
	</div>
	
<hr/>


<h1>Column</h1>

	<div>
		<form id="realTime1" action="/form/saveRealTime.bt" method="post">
			<input type="text" name="id" value="id_01"> <br/>
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

</body>
</html>