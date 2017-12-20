package com.btw.project.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handlebar view 노출
 * @author psy_world
 *
 */
@Controller
public class HandlebarsController {

	@RequestMapping(value = "/handle/index", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
	    model.addAttribute("text", "server");
	    return "index";
	}
}
