package com.zzsharing.model;

import javax.persistence.*;
import java.util.Date;

/**
* 留言信息
*/
@Entity
@Table(name = "t_Message")
public class Message {

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
	* 文章id，可空
	*/
	@Column(name = "f_articleId")
	private Integer articleId;

	/**
	* SET 方法
	* @param articleId 文章id，可空
	*/
	public void setArticleId(Integer articleId) {
		this.articleId=articleId;
	}

	/**
	* 文章id，可空
	* @return 文章id，可空
	*/
	public Integer getArticleId() {
		 return articleId;
	}

	/**
	* 文章标题，可空
	*/
	@Column(name = "f_articleTitle")
	private String articleTitle;

	/**
	* SET 方法
	* @param articleTitle 文章标题，可空
	*/
	public void setArticleTitle(String articleTitle) {
		this.articleTitle=articleTitle;
	}

	/**
	* 文章标题，可空
	* @return 文章标题，可空
	*/
	public String getArticleTitle() {
		 return articleTitle;
	}

	/**
	* 留言者的微信Openid
	*/
	@Column(name = "f_openid")
	private String openid;

	/**
	* SET 方法
	* @param openid 留言者的微信Openid
	*/
	public void setOpenid(String openid) {
		this.openid=openid;
	}

	/**
	* 留言者的微信Openid
	* @return 留言者的微信Openid
	*/
	public String getOpenid() {
		 return openid;
	}

	/**
	* 留言者的头像地址
	*/
	@Column(name = "f_headimg")
	private String headimg;

	/**
	* SET 方法
	* @param headimg 留言者的头像地址
	*/
	public void setHeadimg(String headimg) {
		this.headimg=headimg;
	}

	/**
	* 留言者的头像地址
	* @return 留言者的头像地址
	*/
	public String getHeadimg() {
		 return headimg;
	}

	/**
	* 留言者的昵称
	*/
	@Column(name = "f_nickname")
	private String nickname;

	/**
	* SET 方法
	* @param nickname 留言者的昵称
	*/
	public void setNickname(String nickname) {
		this.nickname=nickname;
	}

	/**
	* 留言者的昵称
	* @return 留言者的昵称
	*/
	public String getNickname() {
		 return nickname;
	}

	/**
	* 留言内容
	*/
	@Column(name = "f_content")
	@Lob
	private String content;

	/**
	* SET 方法
	* @param content 留言内容
	*/
	public void setContent(String content) {
		this.content=content;
	}

	/**
	* 留言内容
	* @return 留言内容
	*/
	public String getContent() {
		 return content;
	}

	/**
	* 留言日期
	*/
	@Column(name = "f_createDate")
	private Date createDate;

	/**
	* SET 方法
	* @param createDate 留言日期
	*/
	public void setCreateDate(Date createDate) {
		this.createDate=createDate;
	}

	/**
	* 留言日期
	* @return 留言日期
	*/
	public Date getCreateDate() {
		 return createDate;
	}

	/**
	* 回复日期
	*/
	@Column(name = "f_replyDate")
	private Date replyDate;

	/**
	* SET 方法
	* @param replyDate 回复日期
	*/
	public void setReplyDate(Date replyDate) {
		this.replyDate=replyDate;
	}

	/**
	* 回复日期
	* @return 回复日期
	*/
	public Date getReplyDate() {
		 return replyDate;
	}

	/**
	* 回复内容
	*/
	@Column(name = "f_replyContent")
	@Lob
	private String replyContent;

	/**
	* SET 方法
	* @param replyContent 回复内容
	*/
	public void setReplyContent(String replyContent) {
		this.replyContent=replyContent;
	}

	/**
	* 回复内容
	* @return 回复内容
	*/
	public String getReplyContent() {
		 return replyContent;
	}

	/**
	* 回复者ID
	*/
	@Column(name = "f_replyUserId")
	private Integer replyUserId;

	/**
	* SET 方法
	* @param replyUserId 回复者ID
	*/
	public void setReplyUserId(Integer replyUserId) {
		this.replyUserId=replyUserId;
	}

	/**
	* 回复者ID
	* @return 回复者ID
	*/
	public Integer getReplyUserId() {
		 return replyUserId;
	}

	/**
	* 回复者姓名
	*/
	@Column(name = "f_replyUsername")
	private String replyUsername;

	/**
	* SET 方法
	* @param replyUsername 回复者姓名
	*/
	public void setReplyUsername(String replyUsername) {
		this.replyUsername=replyUsername;
	}

	/**
	* 回复者姓名
	* @return 回复者姓名
	*/
	public String getReplyUsername() {
		 return replyUsername;
	}
}