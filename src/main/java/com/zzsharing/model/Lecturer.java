package com.zzsharing.model;

import javax.persistence.*;

/**
* 讲师
*/
@Entity
@Table(name = "t_Lecturer")
public class Lecturer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public void setId(Integer id) {
		 this.id = id;
	}

	public Integer getId() {
		return id;
	}

	/**
	* 讲师姓名
	*/
	@Column(name = "f_name")
	private String name;

	/**
	* SET 方法
	* @param name 讲师姓名
	*/
	public void setName(String name) {
		this.name=name;
	}

	/**
	* 讲师姓名
	* @return 讲师姓名
	*/
	public String getName() {
		 return name;
	}

	/**
	* 头像地址
	*/
	@Column(name = "f_headimg")
	private String headimg;

	/**
	* SET 方法
	* @param headimg 头像地址
	*/
	public void setHeadimg(String headimg) {
		this.headimg=headimg;
	}

	/**
	* 头像地址
	* @return 头像地址
	*/
	public String getHeadimg() {
		 return headimg;
	}

	/**
	* 简介信息
	*/
	@Column(name = "f_remark")
	@Lob
	private String remark;

	/**
	* SET 方法
	* @param remark 简介信息
	*/
	public void setRemark(String remark) {
		this.remark=remark;
	}

	/**
	* 简介信息
	* @return 简介信息
	*/
	public String getRemark() {
		 return remark;
	}
}