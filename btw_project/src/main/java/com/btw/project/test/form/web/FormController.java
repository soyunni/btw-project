package com.btw.project.test.form.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/form")
@Controller
public class FormController {

	@RequestMapping("/index.do")
	public String getIndexJsp() {
		return "index"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
}
