package com.btw.project.test.form.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/form")
@Controller
public class FormController {

	@RequestMapping("/index.do")
	public String getIndexJsp() {
		return "index"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	
	@RequestMapping("/formTypeList.bt")
	public String getFormTypeList() {
		return "form/formTypeList"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	@RequestMapping("/defaultForm.bt")
	public String getDefaultFormView() {
		return "form/defaultForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	
	//============== response data =======================
	
	/**
	 * 1. 기본 Form 저장
	 * ex) text, hidden, password, radio, checkbox
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/saveDefaultForm.bt")
	public String saveDefaultForm(HttpServletRequest request, HttpServletResponse response){
		
		//1. requst param
		String text1 = request.getParameter("text1");
		String text2 = request.getParameter("text2");
		String text3 = request.getParameter("text3");
		String text4 = request.getParameter("text4");
		String text5 = request.getParameter("text5");
		
		System.out.println("text1 : " + text1);
		System.out.println("text2 : " + text2);
		System.out.println("text3 : " + text3);
		System.out.println("text4 : " + text4);
		System.out.println("text5 : " + text5);
		
		
		String radioVal1 = request.getParameter("radioVal1");
		System.out.println("radioVal1 : " + radioVal1);
		
		String checkBox1 = request.getParameter("checkBox1");
		System.out.println("checkBox1 : " + checkBox1);
		
		//1-1. String to Object
		//2. Object
		
		//3. String value
		
		
		return "/form/formTypeList.bt";
	}
}
