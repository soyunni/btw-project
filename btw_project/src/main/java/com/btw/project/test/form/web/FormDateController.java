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
		//1. YYYY-MM-DD 
		System.out.println("1. YYYY-MM-DD -> " + FormDateUtil.getYMDConvertDate("2018-01-30")); //String: YYYY-MM-DD -> JAVA: Date

		//2. YYYYMMDD
		System.out.println("2. YYYYMMDD -> " + FormDateUtil.getYMDConvertDate("20180130")); //String: YYYYMMDD -> JAVA: Date

		//3. YYYY/MM/DD
		System.out.println("3.YYYY/MM/DD -> " + FormDateUtil.getYMDConvertDate("2018/01/30")); //String: YYYY/MM/DD -> JAVA: Date

		//4. YYYY.MM.DD
		System.out.println("4. YYYY.MM.DD -> " +FormDateUtil.getYMDConvertDate("2018.01.30")); //String: YYYY.MM.DD -> JAVA: Date

		//5. YYYY, MM, DD
		System.out.println("5. YYYY,MM,DD ->" + FormDateUtil.getYMDConvertDate("2018", "01", "30")); //String: YYYY,MM,DD -> JAVA: Date

		//5. YYYY-MM-DDThh:mm
		System.out.println("6.  YYYY-MM-DDThh:mm -> " +FormDateUtil.getDateTimeConvertDate("2018.01.30T15:59")); //String: YYYY-MM-DDThh:mm -> JAVA: Date
		
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
		
		/*String timeStr1 = request.getParameter("timeStr1");
		
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
		FormDateUtil.getDateTimeConvertDate(amPm, timeStr, yymmdd);*/
		
		
		//1. YYYY-MM-DDThh:mm
		System.out.println("1. YYYY-MM-DD -> " + FormDateUtil.getDateTimeConvertDate("2018-01-30T15:29") ); //String: YYYY-MM-DDThh:mm -> JAVA: Date

		//2. YYYY.MM.DD hh:mm
		System.out.println("2. YYYY.MM.DD hh:mm -> " + FormDateUtil.getDateTimeConvertDate("2018.01.30 14:22") ); //String: YYYY.MM.DD hh:mm -> JAVA: Date

		//3. YYYY/MM/DD, hh:mm
		System.out.println("3. YYYY/MM/DD, hh:mm -> " + FormDateUtil.getDateTimeConvertDate("2018/01/30", "20:15") ); //String: YYYY/MM/DD, hh:mm -> JAVA: Date

		//4. YYYYMMDD, hh:mm, am/pm
		System.out.println("4. YYYYMMDD, hh:mm, am/pm -> " + FormDateUtil.getDateTimeConvertDate("20180130", "am", "08:30" ) ); //String: YYYYMMDD, hh:mm, am/pm -> JAVA: Date
		
		return "redirect:/form/dateTimeForm.bt";
	}
	
	
	//=====================================================
	// Date ---> String 
	//=====================================================
	
	@RequestMapping("/form/dateStringForm.bt")
	public String getDateConvertStringForm(Model view) {
		
		Date date = new Date();
		
		//1. "YYYY-MM-DD"
		System.out.println("1. YYYY-MM-DD -> " + FormDateUtil.getDateToString("YYYY-MM-DD", date)); //JAVA : DATE -> String : "YYYY-MM-DD"

		//2. "YYYYMMDD"
		System.out.println("2. YYYYMMDD -> " + FormDateUtil.getDateToString("YYYYMMDD", date)); //JAVA : DATE -> String : "YYYYMMDD"

		//3. "YYYY/MM/DD"
		System.out.println("3. YYYY/MM/DD -> " + FormDateUtil.getDateToString("YYYY/MM/DD", date)); //JAVA : DATE -> String : "YYYY/MM/DD"

		//4. "YYYY"
		System.out.println("4. YYYY -> " + FormDateUtil.getDateToString("YYYY", date)); //JAVA : DATE -> String : "YYYY"

		//5. "MM"
		System.out.println("5. MM -> " + FormDateUtil.getDateToString("MM", date)); //JAVA : DATE -> String : "MM"

		//6. "DD"
		System.out.println("6. DD -> " + FormDateUtil.getDateToString("DD", date)); //JAVA : DATE -> String : "DD"

		//7. "YYYY-MM-DD"
		System.out.println("7. YYYY-MM-DD -> " + FormDateUtil.getDateToString("YYYY-MM-DD", date)); //JAVA : DATE -> String : "YYYY-MM-DD"

		//8. "YYYY-MM-DDThh:mm"
		System.out.println("8. YYYY-MM-DDThh:mm -> " + FormDateUtil.getDateToString("YYYY-MM-DDThh:mm", date)); //JAVA : DATE -> String : "YYYY-MM-DDThh:mm"

		//9. "YYYY.MM.DD hh:mm"
		System.out.println("9. YYYY.MM.DD hh:mm -> " + FormDateUtil.getDateToString("YYYY.MM.DD hh:mm", date)); //JAVA : DATE -> String : "YYYY.MM.DD hh:mm"

		//10. "hh:mm"
		System.out.println("10. hh:mm -> " + FormDateUtil.getDateToString("hh:mm", date)); //JAVA : DATE -> String : "hh:mm"
	
		return "/form/date/dateTimeForm";
	}

}
