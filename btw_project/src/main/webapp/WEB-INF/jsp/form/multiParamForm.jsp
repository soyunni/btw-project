<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
table {
	border-collapse: collapse;
	border-style: hidden hidden none hidden;
}

table thead, table tbody {
	border-bottom: solid;
}

table tbody th:first-child {
	border-left: solid;
}

table tbody th {
	text-align: left;
}

table td, table th {
	border-left: solid;
	border-right: solid;
	border-bottom: solid thin;
	vertical-align: top;
	padding: 0.2em;
}

blockquote {
	margin: 0 0 0 2em;
	border: 0;
	padding: 0;
	font-style: italic;
}
</style>
</head>
<body>
	<form action="/form/saveMultiParamForm3.bt" method="get" enctype="multipart/form-data">
		<h1>Multi Form (1)</h1>
		<table id="attr-input-type-keywords">
			<thead>
				<tr>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 예어 </font></font></th>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 상태 </font></font></th>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 데이터 형식 </font></font></th>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> input </font></font></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-hidden">
							<code>hidden</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-hidden"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-hidden"
								id="ref-for-element-statedef-input-hidden⑦">Hidden</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 임의의 문자열 </font></font></td>
					<td>
						<input type="hidden" name="hidden" value="zzzhidden">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-text">
							<code>text</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-text"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-text"
								id="ref-for-element-statedef-input-text①">Text</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 </font></font></td>
					<td>
						<input type="text" name="text" value="텍스트">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-search">
							<code>search</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-search"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-search"
								id="ref-for-element-statedef-input-search①">Search</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 </font></font></td>
					<td>
						<input type="search" name="search" value="검색">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-tel">
							<code>tel</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-tel"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-telephone"
								id="ref-for-element-statedef-input-telephone②">Telephone</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 </font></font></td>
					<td>
						<input type="tel" name="tel" value="010-1234-5678">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-url">
							<code>url</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-url"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-url"
								id="ref-for-element-statedef-input-url①">URL</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 절대 URL </font></font></td>
					<td>
						<input type="url" name="url" value="http://theqoo.net/index.php?mid=ktalk&2=normal&page=30">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-email">
							<code>email</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-email"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-e-mail"
								id="ref-for-element-statedef-input-e-mail①">E-mail</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 전자 메일 주소 또는 전자 메일 주소 목록
						</font></font></td>
					<td>
						<input type="email" name="email" value="itwise@naver.com">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-password">
							<code>password</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-password"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-password"
								id="ref-for-element-statedef-input-password">Password</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 (중요한 정보) </font></font></td>
					<td>
						<input type="password" name="password" value="qwe123">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-date">
							<code>date</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-date"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-date"
								id="ref-for-element-statedef-input-date">Date</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 시간대가없는 날짜 (년, 월, 일) </font></font></td>
					<td>
						<input type="date" name="dateString" value="">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-month">
							<code>month</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-month"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-month"
								id="ref-for-element-statedef-input-month">Month</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 시간대가없는 1 년과 1 개월로 구성된 날짜
						</font></font></td>
					<td>
						<input type="month" name="month" value="2018-02">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-week">
							<code>week</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-week"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-week"
								id="ref-for-element-statedef-input-week">Week</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 주 년 번호와 시간대가없는 주 번호로 구성된
								날짜 </font></font></td>
					<td>
						<input type="week" name="week" value="2018-W05">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-time">
							<code>time</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-time"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-time"
								id="ref-for-element-statedef-input-time">Time</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 시간대가없는 시간 (시, 분, 초, 분 초)
						</font></font></td>
					<td>
						<input type="time" name="time" value="22:02">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-datetime-local">
							<code>datetime-local</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-datetime-local"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-localdatetime"
								id="ref-for-element-statedef-input-localdatetime">Local Date
								and Time</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 타임 존 오프셋이없는 날짜와 시간 (년,
								월, 일,시, 분, 초, 분수) </font></font></td>
					<td>
						<input type="datetime-local" name="dateTimeString" value="">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-number">
							<code>number</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-number"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-number"
								id="ref-for-element-statedef-input-number">Number</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 수치 </font></font></td>
					<td>
						<input type="number" name="num" value="2">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-range">
							<code>range</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-range"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-range"
								id="ref-for-element-statedef-input-range">Range</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 정확한 값이 중요하지 않다는 추가적인 의미를
								지닌 수치 </font></font></td>
					<td>
						<input type="range" name="range" value="5">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-color">
							<code>color</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-color"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-color"
								id="ref-for-element-statedef-input-color">Color</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 8 비트 빨강, 녹색 및 파랑 구성
								요소가있는 sRGB 색상 </font></font></td>
					<td>
						<input type="color" name="color" value="#0000ff">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-checkbox">
							<code>checkbox</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-checkbox"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-checkbox"
								id="ref-for-element-statedef-input-checkbox">Checkbox</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 미리 정의 된 목록의 0 개 이상의 값 집합
						</font></font></td>
					<td>
						<input type="checkBox" name="checkBox" value="C" checked="checked">
						<input type="checkBox" name="checkBox" value="T" checked="checked">
						<input type="checkBox" name="checkBox" value="V" checked="checked">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-radio">
							<code>radio</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-radio"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-radio"
								id="ref-for-element-statedef-input-radio③">Radio Button</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 열거 된 값 </font></font></td>
					<td>
						<input type="radio" name="radio" value="R" checked="checked">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-file">
							<code>file</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-file"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-file"
								id="ref-for-element-statedef-input-file①">File Upload</a>
						</code></td>
					<td><font style="vertical-align: inherit;"></font><a
						data-link-type="dfn" href="infrastructure.html#mime-type"
						id="ref-for-mime-type②②"><font
							style="vertical-align: inherit;"><font
								style="vertical-align: inherit;">MIME 유형</font></font></a><font
						style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 및 선택적으로 파일 이름을 </font><font
							style="vertical-align: inherit;">가진 0 개 이상의 파일</font></font></td>
					<td>
						<input type="file" name="file" value="">
					</td>
				</tr>
				
			</tbody>
		</table>
		<br/>
		<input type="submit" value="SUBMIT">
	</form>
	
	<hr/>
	
	<form action="/form/saveMultiParamForm2.bt" method="post" enctype="multipart/form-data">
		<h1>Multi Form (2)</h1>
		<table id="attr-input-type-keywords">
			<thead>
				<tr>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 예어 </font></font></th>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 상태 </font></font></th>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 데이터 형식 </font></font></th>
					<th><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> input </font></font></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-hidden">
							<code>hidden</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-hidden"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-hidden"
								id="ref-for-element-statedef-input-hidden⑦">Hidden</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 임의의 문자열 </font></font></td>
					<td>
						<input type="hidden" name="hidden" value="zzzhidden">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-text">
							<code>text</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-text"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-text"
								id="ref-for-element-statedef-input-text①">Text</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 </font></font></td>
					<td>
						<input type="text" name="text" value="텍스트">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-search">
							<code>search</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-search"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-search"
								id="ref-for-element-statedef-input-search①">Search</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 </font></font></td>
					<td>
						<input type="search" name="search" value="검색">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-tel">
							<code>tel</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-tel"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-telephone"
								id="ref-for-element-statedef-input-telephone②">Telephone</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 </font></font></td>
					<td>
						<input type="tel" name="tel" value="010-1234-5678">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-url">
							<code>url</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-url"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-url"
								id="ref-for-element-statedef-input-url①">URL</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 절대 URL </font></font></td>
					<td>
						<input type="url" name="url" value="http://theqoo.net/index.php?mid=ktalk&2=normal&page=30">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-email">
							<code>email</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-email"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-e-mail"
								id="ref-for-element-statedef-input-e-mail①">E-mail</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 전자 메일 주소 또는 전자 메일 주소 목록
						</font></font></td>
					<td>
						<input type="email" name="email" value="soyeunni@naver.com">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-password">
							<code>password</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-password"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-password"
								id="ref-for-element-statedef-input-password">Password</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 줄 바꿈이없는 텍스트 (중요한 정보) </font></font></td>
					<td>
						<input type="password" name="password" value="thdusl">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-date">
							<code>date</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-date"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-date"
								id="ref-for-element-statedef-input-date">Date</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 시간대가없는 날짜 (년, 월, 일) </font></font></td>
					<td>
						<input type="date" name="dateString" value="">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-month">
							<code>month</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-month"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-month"
								id="ref-for-element-statedef-input-month">Month</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 시간대가없는 1 년과 1 개월로 구성된 날짜
						</font></font></td>
					<td>
						<input type="month" name="month" value="2018-02">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-week">
							<code>week</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-week"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-week"
								id="ref-for-element-statedef-input-week">Week</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 주 년 번호와 시간대가없는 주 번호로 구성된
								날짜 </font></font></td>
					<td>
						<input type="week" name="week" value="2018-W05">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-time">
							<code>time</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-time"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-time"
								id="ref-for-element-statedef-input-time">Time</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 시간대가없는 시간 (시, 분, 초, 분 초)
						</font></font></td>
					<td>
						<input type="time" name="time" value="22:02">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-datetime-local">
							<code>datetime-local</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-datetime-local"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-localdatetime"
								id="ref-for-element-statedef-input-localdatetime">Local Date
								and Time</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 타임 존 오프셋이없는 날짜와 시간 (년,
								월, 일,시, 분, 초, 분수) </font></font></td>
					<td>
						<input type="datetime-local" name="dateTimeString" value="">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-number">
							<code>number</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-number"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-number"
								id="ref-for-element-statedef-input-number">Number</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 수치 </font></font></td>
					<td>
						<input type="number" name="number" value="2">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-range">
							<code>range</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-range"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-range"
								id="ref-for-element-statedef-input-range">Range</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 정확한 값이 중요하지 않다는 추가적인 의미를
								지닌 수치 </font></font></td>
					<td>
						<input type="range" name="range" value="5">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-color">
							<code>color</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-color"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-color"
								id="ref-for-element-statedef-input-color">Color</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 8 비트 빨강, 녹색 및 파랑 구성
								요소가있는 sRGB 색상 </font></font></td>
					<td>
						<input type="color" name="color" value="#0000ff">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-checkbox">
							<code>checkbox</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-checkbox"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-checkbox"
								id="ref-for-element-statedef-input-checkbox">Checkbox</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 미리 정의 된 목록의 0 개 이상의 값 집합
						</font></font></td>
					<td>
						<input type="checkBox" name="checkBox" value="C" checked="checked">
						<input type="checkBox" name="checkBox" value="T" checked="checked">
						<input type="checkBox" name="checkBox" value="V" checked="checked">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-radio">
							<code>radio</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-radio"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-radio"
								id="ref-for-element-statedef-input-radio③">Radio Button</a>
						</code></td>
					<td><font style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 열거 된 값 </font></font></td>
					<td>
						<input type="radio" name="radio" value="R" checked="checked">
					</td>
				</tr>
				<tr>
					<td><dfn data-dfn-for="input/type" data-dfn-type="attr-value"
							data-export="" id="attr-valuedef-input-type-file">
							<code>file</code>
							<a class="self-link"
								href="sec-forms.html#attr-valuedef-input-type-file"></a>
						</dfn></td>
					<td><code>
							<a data-link-type="element-sub"
								href="sec-forms.html#element-statedef-input-file"
								id="ref-for-element-statedef-input-file①">File Upload</a>
						</code></td>
					<td><font style="vertical-align: inherit;"></font><a
						data-link-type="dfn" href="infrastructure.html#mime-type"
						id="ref-for-mime-type②②"><font
							style="vertical-align: inherit;"><font
								style="vertical-align: inherit;">MIME 유형</font></font></a><font
						style="vertical-align: inherit;"><font
							style="vertical-align: inherit;"> 및 선택적으로 파일 이름을 </font><font
							style="vertical-align: inherit;">가진 0 개 이상의 파일</font></font></td>
					<td>
						<input type="file" name="files" value="">
					</td>
				</tr>
				
			</tbody>
		</table>
		<br/>
		<input type="submit" value="전송하기">
	</form>
</body>
</html>