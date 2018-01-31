package com.btw.project.test.form.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	
	@RequestMapping("/form/multiParamForm.bt")
	public String getMultiParamJsp() {
		return "/form/multiParamForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
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
	/**
	 * Object Get ver
	 * @param multiData
	 * @return
	 */
	@RequestMapping("/form/saveMultiObjectForm.bt")
	public String saveMultiForm1(@RequestParam(value="file", required=false) MultipartFile partcpFile, MultiData multiData) {
		System.out.println("================= Object Form ==============================");
		System.out.println(multiData);
		System.out.println("File ==>" + partcpFile.getOriginalFilename());
		
		return "redirect:/form/multiForm.bt";
	}
	
	
	/**
	 * Object POST ver
	 * @param multiData
	 * @param partcpFile
	 * @return
	 */
	@RequestMapping(value = "/form/saveMultiObjectForm2.bt", method = RequestMethod.POST)
	public String saveMultiForm2(MultiData multiData) {
		System.out.println("================= Object Form ==============================");
		System.out.println(multiData);
		
		return "redirect:/form/multiForm.bt";
	}
	
	
	//============ Param Ver ====
	/**
	 * Param GET VER 
	 * @param multiData
	 * @param request
	 * @return
	 */
	@RequestMapping("/form/saveMultiParamForm.bt")
	public String saveMultiParamForm1(@RequestParam(value="file", required=false) MultipartFile partcpFile, HttpServletRequest request) {
		System.out.println(partcpFile);
		
		
		MultiData multiData = new MultiData();
		
		String hidden = request.getParameter("hidden");
		String text = request.getParameter("text");
		String search = request.getParameter("search");
		String tel = request.getParameter("tel");
		String url = request.getParameter("url");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String month = request.getParameter("month");
		String week = request.getParameter("week");
		String time = request.getParameter("time");
		String dateTimeString = request.getParameter("dateTimeString");
		
		//숫자 관련 
		String num = request.getParameter("number");
		String numString = request.getParameter("numString");
		String range = request.getParameter("range");
		String rangeStirng = request.getParameter("rangeString");
		
		String color = request.getParameter("color");
		String checkBox = request.getParameter("checkBox");
		String radio = request.getParameter("radio");
		String file = request.getParameter("file");
		
		multiData.setHidden(hidden);
		multiData.setText(text);
		multiData.setSearch(search);
		multiData.setTel(tel);
		multiData.setUrl(url);
		multiData.setEmail(email);
		multiData.setPassword(password);
		multiData.setMonth(month);
		multiData.setWeek(week);
		multiData.setTime(time);
		multiData.setDateTimeString(dateTimeString);
		
		multiData.setNum(Integer.parseInt(num));
		multiData.setNumString(numString);
		multiData.setRange(Integer.parseInt(range));
		multiData.setRangeString(rangeStirng);
		
		multiData.setColor(color);
		multiData.setCheckBox(checkBox);
		multiData.setRadio(radio);
		multiData.setFile(file);
		
		
		System.out.println("================= Param Form ==============================");
		System.out.println(multiData);
		System.out.println("==========  ======  =======  ==========  =========  ========");
		
		
		return "redirect:/form/multiParamForm.bt";
	}
	

	/**
	 * PARAM POST VER 
	 * @param partcpFile
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/form/saveMultiParamForm2.bt", method = RequestMethod.POST)
	public String saveMultiParamForm2(HttpServletRequest request, @RequestParam(value="files", required=false) MultipartFile partcpFile) {
		System.out.println("================= Param Form ==============================");
		System.out.println(partcpFile.getOriginalFilename());
		
		
		MultiData multiData = new MultiData();
		
		String hidden = request.getParameter("hidden");
		String text = request.getParameter("text");
		String search = request.getParameter("search");
		String tel = request.getParameter("tel");
		String url = request.getParameter("url");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String month = request.getParameter("month");
		String week = request.getParameter("week");
		String time = request.getParameter("time");
		String dateTimeString = request.getParameter("dateTimeString");
		
		//숫자 관련 
		String num = request.getParameter("number");
		String numString = request.getParameter("numString");
		String range = request.getParameter("range");
		String rangeStirng = request.getParameter("rangeString");
		
		String color = request.getParameter("color");
		String checkBox = request.getParameter("checkBox");
		String radio = request.getParameter("radio");
		String file = request.getParameter("file");
		
		multiData.setHidden(hidden);
		multiData.setText(text);
		multiData.setSearch(search);
		multiData.setTel(tel);
		multiData.setUrl(url);
		multiData.setEmail(email);
		multiData.setPassword(password);
		multiData.setMonth(month);
		multiData.setWeek(week);
		multiData.setTime(time);
		multiData.setDateTimeString(dateTimeString);
		
		multiData.setNum(Integer.parseInt(num));
		multiData.setNumString(numString);
		multiData.setRange(Integer.parseInt(range));
		multiData.setRangeString(rangeStirng);
		
		multiData.setColor(color);
		multiData.setCheckBox(checkBox);
		multiData.setRadio(radio);
		multiData.setFile(file);
		
		
		System.out.println("================= Request getParam ==============================");
		System.out.println(multiData);
		System.out.println("==========  ======  =======  ==========  =========  ========");
		return "redirect:/form/multiParamForm.bt";
	}
	
	
	/**
	 * 1. Request Param
	 * @param hidden
	 * @param text
	 * @param search
	 * @param tel
	 * @param url
	 * @param email
	 * @param password
	 * @param month
	 * @param week
	 * @param time
	 * @param dateTimeString
	 * @param num
	 * @param range
	 * @param color
	 * @param checkBox
	 * @param radio
	 * @param file
	 * @return
	 */
	@RequestMapping("/form/saveMultiParamForm3.bt")
	public String saveMultiParamForm3(String hidden, String text, String search, String tel, String url, String email
								, String password, String month, String week, String time, String dateTimeString, String num
								, String range, String color, String checkBox, String radio, String file) {
		
		
		MultiData multiData = new MultiData();
		multiData.setHidden(hidden);
		multiData.setText(text);
		multiData.setSearch(search);
		multiData.setTel(tel);
		multiData.setUrl(url);
		multiData.setEmail(email);
		multiData.setPassword(password);
		multiData.setMonth(month);
		multiData.setWeek(week);
		multiData.setTime(time);
		multiData.setDateTimeString(dateTimeString);
		
		multiData.setNum(Integer.parseInt(num));
		multiData.setRange(Integer.parseInt(range));
		
		multiData.setColor(color);
		multiData.setCheckBox(checkBox);
		multiData.setRadio(radio);
		multiData.setFile(file);
		
		System.out.println("================= Param Form ==============================");
		System.out.println(multiData);
		System.out.println("==========  ======  =======  ==========  =========  ========");
		
		
		return "redirect:/form/multiParamForm.bt";
	}
}
