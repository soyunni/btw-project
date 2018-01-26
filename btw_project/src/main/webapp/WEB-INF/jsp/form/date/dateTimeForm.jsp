<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Date Form</title>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	<jsp:useBean id="toDay" class="java.util.Date" />
	
	<form action="/form/saveDateTimeForm.bt" method="get">
		<h1> YYYY-MM-DDThh:mm </h1>
		<input type="datetime-local" name="timeStr1" value="${dateStr}" >
		
		
		<h1>YYYY-MM-DD hh:mm</h1>
		<input type="date" name="date" value="${yyyymmdd}" >
		<input type="time" name="time" value="${time}" >
		
		<h1>AM/PM YYYY.MM.DD hh:mm</h1>
		
		
		<select name="yyyy">
			<c:forEach var="year" begin="2001" end="2020" step="1">
				<option value="${year}" <c:if test="${year eq yyyy}">selected</c:if>>${year}</option>
			</c:forEach>
		</select>
		
		<select name="mm">
			<c:forEach var="month" begin="01" end="12" step="1">
				<option value="${month}" <c:if test="${month eq mm}">selected</c:if>>${month}</option>
			</c:forEach>
		</select>
		
		<select name="dd">
			<c:forEach var="day" begin="01" end="31" step="1">
				<option value="${day}" <c:if test="${day eq dd}">selected</c:if>>${day}</option>
			</c:forEach>
		</select>
		
		시간 ${yyyy}${mm}${dd}
		<select name="amPm">
			<option value="AM">오전</option>
			<option value="pm">오후</option>
		</select>
		<select name="hour">
			<option value="12">12</option>
			<option value="01">01</option>
			<option value="02">02</option>
			<option value="03">03</option>
		</select>
		:
		<select name="minute">
			<option value="30">30</option>
			<option value="29">29</option>
			<option value="28">28</option>
			<option value="27">27</option>
		</select>
		
		
		
		<input type="submit" value="DATE 전송">
	</form>

</body>
</html>