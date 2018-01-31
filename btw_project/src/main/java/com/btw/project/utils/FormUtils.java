package com.btw.project.utils;

import java.text.DecimalFormat;

public class FormUtils {
	
	//=============================================
	// 1. checkBox or radio on/off -> true/false
	// 2. true/false -> checkBox or radio on/off
	//=============================================
	
	/**
	 * checkBox or radio on/off -> true/false
	 * @param value
	 * @return
	 */
	public static boolean getOnOffTrueFalse(String value) {
		boolean onOff = false;
		
		if( "on".equalsIgnoreCase(value)) {
			onOff = true;
		} else if ("off".equalsIgnoreCase(value)) {
			onOff = false;
		}
		
		return onOff;
	}
	
	/**
	 * 2. true/false -> checkBox or radio on/off
	 * @param onOff
	 * @return
	 */
	public static String getTrueFalseOnOff(boolean onOff) {
		String statusVal = "";
		
		if( onOff ) {
			statusVal = "on";
		} else if ( !onOff ) {
			statusVal = "off";
		}
		
		return statusVal;
	}
	
	//======================================
	// checkBox list -> list type
	//======================================
	public static String[] getCheckBoxList(String checkValue) {
		String[] checkList = checkValue.split(",");
		return checkList;
	}
	
	//======================================
	// number -> comma / comma -> number
	//======================================
	
	/**
	 * number add comma
	 * @param numStr
	 * @return
	 */
	public static String getAddCommaNumber(String numStr) {
		String commaStr = "";
		DecimalFormat format = new DecimalFormat("#,###");
		commaStr = format.format(Long.parseLong(numStr));
		return commaStr;
	}
	
	/**
	 * remove number comma
	 * @param commaStr
	 * @return
	 */
	public static String getRemoveComma(String commaStr) {
		String removeComma = "";
		removeComma = commaStr.replaceAll(",", "");
		
		return removeComma;
	}
	
	
}
