package com.btw.project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardMngController {

	
	@RequestMapping("/board/boardMng")
	@ResponseBody
	public String getBoardMngView() {
		return "Board Mng!!!!";
	}
}
