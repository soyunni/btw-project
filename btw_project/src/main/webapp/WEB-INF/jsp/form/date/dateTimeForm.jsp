<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Date Form</title>
</head>
<body>

	<form action="/form/saveDateTimeForm.bt" method="get">
		<h1> YYYY-MM-DD </h1>
		<input type="datetime-local" name="timeStr1" value="" >
		
		
		<h1>EXEMPLE</h1>
		<input type="date" name="date" value="" >
		
		<input type="time" name="time" value="" >
		
		<select name="amPm">
			<option value="AM">오전</option>
			<option value="pm">오후</option>
		</select>
		
		<input type="submit" value="DATE 전송">
	</form>

</body>
</html>