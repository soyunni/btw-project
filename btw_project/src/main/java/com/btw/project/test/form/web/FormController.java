package com.btw.project.test.form.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.btw.project.test.form.service.model.FormData;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	@RequestMapping("/saveDefaultForm.bt")
	public String saveDefaultForm(@RequestBody String data, FormData formData, HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException{
		
		//1. == requst param ==
		//text
		String text1 = request.getParameter("text1");
		String text2 = request.getParameter("text2");
		String text3 = request.getParameter("text3");
		String text4 = request.getParameter("text4");
		String text5 = request.getParameter("text5");
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		
		//radio
		String radioVal1 = request.getParameter("radioVal1");
		//check box
		String checkBox1 = request.getParameter("checkBox1");
	
		//1-1. == String to Object ==
		FormData paramForm = new FormData();
		//text
		paramForm.setText1(text1);
		paramForm.setText2(text2);
		paramForm.setText3(text3);
		paramForm.setText4(text4);
		paramForm.setText5(text5);
		//int(num)
		paramForm.setNum1(Integer.parseInt(num1));
		paramForm.setNum2(Integer.parseInt(num2));
		paramForm.setNum3(Integer.parseInt(num3));
		
		//radio
		paramForm.setRadioVal1(radioVal1);
		
		//checkbox
		paramForm.setCheckBox1(checkBox1);
		
		System.out.println("===============================================");
		System.out.println("1. request Param ");
		System.out.println(paramForm);
		
		//2. Object
		System.out.println("===============================================");
		System.out.println("2. Object param ");
		System.out.println(formData);
		
		//3. String value
		System.out.println("===============================================");
		System.out.println("3. String param ");
		System.out.println(data);
		System.out.println("=====> Object 변경");
		ObjectMapper mapper = new ObjectMapper();
		FormData formDataMapper = mapper.readValue(data, FormData.class);
		System.out.println("Object Mapper ==> " + formDataMapper);
		System.out.println("===============================================");
		
		return "redirect:/form/formTypeList.bt";
	}
}
