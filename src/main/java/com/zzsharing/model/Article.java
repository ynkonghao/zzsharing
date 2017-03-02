package com.zzsharing.model;

import javax.persistence.*;
import java.util.Date;

/**
* 文章
*/
@Entity
@Table(name = "t_Article")
public class Article {

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
	* 分类Id
	*/
	@Column(name = "f_cateId")
	private Integer cateId;

	/**
	* SET 方法
	* @param cateId 分类Id
	*/
	public void setCateId(Integer cateId) {
		this.cateId=cateId;
	}

	/**
	* 分类Id
	* @return 分类Id
	*/
	public Integer getCateId() {
		 return cateId;
	}

	/**
	* 分类名称
	*/
	@Column(name = "f_cateName")
	private String cateName;

	/**
	* SET 方法
	* @param cateName 分类名称
	*/
	public void setCateName(String cateName) {
		this.cateName=cateName;
	}

	/**
	* 分类名称
	* @return 分类名称
	*/
	public String getCateName() {
		 return cateName;
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
	* 标题
	*/
	@Column(name = "f_title")
	private String title;

	/**
	* SET 方法
	* @param title 标题
	*/
	public void setTitle(String title) {
		this.title=title;
	}

	/**
	* 标题
	* @return 标题
	*/
	public String getTitle() {
		 return title;
	}

	/**
	* 作者Id（上传者Id）
	*/
	@Column(name = "f_userId")
	private Integer userId;

	/**
	* SET 方法
	* @param userId 作者Id（上传者Id）
	*/
	public void setUserId(Integer userId) {
		this.userId=userId;
	}

	/**
	* 作者Id（上传者Id）
	* @return 作者Id（上传者Id）
	*/
	public Integer getUserId() {
		 return userId;
	}

	/**
	* 显示标记，1-显示，0-不显示
	*/
	@Column(name = "f_showFlag")
	private Integer showFlag;

	/**
	* SET 方法
	* @param showFlag 显示标记，1-显示，0-不显示
	*/
	public void setShowFlag(Integer showFlag) {
		this.showFlag=showFlag;
	}

	/**
	* 显示标记，1-显示，0-不显示
	* @return 显示标记，1-显示，0-不显示
	*/
	public Integer getShowFlag() {
		 return showFlag;
	}

	/**
	* 访问次数，默认值为0
	*/
	@Column(name = "f_readCount")
	private Integer readCount;

	/**
	* SET 方法
	* @param readCount 访问次数，默认值为0
	*/
	public void setReadCount(Integer readCount) {
		this.readCount=readCount;
	}

	/**
	* 访问次数，默认值为0
	* @return 访问次数，默认值为0
	*/
	public Integer getReadCount() {
		 return readCount;
	}

	/**
	* 点评次数，默认为0
	*/
	@Column(name = "f_applyCount")
	private Integer applyCount;

	/**
	* SET 方法
	* @param applyCount 点评次数，默认为0
	*/
	public void setApplyCount(Integer applyCount) {
		this.applyCount=applyCount;
	}

	/**
	* 点评次数，默认为0
	* @return 点评次数，默认为0
	*/
	public Integer getApplyCount() {
		 return applyCount;
	}

	/**
	* 作者名称（上传者nickname）
	*/
	@Column(name = "f_username")
	private String username;

	/**
	* SET 方法
	* @param username 作者名称（上传者nickname）
	*/
	public void setUsername(String username) {
		this.username=username;
	}

	/**
	* 作者名称（上传者nickname）
	* @return 作者名称（上传者nickname）
	*/
	public String getUsername() {
		 return username;
	}

	/**
	* 内容，以Markdown形式添加，**在前台列表时可以显示有“文”字样的图标**
	*/
	@Column(name = "f_content")
	@Lob
	private String content;

	/**
	* SET 方法
	* @param content 内容，以Markdown形式添加，**在前台列表时可以显示有“文”字样的图标**
	*/
	public void setContent(String content) {
		this.content=content;
	}

	/**
	* 内容，以Markdown形式添加，**在前台列表时可以显示有“文”字样的图标**
	* @return 内容，以Markdown形式添加，**在前台列表时可以显示有“文”字样的图标**
	*/
	public String getContent() {
		 return content;
	}

	/**
	* 导读，一般200字左右，添加时如果不手动输入则自动获取content中的前200个字符（过虑html标签后）
	*/
	@Column(name = "f_guide")
	private String guide;

	/**
	* SET 方法
	* @param guide 导读，一般200字左右，添加时如果不手动输入则自动获取content中的前200个字符（过虑html标签后）
	*/
	public void setGuide(String guide) {
		this.guide=guide;
	}

	/**
	* 导读，一般200字左右，添加时如果不手动输入则自动获取content中的前200个字符（过虑html标签后）
	* @return 导读，一般200字左右，添加时如果不手动输入则自动获取content中的前200个字符（过虑html标签后）
	*/
	public String getGuide() {
		 return guide;
	}

	/**
	* 图片地址，可以为空；**不为空时前台列表可以显示有“图”字样的图标**
	*/
	@Column(name = "f_picPath")
	private String picPath;

	/**
	* SET 方法
	* @param picPath 图片地址，可以为空；**不为空时前台列表可以显示有“图”字样的图标**
	*/
	public void setPicPath(String picPath) {
		this.picPath=picPath;
	}

	/**
	* 图片地址，可以为空；**不为空时前台列表可以显示有“图”字样的图标**
	* @return 图片地址，可以为空；**不为空时前台列表可以显示有“图”字样的图标**
	*/
	public String getPicPath() {
		 return picPath;
	}

	/**
	* 视频地址，可以为空；**不为空时前台列表可以显示有“影”字样的图标**
	*/
	@Column(name = "f_videoPath")
	private String videoPath;

	/**
	* SET 方法
	* @param videoPath 视频地址，可以为空；**不为空时前台列表可以显示有“影”字样的图标**
	*/
	public void setVideoPath(String videoPath) {
		this.videoPath=videoPath;
	}

	/**
	* 视频地址，可以为空；**不为空时前台列表可以显示有“影”字样的图标**
	* @return 视频地址，可以为空；**不为空时前台列表可以显示有“影”字样的图标**
	*/
	public String getVideoPath() {
		 return videoPath;
	}

	/**
	* 标签，可以有多个，多个标签以`,`隔开
	*/
	@Column(name = "f_tags")
	private String tags;

	/**
	* SET 方法
	* @param tags 标签，可以有多个，多个标签以`,`隔开
	*/
	public void setTags(String tags) {
		this.tags=tags;
	}

	/**
	* 标签，可以有多个，多个标签以`,`隔开
	* @return 标签，可以有多个，多个标签以`,`隔开
	*/
	public String getTags() {
		 return tags;
	}

	/**
	* 添加日期
	*/
	@Column(name = "f_createDate")
	private Date createDate;

	/**
	* SET 方法
	* @param createDate 添加日期
	*/
	public void setCreateDate(Date createDate) {
		this.createDate=createDate;
	}

	/**
	* 添加日期
	* @return 添加日期
	*/
	public Date getCreateDate() {
		 return createDate;
	}
}