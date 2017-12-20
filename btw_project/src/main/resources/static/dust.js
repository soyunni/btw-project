var jsonMapper = new com.fasterxml.jackson.databind.ObjectMapper();

/**
 * Rendering template...
 *
 * @param template HTML text
 * @param model Spring's ModelMap object
 * @param url URL for Template HTML file
 * @returns {String}
 */
function render(src, model, url) {
    //TODO Compile template if needs
    var compiled = dust.compile(src); // compile
    var template = dust.loadSource(compiled); // load

    // Java object to JavaScript object
    var filteredModel = filterToJsonConversion(model);
    // JSON.stringfy(..)는 자바 POJO를 지원하지 않기 때문에 Jackson을 사용해 JSON으로 변환!
    var json = jsonMapper.writeValueAsString(filteredModel);

    if (!url.contains('default-error-view')) {
        console.log(
            "##################################################\n" +
            "화면 렌더링 로그" +
            "\n1. 템플릿 파일 경로(URL) : " + url +
            "\n2. 데이터(Java) : " + model +
            "\n3. 데이터(JSON) : " + json +
            "\n4. 화면코드(HTML) : \n" + src +
            "\n5. 렌더링코드(compiled HTML): \n" + template +
            "\n##################################################"
        );
    }

    // Render
    // Dust is basically asynchronously then this code has potentially issue with synchronous..
    var res;
    dust.render(template, JSON.parse(json), function (err, data) {
        if (err) {
            throw new Error(err);
        } else {
            res = data;
        }
    });
    return res;
}

function filterToJsonConversion(originArray) {
    var filteredArray = {};
    for (var k in originArray) {
        if (originArray[k] instanceof Java.type("org.springframework.validation.Errors")) {
            //skip...
        } else {
            filteredArray[k] = originArray[k];
        }
    }
    return filteredArray;
}

// thanks to https://github.com/sdeleuze/spring-react-isomorphic/blob/master/src/main/resources/static/render.js
function convertToJsonObject(javaObject) {
    var objectArray = {};
    for (var k in javaObject) {
        if (javaObject[k] instanceof Java.type("java.lang.Iterable")) {
            objectArray[k] = Java.from(javaObject[k]);
        } else if (javaObject[k] instanceof Java.type("org.springframework.validation.Errors")) {
            // skip..
            objectArray[k] = "";
        } else {
            objectArray[k] = javaObject[k];
        }
    }
    return objectArray;
}

function _dustCompile(key, source) {
    var compiled = dust.compile(source, key);
    return compiled;
}

function _dustLoad(template) {
    dust.loadSource(template);
}