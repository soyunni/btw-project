package com.btw.project.test.form.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.btw.project.test.form.service.model.TestData;

@Controller
public class FormList1Controller {

	//=======================================
	// ROW Save
	//=======================================
	/**
	 * @return
	 */
	@RequestMapping("/form/list/realTimeForm.bt")
	public String getIndexJsp() {
		return "form/list/realTimeForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	/**
	 * @return
	 */
	
	@RequestMapping("/form/list/rowSubmit.bt")
	public String getRealTimeForm() {
		return "form/list/rowSubmit"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	/**
	 * @return
	 */
	
	@RequestMapping("/form/list/objectSubmit.bt")
	public String getObjectSubmitForm() {
		return "form/list/objectSubmit"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	/**
	 * 저장하기
	 * @param testData
	 */
	@RequestMapping("/form/saveRealTime.bt")
	public void saveRowForm(TestData testData) {
		System.out.println("받아온 데이타 : " + testData);
	}
	
	
}
