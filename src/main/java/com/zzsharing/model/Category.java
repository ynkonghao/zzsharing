package com.zzsharing.model;

import javax.persistence.*;

/**
* 文章分类
*/
@Entity
@Table(name = "t_Category")
public class Category {

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
	* 分类名称
	*/
	@Column(name = "f_name")
	private String name;

	/**
	* SET 方法
	* @param name 分类名称
	*/
	public void setName(String name) {
		this.name=name;
	}

	/**
	* 分类名称
	* @return 分类名称
	*/
	public String getName() {
		 return name;
	}

	/**
	* 序号（用于展示排序）
	*/
	@Column(name = "f_orderNo")
	private Integer orderNo;

	/**
	* SET 方法
	* @param orderNo 序号（用于展示排序）
	*/
	public void setOrderNo(Integer orderNo) {
		this.orderNo=orderNo;
	}

	/**
	* 序号（用于展示排序）
	* @return 序号（用于展示排序）
	*/
	public Integer getOrderNo() {
		 return orderNo;
	}

	/**
	* 父ID
	*/
	@Column(name = "f_pid")
	private Integer pid;

	/**
	* SET 方法
	* @param pid 父ID
	*/
	public void setPid(Integer pid) {
		this.pid=pid;
	}

	/**
	* 父ID
	* @return 父ID
	*/
	public Integer getPid() {
		 return pid;
	}

	/**
	* 是否在导航栏显示，1-显示，0-不显示
	*/
	@Column(name = "f_isNav")
	private Integer isNav;

	/**
	* SET 方法
	* @param isNav 是否在导航栏显示，1-显示，0-不显示
	*/
	public void setIsNav(Integer isNav) {
		this.isNav=isNav;
	}

	/**
	* 是否在导航栏显示，1-显示，0-不显示
	* @return 是否在导航栏显示，1-显示，0-不显示
	*/
	public Integer getIsNav() {
		 return isNav;
	}

	/**
	* 学习序号（用于对学习先后排序）
	*/
	@Column(name = "f_studyNo")
	private Integer studyNo;

	/**
	* SET 方法
	* @param studyNo 学习序号（用于对学习先后排序）
	*/
	public void setStudyNo(Integer studyNo) {
		this.studyNo=studyNo;
	}

	/**
	* 学习序号（用于对学习先后排序）
	* @return 学习序号（用于对学习先后排序）
	*/
	public Integer getStudyNo() {
		 return studyNo;
	}

	/**
	* 关联分类（多个以逗号分隔）
	*/
	@Column(name = "f_relations")
	private String relations;

	/**
	* SET 方法
	* @param relations 关联分类（多个以逗号分隔）
	*/
	public void setRelations(String relations) {
		this.relations=relations;
	}

	/**
	* 关联分类（多个以逗号分隔）
	* @return 关联分类（多个以逗号分隔）
	*/
	public String getRelations() {
		 return relations;
	}
}