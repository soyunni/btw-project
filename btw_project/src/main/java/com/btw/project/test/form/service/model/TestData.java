package com.btw.project.test.form.service.model;

import java.util.Arrays;

/**
 * 저장할 Object
 * @author psy_world
 *
 */
public class TestData {

	private String id = "";
	private String name = "";
	private String description = "";
	
	private int age = 0;
	private int day = 0;
	
	private String option = "A";
	private String selection = "";
	
	private String check = "";
	
	private String[] checkList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String[] getCheckList() {
		return checkList;
	}

	public void setCheckList(String[] checkList) {
		this.checkList = checkList;
	}

	@Override
	public String toString() {
		return "TestData [id=" + id + ", name=" + name + ", description=" + description + ", age=" + age + ", day="
				+ day + ", option=" + option + ", selection=" + selection + ", check=" + check + ", checkList="
				+ Arrays.toString(checkList) + "]";
	}
	
	

}
