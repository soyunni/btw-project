package com.btw.project.test.form.service.model;

/**
 * Form data 받을 객체
 * @author psy_world
 *
 */
public class FormData {

	private String text1 = "";
	private String text2 = "";
	private String text3 = "";
	private String text4 = "";
	private String text5 = "";
	
	private int num1 = 0;
	private int num2 = 0;
	private int num3 = 0;
	
	private String checkBox1 = "";
	private String radioVal1 = "";
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public String getText3() {
		return text3;
	}
	public void setText3(String text3) {
		this.text3 = text3;
	}
	public String getText4() {
		return text4;
	}
	public void setText4(String text4) {
		this.text4 = text4;
	}
	public String getText5() {
		return text5;
	}
	public void setText5(String text5) {
		this.text5 = text5;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public String getCheckBox1() {
		return checkBox1;
	}
	public void setCheckBox1(String checkBox1) {
		this.checkBox1 = checkBox1;
	}
	public String getRadioVal1() {
		return radioVal1;
	}
	public void setRadioVal1(String radioVal1) {
		this.radioVal1 = radioVal1;
	}
	@Override
	public String toString() {
		return "FormData [text1=" + text1 + ", text2=" + text2 + ", text3=" + text3 + ", text4=" + text4 + ", text5="
				+ text5 + ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", checkBox1=" + checkBox1
				+ ", radioVal1=" + radioVal1 + "]";
	}
	
	
	
}
