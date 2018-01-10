<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>일반 Form</title>
</head>
<body>

<h1>BTS 7명 입력 </h1>
	<form action="/form/saveDefaultForm.bt" method="post">
		<input type="text" name="text1" value="">
		<br/>
		<input type="text" name="text2" value="">
		<br/>
		<input type="text" name="text3" value="">
		<br/>
		<input type="text" name="text4" value="">
		<br/>
		<input type="text" name="text5" value="">
		<br/>
		
		<h3>숫자 (text버전)</h3>
		<input type="text" name="num1" value="">
		<br/>
		<input type="text" name="num2" value="">
		<br/>
		<input type="text" name="num3" value="">
		
		<h3>Radio</h3>
		<input type="radio" name="radioVal1" value="Y">
		<input type="radio" name="radioVal1" value="N">
		<br/>
		
		<h3>Check box</h3>
		<input type="checkbox" name="checkBox1" value="1">
		<input type="checkbox" name="checkBox1" value="2">
		<input type="checkbox" name="checkBox1" value="3">
		<br/>
		<input type="submit" value="전송">
	</form>
<hr/>
<h1> </h1>

<hr/>


<h1> </h1>

<hr/>

</body>
</html>