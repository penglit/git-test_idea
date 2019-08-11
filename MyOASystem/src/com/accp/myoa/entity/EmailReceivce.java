package com.accp.myoa.entity;

/**
 * EmailReceivce generated by MyEclipse Persistence Tools
 */

public class EmailReceivce implements java.io.Serializable {

	// Fields

	private Integer emailReceivceId;
	private Email email;
	private User user;
	private Integer emailState;

	// Constructors

	/** default constructor */
	public EmailReceivce() {
	}

	/** full constructor */
	public EmailReceivce(Email email, User user, Integer emailState) {
		this.email = email;
		this.user = user;
		this.emailState = emailState;
	}

	// Property accessors

	public Integer getEmailReceivceId() {
		return this.emailReceivceId;
	}

	public void setEmailReceivceId(Integer emailReceivceId) {
		this.emailReceivceId = emailReceivceId;
	}

	public Email getEmail() {
		return this.email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getEmailState() {
		return this.emailState;
	}

	public void setEmailState(Integer emailState) {
		this.emailState = emailState;
	}

}