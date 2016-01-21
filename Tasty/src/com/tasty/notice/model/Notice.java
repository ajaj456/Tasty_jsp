/*
 * notice의 정보가 담기는 클래스 
 * 여기서는 no, title, content, wdate
 */
package com.tasty.notice.model;

public class Notice {
	int no;
	String title, content, wdate, startDate, endDate,fileName;;
	
	public Notice() {
	}
	
	public Notice(int no, String title) {
		this.no = no;
		this.title = title;
	}

	public Notice(int no, String title,String content, String wdate, String startDate, String endDate,String fileName) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fileName = fileName;
	}
	public Notice(int no, String title, String wdate, String startDate, String endDate,String fileName) {
		this.no = no;
		this.title = title;
		this.wdate = wdate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fileName = fileName;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
