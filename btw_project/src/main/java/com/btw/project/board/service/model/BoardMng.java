package com.btw.project.board.service.model;

public class BoardMng {

	private String boardId = "";
	
	private String boardCategory = "";

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getBoardCategory() {
		return boardCategory;
	}

	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}

	@Override
	public String toString() {
		return "BoardMng [boardId=" + boardId + ", boardCategory=" + boardCategory + "]";
	}
	
	
}
