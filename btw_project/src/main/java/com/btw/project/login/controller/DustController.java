package com.btw.project.login.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Dust View 노출 Controller
 * @author psy_world
 *
 */
@Controller
public class DustController {

	@RequestMapping(value = "/dust/index", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
	    model.addAttribute("foo", "server");
	    
	    HashMap<String, Object> test = new HashMap<>();
	    test.put("foo", "gggggggggggggggggggggggggggggg");
	    model.addAttribute("x", test);
	    return "foo";
	}
	
	@RequestMapping(value = "/dust/test", method = RequestMethod.GET)
	public String showFoo(Model model) throws Exception {
	    return "folder1/foo";
	}
}
