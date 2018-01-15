package com.btw.project.test.form.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.btw.project.test.form.service.model.FormData;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@RequestMapping("/form")
@Controller
public class FormController {

	@RequestMapping("/form/index.do")
	public String getIndexJsp() {
		return "index"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	
	@RequestMapping("/form/formTypeList.bt")
	public String getFormTypeList() {
		return "form/formTypeList"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	@RequestMapping("/form/paramListForm.bt")
	public String getParamListForm() {
		return "form/paramListForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	@RequestMapping("/form/objectListForm.bt")
	public String getObjectListForm() {
		return "form/objectListForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	@RequestMapping("/form/defaultForm.bt")
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
	@RequestMapping("/form/saveDefaultForm.bt")
	public String saveDefaultForm(@RequestBody String data, FormData formData, HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException{
		
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
	
	/**
	 * 1. List 저장 param버전 
	 * @param data
	 * @param formData
	 * @param request
	 * @return
	 */
	@RequestMapping("/form/saveListFormParam.bt")
	public String saveListFormParam(HttpServletRequest request, String[] text1, String[] text2, String[] text3, String[] text4, String[] text5, String[] num1, String[] num2, String[] num3 ) {
		
		//1. == requst param ==
		//text
		String[] text1List = request.getParameterValues("text1");
		String[] text2List = request.getParameterValues("text2");
		String[] text3List = request.getParameterValues("text3");
		String[] text4List = request.getParameterValues("text4");
		String[] text5List = request.getParameterValues("text5");
		
		String[] num1List = request.getParameterValues("num1");
		String[] num2List = request.getParameterValues("num2");
		String[] num3List = request.getParameterValues("num3");
		
		//radio
		String[] radioVal1 = request.getParameterValues("radioVal1");
		//check box
		String[] checkBox1 = request.getParameterValues("checkBox1");
		
		List<FormData> formList = new ArrayList<FormData>();
		
		for(int i = 0; i < text1List.length; i++) {
			//1-1. == String to Object ==
			FormData paramForm = new FormData();
			//text
			paramForm.setText1(text1List[i]);
			paramForm.setText2(text2List[i]);
			paramForm.setText3(text3List[i]);
			paramForm.setText4(text4List[i]);
			paramForm.setText5(text5List[i]);
			//int(num)
			paramForm.setNum1(Integer.parseInt(num1List[i]));
			paramForm.setNum2(Integer.parseInt(num2List[i]));
			paramForm.setNum3(Integer.parseInt(num3List[i]));
			
			//radio
			//paramForm.setRadioVal1(radioVal1[i]);
			
			//checkbox
			//paramForm.setCheckBox1(checkBox1[i]);
			
			System.out.println("[" + i + "] " + paramForm );
			formList.add(paramForm);
		}
		
		System.out.println("===============================================");
		System.out.println("1. request Param ");
		System.out.println(formList);
		
		System.out.println("===============================================");
		System.out.println("2. Param list");
		List<FormData> formList2 = new ArrayList<FormData>();
		for(int i = 0; i < text1.length; i++) {
			FormData paramForm = new FormData();
			//text
			paramForm.setText1(text1[i]);
			paramForm.setText2(text2[i]);
			paramForm.setText3(text3[i]);
			paramForm.setText4(text4[i]);
			paramForm.setText5(text5[i]);
			//int(num)
			paramForm.setNum1(Integer.parseInt(num1[i]));
			paramForm.setNum2(Integer.parseInt(num1[i]));
			paramForm.setNum3(Integer.parseInt(num1[i]));
			
			//radio
			//paramForm.setRadioVal1(radioVal1[i]);
			
			//checkbox
			//paramForm.setCheckBox1(checkBox1[i]);
			
			System.out.println("[" + i + "] " + paramForm );
			formList2.add(paramForm);
		}
		
		System.out.println(formList2);
		return "redirect:/form/formTypeList.bt";
	}
	
	/**
	 * Object ver1
	 * @param list
	 * @return
	 */
	@RequestMapping("/form/saveListFormObject.bt")
	public String saveListFormObject1(FormData formlist, HttpServletRequest request) {
		System.out.println(formlist);
		
		if ( formlist != null) {
			for (FormData formData : formlist.getFormList()) {
				System.out.println(formData);
			}
		}
		return "redirect:/form/objectListForm.bt";
	}
	
}
