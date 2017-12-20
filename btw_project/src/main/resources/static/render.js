// 스프링에서 뷰파일을 찾아와 html생성을 위해 호출할 함수, return 하는 문자열이 클라이언트로 전송됨
function render(src, model, url) {
  //var compiled = dust.compile(src); // html파일 컴파일
  //var template = dust.loadSource(compiled); // 컴파일된 html파일을 dust에 로드
	print('*src*' + src);
	  print('*model*' + model);
	  print('*url*' + url);
  var pattern=/WEB-INF\/dust\/(.*)\.html/;
  
  var json = toJsonObject(model); // 컨트롤러에서 전송됨 모델을 json으로 변환
  var res;
  
  var dustId = pattern.exec(url)[1];
  
  print('*src*' + src);
  print('*model*' + model);
  print('*url*' + url);
  print('*ID*' + dustId);

  // 컴파일된 html, 맵핑할 json 객체를 파라미터로 넘겨 html생성
  dust.render(dustId, json, function (err, data) {
    if (err) {
      throw new Error(err);
    } else {
      res = data;
    }
  });

  return res;
}

// 모델객체를 json으로 변환
function toJsonObject(model) {
  var o = {};

  for (var k in model) {
    if (model[k] instanceof Java.type("java.lang.Iterable")) {
      o[k] = Java.from(model[k]);
    } else {
      o[k] = model[k];
    }
  }

  return o;
}

(function(){
    print('*********************************************************************************');
    print('**************************** Script Engine Loaded... ****************************');
    print('*********************************************************************************');
})();