package com.zzsharing.model;

import javax.persistence.*;

/**
* 赞助信息
*/
@Entity
@Table(name = "t_Sponsor")
public class Sponsor {

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
	* 类型，1-支付宝；2-微信
	*/
	@Column(name = "f_type")
	private String type;

	/**
	* SET 方法
	* @param type 类型，1-支付宝；2-微信
	*/
	public void setType(String type) {
		this.type=type;
	}

	/**
	* 类型，1-支付宝；2-微信
	* @return 类型，1-支付宝；2-微信
	*/
	public String getType() {
		 return type;
	}
	/**
	* 赞助日期（String类型）
	*/
	@Column(name = "f_payDate")
	@Lob
	private String payDate;

	/**
	* SET 方法
	* @param payDate 赞助日期（String类型）
	*/
	public void setPayDate(String payDate) {
		this.payDate=payDate;
	}

	/**
	* 赞助日期（String类型）
	* @return 赞助日期（String类型）
	*/
	public String getPayDate() {
		 return payDate;
	}
	/**
	* 赞助人员昵称，前台只显示第一个字，如：王**
	*/
	@Column(name = "f_nickname")
	private String nickname;

	/**
	* SET 方法
	* @param nickname 赞助人员昵称，前台只显示第一个字，如：王**
	*/
	public void setNickname(String nickname) {
		this.nickname=nickname;
	}

	/**
	* 赞助人员昵称，前台只显示第一个字，如：王**
	* @return 赞助人员昵称，前台只显示第一个字，如：王**
	*/
	public String getNickname() {
		 return nickname;
	}
	/**
	* 金额，int类型，单位：分（暂定）
	*/
	@Column(name = "f_money")
	private Integer money;

	/**
	* SET 方法
	* @param money 金额，int类型，单位：分（暂定）
	*/
	public void setMoney(Integer money) {
		this.money=money;
	}

	/**
	* 金额，int类型，单位：分（暂定）
	* @return 金额，int类型，单位：分（暂定）
	*/
	public Integer getMoney() {
		 return money;
	}
}