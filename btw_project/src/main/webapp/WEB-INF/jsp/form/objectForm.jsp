<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>일반 Form</title>

<script src="/library/js/jquery-3.2.1.js"></script>
</head>
<body>

<h1>BTS 7명 입력 </h1>
	<form action="/form/saveStringObjectForm.bt" id="form" method="post">
		<input type="text" name="text1" value="tttt">
		<br/>
		<input type="text" name="text2" value="eeee">
		<br/>
		<input type="text" name="text3" value="wwww">
		<br/>
		<input type="text" name="text4" value="qqqq">
		<br/>
		<input type="text" name="text5" value="ffff">
		<br/>
		
		<h3>숫자 (text버전)</h3>
		<input type="text" name="num1" value="1">
		<br/>
		<input type="text" name="num2" value="2">
		<br/>
		<input type="text" name="num3" value="3">
		
		<h3>Radio</h3>
		<input type="radio" name="radioVal1" value="Y">
		<input type="radio" name="radioVal1" value="N">
		<br/>
		
		<h3>Check box</h3>
		<input type="checkbox" name="checkBox1" value="A">
		<input type="checkbox" name="checkBox1" value="B">
		<input type="checkbox" name="checkBox1" value="C">
		<br/>
		
			<input type="text" name="text1" value="tttt">
		<br/>
		<input type="text" name="text2" value="eeee">
		<br/>
		<input type="text" name="text3" value="wwww">
		<br/>
		<input type="text" name="text4" value="qqqq">
		<br/>
		<input type="text" name="text5" value="ffff">
		<br/>
		
		<h3>숫자 (text버전)</h3>
		<input type="text" name="num1" value="1">
		<br/>
		<input type="text" name="num2" value="2">
		<br/>
		<input type="text" name="num3" value="3">
		
		<h3>Radio</h3>
		<input type="radio" name="radioVal1" value="Y">
		<input type="radio" name="radioVal1" value="N">
		<br/>
		
		<h3>Check box</h3>
		<input type="checkbox" name="checkBox1" value="A">
		<input type="checkbox" name="checkBox1" value="B">
		<input type="checkbox" name="checkBox1" value="C">
		
			<input type="text" name="text1" value="tttt">
		<br/>
		<input type="text" name="text2" value="eeee">
		<br/>
		<input type="text" name="text3" value="wwww">
		<br/>
		<input type="text" name="text4" value="qqqq">
		<br/>
		<input type="text" name="text5" value="ffff">
		<br/>
		
		<h3>숫자 (text버전)</h3>
		<input type="text" name="num1" value="1">
		<br/>
		<input type="text" name="num2" value="2">
		<br/>
		<input type="text" name="num3" value="3">
		
		<h3>Radio</h3>
		<input type="radio" name="radioVal1" value="Y">
		<input type="radio" name="radioVal1" value="N">
		<br/>
		
		<h3>Check box</h3>
		<input type="checkbox" name="checkBox1" value="A">
		<input type="checkbox" name="checkBox1" value="B">
		<input type="checkbox" name="checkBox1" value="C">
		
		<!-- <input type="text" name="text1" value="text1">
		<br/>
		<input type="text" name="text2" value="text1">
		<br/>
		<input type="text" name="text3" value="text1">
		<br/>
		<input type="text" name="text4" value="text1">
		<br/>
		<input type="text" name="text5" value="text1">
		<br/>
		
		<h3>숫자 (text버전)</h3>
		<input type="text" name="num1" value="1">
		<br/>
		<input type="text" name="num2" value="2">
		<br/>
		<input type="text" name="num3" value="3">
		
		<h3>Radio</h3>
		<input type="radio" name="radioVal1" value="Y">
		<input type="radio" name="radioVal1" value="N">
		<br/>
		
		<h3>Check box</h3>
		<input type="checkbox" name="checkBox1" value="A">
		<input type="checkbox" name="checkBox1" value="B">
		<input type="checkbox" name="checkBox1" value="C"> -->
		<br/>
		<input type="submit" value="전송">
	</form>
<hr/>

<button id="sendJson">테스트</button>


<script type="text/javascript">
$(document).ready(function(){
	var list = [];
	var listObj = { "text1" : "test1"
		, "text2" : "test2"
			, "text3" : "test3"
			, "text4" : "test4"
			, "text5" : "test5"
			, "num1" : 1
			, "num2" : 2
			, "num3" : 3
			, "radioVal1" : "Y"
			, "checkBox1" : "S"}
	list.push(listObj);
	list.push(listObj);
	
	
	var obj = { "text1" : "test1"
				, "text2" : "test2"
				, "text3" : "test3"
				, "text4" : "test4"
				, "text5" : "test5"
				, "num1" : 1
				, "num2" : 2
				, "num3" : 3
				, "radioVal1" : "Y"
				, "checkBox1" : "S"
				, "formList" : null};
	
	//console.log(JSON.stringify(obj));
	console.log(list);
	
	$("#sendJson").click(function(){
		$.ajax({
			headers: {
				"Accept": "application/json",
				"Content-Type": "application/json"
			},
			type: "POST",
			url: "/form/saveStringObjectForm.bt",
			data : JSON.stringify(list),
			dataType : "json",
			success : function(data) {
				alert("저장 성공");
			},
			error : function(e) {
				alert("오류발생 :" + e.responseText);
				return;
			}
		});
	});
	
});



</script>

</body>
</html>