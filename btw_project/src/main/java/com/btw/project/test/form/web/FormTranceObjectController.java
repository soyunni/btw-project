package com.btw.project.test.form.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.btw.project.test.form.service.model.FormData;
import com.btw.project.test.form.service.model.MultiData;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

//@RequestMapping("/form")
@Controller
public class FormTranceObjectController {

	@RequestMapping("/form/objectForm.bt")
	public String getIndexJsp() {
		return "/form/objectForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	@RequestMapping("/form/multiForm.bt")
	public String getMultiJsp() {
		return "/form/multiForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
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
	@RequestMapping("/form/saveStringObjectForm.bt")
	public String saveDefaultForm(FormData data, HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException{
		//3. String value
		System.out.println("===============================================");
		System.out.println("3. String param ");
		System.out.println(data);
		System.out.println("=====> Object 변경");
		/*ObjectMapper mapper = new ObjectMapper();
		FormData formDataMapper = mapper.readValue(data, FormData.class);
		System.out.println("Object Mapper ==> " + formDataMapper);*/
		
		/*ObjectMapper mapper = new ObjectMapper();
		List<FormData> menuList = mapper.readValue(data, new TypeReference<List<FormData>>(){});
		System.out.println("Object Mapper ==> " + menuList);*/
		System.out.println("===============================================");
		
		return "redirect:/form/formTypeList.bt";
	}

	
	//============== multi form data =======================
	
	@RequestMapping("/form/saveMultiObjectForm.bt")
	public String saveMultiForm1(MultiData multiData) {
		System.out.println("================= Object Form ==============================");
		System.out.println(multiData);
		
		return "redirect:/form/multiForm.bt";
	}
}
