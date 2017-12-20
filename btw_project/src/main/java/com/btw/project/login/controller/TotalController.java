package com.btw.project.login.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TotalController {
	
	@RequestMapping(value = "/total/index", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
	    model.addAttribute("foo", "server");
	    
	    HashMap<String, Object> test = new HashMap<>();
	    test.put("foo", "gggggggggggggggggggggggggggggg");
	    model.addAttribute("x", test);
	    return "foo";
	}

}
