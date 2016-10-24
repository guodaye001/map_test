package com.map.platform.system.base.bean;

import java.util.Date;

import com.map.platform.commons.bean.BaseModel;

public class WebNews extends BaseModel{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String content;
	private String author;
	private String newsAddr;
	private String isLoginNews;
	private Integer gradeLoginNews;
	private Date createTime;
	private String creator;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsLoginNews() {
		return isLoginNews;
	}
	public void setIsLoginNews(String isLoginNews) {
		this.isLoginNews = isLoginNews;
	}
	public Integer getGradeLoginNews() {
		return gradeLoginNews;
	}
	public void setGradeLoginNews(Integer gradeLoginNews) {
		this.gradeLoginNews = gradeLoginNews;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getNewsAddr() {
		return newsAddr;
	}
	public void setNewsAddr(String newsAddr) {
		this.newsAddr = newsAddr;
	}
}
