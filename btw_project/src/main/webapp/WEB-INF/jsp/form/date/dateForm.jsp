<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Date Form</title>
</head>
<body>

	<form action="/form/saveDateForm.bt" method="get">
		<h1> YYYY-MM-DD</h1>
		<input type="date" name="dateString" value="" >
		
		<br/>
		<h1>YYYYMMDD</h1> 
		<input type="input" name="dateStr" value="" >
		<br/>
		<h1>YYYYMMDD</h1>dotDate
		<input type="input" name="dotDate" value="" >
		
		<h1>YYYY &nbsp; MM &nbsp; DD</h1>
		<input type="input" name="yyyy" value="" >
		<input type="input" name="mm" value="" >
		<input type="input" name="dd" value="" >
		
		<input type="submit" value="DATE 전송">
	</form>

</body>
</html>