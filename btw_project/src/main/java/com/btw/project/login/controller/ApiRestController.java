package com.btw.project.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btw.project.board.service.model.BoardMng;

/**
 * JSON 데이타 노출
 * @author psy_world
 *
 */
@RestController
public class ApiRestController {

	@RequestMapping("/api/emps")
	public List<BoardMng> getEmps() {
		
		BoardMng mng = new BoardMng();
		mng.setBoardCategory("TEST");
		mng.setBoardId("BTS");
		
		List<BoardMng> list = new ArrayList<BoardMng>();
		list.add(mng);
		return list;
	}
}
