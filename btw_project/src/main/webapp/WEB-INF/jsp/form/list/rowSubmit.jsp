<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<div>
		<h1>row submit1</h1>
		<form id="realTime" action="/form/saveRealRestTime.bt" method="post">
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
			<input type="submit" value="전송">
		</form>
	</div>
	
	<div>
		<h1>row submit2</h1>
		<form id="realTime" action="/form/saveRealRestTime.bt" method="post">
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
			<input type="submit" value="전송">
		</form>
	</div>
</body>
</html>