package com.btw.project.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JSP View 노출
 * @author psy_world
 *
 */
@Controller
public class LoginController {

/*	@RequestMapping("/")
	public String getIndexPage() {
		return "foo";
	}*/
	
	@RequestMapping("/index.do")
	public String getIndexJsp() {
		return "index"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
}
