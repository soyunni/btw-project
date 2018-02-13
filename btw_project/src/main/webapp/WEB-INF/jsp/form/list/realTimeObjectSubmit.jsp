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
			<input type="text" name="id" value="id_01" onkeyup="inputValue(0,this);"> <br/>
			<input type="text" name="name" value="" onkeyup="inputValue(0,this);"><br/>
			<textarea name="description" rows="5" cols="3" onkeyup="inputValue(0,this);">ffffffffff</textarea><br/>
			<input type="text" name="age" value="21" onkeyup="inputValue(0,this);"><br/>
			<input type="text" name="day" value="5" onkeyup="inputValue(0,this);"><br/>
			
			<select name="selection" onChange="inputValue(0,this);">
				<option value="1988" selected="selected">1988</option>
				<option value="1994" >1994</option>
				<option value="1997">1997</option>
			</select>
			<br/>
			<input type="radio" name="option" value="A" onclick="inputValue(0,this);">
			<input type="radio" name="option" value="B" onclick="inputValue(0,this);">
			<input type="radio" name="option" value="C" checked="checked" onclick="inputValue(0,this);">
			<br/>
			<input type="checkbox" name="check" onclick="checkValue(0,this);">
			<br/>
			<input type="checkbox" name="checkList" value="B" onclick="checkValue(0,this);">
			<input type="checkbox" name="checkList" value="T" onclick="checkValue(0,this);">
			<br/>
		</div>
		
		<div>
			<input type="text" name="id" value="id_01" onkeyup="inputValue(1,this);"> <br/>
			<input type="text" name="name" value="" onkeyup="inputValue(1,this);"><br/>
			<textarea name="description" rows="5" cols="3" onkeyup="inputValue(1,this);">ffffffffff</textarea><br/>
			<input type="text" name="age" value="21" onkeyup="inputValue(1,this);"><br/>
			<input type="text" name="day" value="5" onkeyup="inputValue(1,this);"><br/>
			
			<select name="selection" onChange="inputValue(1,this);">
				<option value="1988" selected="selected">1988</option>
				<option value="1994" >1994</option>
				<option value="1997">1997</option>
			</select>
			<br/>
			<input type="radio" name="option" value="A" onclick="inputValue(1,this);">
			<input type="radio" name="option" value="B" onclick="inputValue(1,this);">
			<input type="radio" name="option" value="C" checked="checked" onclick="inputValue(1,this);">
			<br/>
			<input type="checkbox" name="check" onclick="checkValue(1,this);">
			<br/>
			<input type="checkbox" name="checkList" value="B" onclick="checkValue(1,this);">
			<input type="checkbox" name="checkList" value="T" onclick="checkValue(1,this);">
			<br/>
		</div>
		
		<input type="button" id="btnSend" value="전송">
	</form>
	
	<script type="text/javascript">
		//1. 빈 Object 생성
		var g_objArray = [];
		//3. 입력 감지 (input)
		function inputValue(idx, obj){
			var $obj = $(obj);
			var name = $obj.attr('name');
			var data = $obj.val();
			
			g_objArray[idx][name] = data;
			console.log("저장값 : " + g_objArray[idx][name]);
			
		}
		
		//3. 선택 감지 (select)
		function checkValue(idx, obj){
			var $obj = $(obj);
			var name = $obj.attr("name");
			var length = $obj.parent().find("input[name='"+ name +"']").length;
			var list = $obj.parent().find("input[name='"+ name +"']:checked");
			
			if ( length == 1) {
				g_objArray[idx][name] = list.val();
			} else {
				var arrayList = [];
				$.each(list, function(){
					arrayList.push($(this).val());
				});
				g_objArray[idx][name] = arrayList;
			}
			//var data = $obj.val();
			//console.log("전달값 ->> " + name + " : " + data);
		}
		$(document).ready(function(){
			//2. 전달할 배열 기본 셋팅
			for( var i = 0 ; i < $("[name='id']").length ; i++ ){
				g_objArray.push({
					"id" : "",
					"name" : "",
					"description" : "",
					"age" : 0,
					"day" : 0,
					"option" : "",
					"selection" : "",
					"check" : "",
					"checkList" : []
				});
			}
			
			//3. 실시간 입력값 저장
			$("#btnSend").click(function(){
				 $.ajax({
					headers: {
						"Accept": "application/json",
						"Content-Type": "application/json"
					},
					url:'/form/saveRestObject.bt',
					type:'post',
					dataType : "json",
					contentType: "application/x-www-form-urlencoded; charset=UTF-8",  
					data: JSON.stringify( g_objArray ),
					success:function(data){
						console.log(data);
					}
				}); 
			});
		});
	</script>
</body>
</html>