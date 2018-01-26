package com.btw.project.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * - Form Date Convert JAVA Date Type
 * - 모든 브라우저에서 들어오는 Date에 대한 Form 데이타를 JAVA Date 타입으로 변환 하는 Util
 * @author psy_world
 *
 */
public class FormDateUtil {

	/**
	 * YYYY-MM-DD -> DATE
	 * @param yyyyMmDd
	 * @return
	 * @throws ParseException 
	 */
	public static Date getYMDConvertDate(String... dateStr) throws ParseException {
		/**
		 * param type
		 * 1. YYYY-MM-DD
		 * 2. YYYYMMDD
		 * 3. (1)YYYY (2)MM (3)DD 
		 */
		
		Date convertDate = null;
		
		//분류된 Param인지 파악
		if( 1 < dateStr.length) {
			String dateString = "";
			for (String date : dateStr) {
				dateString += date;
			}
			System.out.println("1. param ==> " + dateString);
			convertDate = new SimpleDateFormat("yyyyMMdd").parse(dateString);
		} else {
			//1. YYYY-MM-DD
			//2. YYYYMMDD
			String dateString = dateStr[0];
			System.out.println("1. param ==> " + dateString);
			if(dateString.matches(".*-.*")) {
				System.out.println("-");
				convertDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
			} else if(dateString.contains(".")) {
				System.out.println(".");
				convertDate = new SimpleDateFormat("yyyy.MM.dd").parse(dateString);
			} else if( dateString.contains("/")) {
				System.out.println("/");
				convertDate = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
			} else {
				System.out.println("else");
				convertDate = new SimpleDateFormat("yyyyMMdd").parse(dateString);
			}
		}
		System.out.println("2. result ==> " + convertDate);
		System.out.println("==========================================");
		return convertDate;
	}
	
	/**
	 * - Chrome form datetime-local 
	 * default : "YYYY-MM-DDThh:mm" -> Date Type
	 * ex1) fullStrig : YYYYMMDD or YYYY.MM.DD hh:mm
	 * ex2) 1: YYYY-MM-DD / YYYYMMDD / YYYY.MM.DD, 2 hh:mm
	 * ex3) 1: YYYY-MM-DD / YYYYMMDD / YYYY.MM.DD, 2: hh:mm, 3: am / pm
	 * @param dateTimes
	 * @return
	 * @throws ParseException 
	 */
	public static Date getDateTimeConvertDate(String... dateTimes) throws ParseException {
		Date convertDate = null;
		
		//0. value checkt
		if(dateTimes == null) {
			System.out.println(dateTimes);
			return null;
		}
		System.out.println("1. param length==> " + dateTimes.length);
		
		//== 1. param 갯수 파악하기
		String dateStr = "";
		//== 2. format String 선언
		if( dateTimes.length <= 1 ) {
			//3. 기준이 크롬이기 때문에 T문자열 replace처리
			dateStr = dateTimes[0].replaceAll("T", " ");
		} else if( dateTimes.length == 2 ) { 
			String timeFormat = "";
			
			for (String str : dateTimes) {
				if ( str.contains(":")) {
					timeFormat = str;
				} else {
					dateStr = str;
				}
			}
			
			dateStr = dateStr + " " + timeFormat;
			
		} else if( dateTimes.length == 3 ) {
			String amPm = "";
			String hh = "";
			String mm = "";
			
			for (String str : dateTimes) {
				if ( str.contains(":")) {
					//Time 저장
					hh = str.substring(0, 2);
					System.out.println(hh);
					mm = str.substring(3, 5);
					System.out.println(mm);
				} else if ( "AM".equalsIgnoreCase(str) || "PM".equalsIgnoreCase(str) ) {
					//AM/PM 구분
					amPm = str;
				} else {
					//시간저장
					dateStr = str;
				}
			}
			
			if ( "AM".equalsIgnoreCase(amPm) ) {
				int numHh = Integer.parseInt(hh);
				//오전 12시는 00시
				hh = String.valueOf( numHh == 12 ? "00" : numHh );
			} else if ( "PM".equalsIgnoreCase(amPm)) {
				int numHh = Integer.parseInt(hh);
				if ( numHh <= 12) {
					//12 시 = 정오 그 이외 12를 더해야함
					hh = String.valueOf( numHh < 12 ? (numHh + 12) : numHh );
				}
			}
			
			dateStr = dateStr + " " + hh + ":" + mm;
		}
		
		String timeFormat = "";
		System.out.println("2. replace String ==> " + dateStr);
		
		if( dateStr.contains("-")) {
			timeFormat = "yyyy-MM-dd hh:mm";
			System.out.println(timeFormat);
		} else if( dateStr.contains(".")) {
			timeFormat = "yyyy.MM.dd hh:mm";
			System.out.println(timeFormat);
		} else if( dateStr.contains("/")) {
			timeFormat = "yyyy/MM/dd hh:mm";
			System.out.println(timeFormat);
		} else {
			timeFormat = "yyyyMMdd hh:mm";
			System.out.println(timeFormat);
		}
		
		//== . 변환하기
		
		convertDate = new SimpleDateFormat(timeFormat).parse(dateStr);
		System.out.println("3. result ==> " + convertDate);
		System.out.println("==========================================");
		return convertDate;
	}
	

	//========================================================
	// String 변환  Date -> String
	//========================================================
	/**
	 * @param type
	 * @param date
	 * @return
	 */
	public static String getDateToString(String type, Date date) {
		String dateStr = "";
		
		String formatType = type;
		
		formatType = formatType.replaceAll("T", " ");
		SimpleDateFormat transFormat = new SimpleDateFormat(formatType);

		dateStr = transFormat.format(date);
		
		if( type.contains("T") ) {
			dateStr = dateStr.replaceAll(" ", "T");
		}
	
		return dateStr;
	}

	
	
	/**
	 * Time 형식으로 변경
	 * @param timeStr
	 * @return
	 */
	public static String getStringCnvertTime(String timeStr) {
		String convertTime = "";
		
		return convertTime;
	}
}
