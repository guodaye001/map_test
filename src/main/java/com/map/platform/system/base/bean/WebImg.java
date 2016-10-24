package com.map.platform.system.base.bean;

import java.util.Date;

import com.map.platform.commons.bean.BaseModel;

public class WebImg extends BaseModel{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String imgAddr;
	private String linkAddr;
	private String imgType;
	private Integer imgIndex;
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
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	public String getLinkAddr() {
		return linkAddr;
	}
	public void setLinkAddr(String linkAddr) {
		this.linkAddr = linkAddr;
	}
	public String getImgType() {
		return imgType;
	}
	public void setImgType(String imgType) {
		this.imgType = imgType;
	}
	public Integer getImgIndex() {
		return imgIndex;
	}
	public void setImgIndex(Integer imgIndex) {
		this.imgIndex = imgIndex;
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
}
