package com.btw.project.test.form.web;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.btw.project.utils.FormDateUtil;

@Controller
public class FormDateController {
	
	/**
	 * 1. YYYY-MM-DD -> DATE
	 * 2. YYYYMMDD -> DATE
     * 3. (1)YYYY (2)MM (3)DD -> DATE
	 * @return
	 */
	@RequestMapping("/form/dateForm.bt")
	public String getDateForm() {
		return "/form/date/dateForm"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	
	/**
	 * 1. YYYY-MM-DD -> DATE
	 * 2. YYYYMMDD -> DATE
     * 3. (1)YYYY (2)MM (3)DD -> DATE
	 * @return
	 */
	@RequestMapping("/form/saveDateForm.bt")
	public String saveDateForm(@RequestParam(value="dateString") String date1, @RequestParam(value="dateStr") String date2, @RequestParam(value="dotDate") String date3, @RequestParam(value="yyyy") String yyyy, @RequestParam(value="mm") String mm, @RequestParam(value="dd") String dd, HttpServletRequest request) throws ParseException {
		System.out.println(FormDateUtil.getYMDConvertDate(date1));
		
		System.out.println(FormDateUtil.getYMDConvertDate(date2));
		
		FormDateUtil.getYMDConvertDate(date3);
		
		System.out.println(FormDateUtil.getYMDConvertDate(yyyy, mm, dd));
		
		return "redirect:/form/dateForm.bt";
	}
	
	//=====================================================
	// Date Time ---> DATE 
	//=====================================================
	
	@RequestMapping("/form/dateTimeForm.bt")
	public String getDateTimeForm() {
		return "/form/date/dateTimeForm";
	}
	
	@RequestMapping("/form/saveDateTimeForm.bt")
	public String saveDateTime(HttpServletRequest request) throws ParseException {
		
		String timeStr1 = request.getParameter("timeStr1");
		
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String amPm = request.getParameter("amPm");
		System.out.println(timeStr1);
		System.out.println(date);
		System.out.println(time);
		System.out.println(amPm);
		
		//1.
		FormDateUtil.getDateTimeConvertDate(timeStr1);
		System.out.println();
		System.out.println();
		//2.
		FormDateUtil.getDateTimeConvertDate(date, time);
		FormDateUtil.getDateTimeConvertDate(time, date);
		System.out.println();
		System.out.println();
		FormDateUtil.getDateTimeConvertDate(date, time, amPm);
		FormDateUtil.getDateTimeConvertDate(time, amPm, date);
		
		
		return "redirect:/form/dateTimeForm.bt";
	}

}
