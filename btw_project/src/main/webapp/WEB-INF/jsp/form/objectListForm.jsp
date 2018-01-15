<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	

	<h1>Object List Form (1) </h1>
	<form action="/form/saveListFormObject.bt" method="post">
		<c:forEach var="idx" begin="0" end="2" step="1">
			<h3> List ${idx + 1} </h3>
			
			<input type="text" name="formList[${idx}].text1" value="text${idx + 1}">
			<br/>
			<input type="text" name="formList[${idx}].text2" value="text${idx + 1}">
			<br/>
			<input type="text" name="formList[${idx}].text3" value="text${idx + 1}">
			<br/>
			<input type="text" name="formList[${idx}].text4" value="text${idx + 1}">
			<br/>
			<input type="text" name="formList[${idx}].text5" value="text${idx + 1}">
			<br/>
			
			<h3>숫자 (text버전)</h3>
			<input type="text" name="formList[${idx}].num1" value="${idx + 1}">
			<br/>
			<input type="text" name="formList[${idx}].num2" value="${idx + 1}">
			<br/>
			<input type="text" name="formList[${idx}].num3" value="${idx + 1}">
			<h3>Radio</h3>
			<input type="radio" name="formList[${idx}].radioVal1" value="Y">
			<input type="radio" name="formList[${idx}].radioVal1" value="N" checked="checked">
			<br/>
			
			<h3>Check box</h3>
			<input type="checkbox" name="formList[${idx}].checkBox1" value="1" checked="checked">
			<input type="checkbox" name="formList[${idx}].checkBox1" value="2">
			<input type="checkbox" name="formList[${idx}].checkBox1" value="3">
			<br/>
			<hr/>
			<br/>
		</c:forEach>
		
		<br/>
		<input type="submit" value="전송">
	</form>
	
	
	
	<h1>Object List Form (2) </h1>
	<form action="/form/saveListFormObject.bt" method="post">
		<c:forEach var="idx" begin="0" end="2" step="1">
			<h3> List ${idx + 1} </h3>
			
			<input type="text" name="text1" value="text${idx + 1}">
			<br/>
			<input type="text" name="text2" value="text${idx + 1}">
			<br/>
			<input type="text" name="text3" value="text${idx + 1}">
			<br/>
			<input type="text" name="text4" value="text${idx + 1}">
			<br/>
			<input type="text" name="text5" value="text${idx + 1}">
			<br/>
			
			<h3>숫자 (text버전)</h3>
			<input type="text" name="num1" value="${idx + 1}">
			<br/>
			<input type="text" name="num2" value="${idx + 1}">
			<br/>
			<input type="text" name="num3" value="${idx + 1}">
			
			<hr/>
			<br/>
		</c:forEach>
		
		<br/>
		<input type="submit" value="전송">
	</form>

</body>
</html>