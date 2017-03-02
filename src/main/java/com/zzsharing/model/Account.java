package com.zzsharing.model;

import javax.persistence.*;

/**
* 网友或微信用户
*/
@Entity
@Table(name = "t_Account")
public class Account {

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
	* 微信的Openid
	*/
	@Column(name = "f_openid")
	private String openid;

	/**
	* SET 方法
	* @param openid 微信的Openid
	*/
	public void setOpenid(String openid) {
		this.openid=openid;
	}

	/**
	* 微信的Openid
	* @return 微信的Openid
	*/
	public String getOpenid() {
		 return openid;
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
	* 昵称
	*/
	@Column(name = "f_nickname")
	private String nickname;

	/**
	* SET 方法
	* @param nickname 昵称
	*/
	public void setNickname(String nickname) {
		this.nickname=nickname;
	}

	/**
	* 昵称
	* @return 昵称
	*/
	public String getNickname() {
		 return nickname;
	}

	/**
	* 电话号码，可空，后期可以考虑在绑定时进行短信验证
	*/
	@Column(name = "f_phone")
	private String phone;

	/**
	* SET 方法
	* @param phone 电话号码，可空，后期可以考虑在绑定时进行短信验证
	*/
	public void setPhone(String phone) {
		this.phone=phone;
	}

	/**
	* 电话号码，可空，后期可以考虑在绑定时进行短信验证
	* @return 电话号码，可空，后期可以考虑在绑定时进行短信验证
	*/
	public String getPhone() {
		 return phone;
	}

	/**
	* 邮箱地址（绑定或注册时需要进行邮箱验证）
	*/
	@Column(name = "f_email")
	private String email;

	/**
	* SET 方法
	* @param email 邮箱地址（绑定或注册时需要进行邮箱验证）
	*/
	public void setEmail(String email) {
		this.email=email;
	}

	/**
	* 邮箱地址（绑定或注册时需要进行邮箱验证）
	* @return 邮箱地址（绑定或注册时需要进行邮箱验证）
	*/
	public String getEmail() {
		 return email;
	}
}