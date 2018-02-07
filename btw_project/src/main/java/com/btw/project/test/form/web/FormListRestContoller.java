package com.btw.project.test.form.web;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btw.project.test.form.service.model.TestData;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class FormListRestContoller {
	
	
	@RequestMapping("/form/saveRealRestTime.bt")
	public void saveRowForm(TestData testData) {
		System.out.println("받아온 데이타 : " + testData);
	}
	
	/**
	 * script Object 저장
	 * @param data
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping("/form/saveRestObject.bt")
	public void saveObjectForm(@RequestBody String data) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(data);
		
		ObjectMapper mapper = new ObjectMapper();
		List<TestData> formDataMapper = mapper.readValue(data, new TypeReference<List<TestData>>(){});
		System.out.println("Object Mapper ==> " + formDataMapper);
		
	}

}
