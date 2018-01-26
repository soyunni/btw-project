package com.btw.project.test.form.web;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String getDateForm(Model view) {
		
		String dateStr = FormDateUtil.getDateToString("YYYY-MM-DD", new Date());
		view.addAttribute("dateStr", dateStr);
		
		System.out.println(dateStr);
		
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
	/**
	 * 
	 * @param view
	 * @return
	 */
	@RequestMapping("/form/dateTimeForm.bt")
	public String getDateTimeForm(Model view) {
		
		String dateStr = FormDateUtil.getDateToString("YYYY-MM-DDThh:mm", new Date());
		
		String yyyymmdd = FormDateUtil.getDateToString("YYYY-MM-DD", new Date());
		String time = FormDateUtil.getDateToString("hh:mm", new Date());
		view.addAttribute("dateStr", dateStr);
		
		view.addAttribute("yyyymmdd", yyyymmdd);
		view.addAttribute("time", time);;
		
		String yyyy = FormDateUtil.getDateToString("YYYY", new Date());
		String mm = FormDateUtil.getDateToString("MM", new Date());
		String dd = FormDateUtil.getDateToString("DD", new Date());
		
		view.addAttribute("yyyy", yyyy);
		view.addAttribute("mm", mm);
		view.addAttribute("dd", dd);
		
		
		System.out.println(dateStr);
		
		return "/form/date/dateTimeForm";
	}
	
	@RequestMapping("/form/saveDateTimeForm.bt")
	public String saveDateTime(HttpServletRequest request) throws ParseException {
		
		String timeStr1 = request.getParameter("timeStr1");
		
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
		//1.
		FormDateUtil.getDateTimeConvertDate(timeStr1);
		System.out.println();
		System.out.println();
		//2.
		FormDateUtil.getDateTimeConvertDate(date, time);
		FormDateUtil.getDateTimeConvertDate(time, date);

		System.out.println();
		System.out.println();

		//3.
		String amPm = request.getParameter("amPm");
		String yyyy = request.getParameter("yyyy");
		String mm = request.getParameter("mm");
		String dd = request.getParameter("dd");
		
		String hour = request.getParameter("hour");
		String minute = request.getParameter("minute");
		
		String yymmdd = yyyy + mm + dd;
		String timeStr = hour + ":" + minute;
		
		
		FormDateUtil.getDateTimeConvertDate(yymmdd, timeStr, amPm);
		FormDateUtil.getDateTimeConvertDate(timeStr, amPm, yymmdd);
		FormDateUtil.getDateTimeConvertDate(amPm, timeStr, yymmdd);
		
		
		return "redirect:/form/dateTimeForm.bt";
	}

}
