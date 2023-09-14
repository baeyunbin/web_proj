package com.notice;

public class NoticeDTO {
	private int noticeno 	;
	private String title 	;
	private String content	;
	private String wname 	;
	private String passwd	;
	private int cnt 		;
	private String rdate 	;
	public NoticeDTO(int noticeno, String title, String content, String wname, String passwd, int cnt, String rdate) {
		super();
		this.noticeno = noticeno;
		this.title = title;
		this.content = content;
		this.wname = wname;
		this.passwd = passwd;
		this.cnt = cnt;
		this.rdate = rdate;
	}
	public NoticeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NoticeDTO [noticeno=" + noticeno + ", title=" + title + ", content=" + content + ", wname=" + wname
				+ ", passwd=" + passwd + ", cnt=" + cnt + ", rdate=" + rdate + "]";
	}
	public int getNoticeno() {
		return noticeno;
	}
	public void setNoticeno(int noticeno) {
		this.noticeno = noticeno;
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
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	
	

}
