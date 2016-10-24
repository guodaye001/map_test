package com.map.platform.interfaces.beans;

import java.util.Date;

import com.map.platform.commons.bean.BaseModel;

public class LocusInfo extends BaseModel{
	private static final long serialVersionUID = 1L;
	private Integer id;			
	private Integer userId;		
	private String ak;			//用户的ak，授权使用
	private String serviceId;	//servicede ID，作为其唯一标识
	private String latitude;	//纬度
	private String longitude;	//经度
	private String coordType;	//坐标类型 1：GPS经纬度坐标2：国测局加密经纬度坐标 3：百度加密经纬度坐标
	private String entityName;	//entity唯一标识
	private Date sendTime;		//发送时间
	private String mac;			//gps模块mac芯片码
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAk() {
		return ak;
	}
	public void setAk(String ak) {
		this.ak = ak;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCoordType() {
		return coordType;
	}
	public void setCoordType(String coordType) {
		this.coordType = coordType;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
}
