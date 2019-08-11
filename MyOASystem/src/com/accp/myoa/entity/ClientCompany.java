package com.accp.myoa.entity;

/**
 * ClientCompany generated by MyEclipse Persistence Tools
 */

public class ClientCompany implements java.io.Serializable {

	// Fields

	private Integer clientCompanyId;
	private Client client;
	private String companyName;
	private String comapnyPhone;
	private String companyAddress;
	private String companyRemark;

	// Constructors

	/** default constructor */
	public ClientCompany() {
	}

	/** full constructor */
	public ClientCompany(Client client, String companyName,
			String comapnyPhone, String companyAddress, String companyRemark) {
		this.client = client;
		this.companyName = companyName;
		this.comapnyPhone = comapnyPhone;
		this.companyAddress = companyAddress;
		this.companyRemark = companyRemark;
	}

	// Property accessors

	public Integer getClientCompanyId() {
		return this.clientCompanyId;
	}

	public void setClientCompanyId(Integer clientCompanyId) {
		this.clientCompanyId = clientCompanyId;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getComapnyPhone() {
		return this.comapnyPhone;
	}

	public void setComapnyPhone(String comapnyPhone) {
		this.comapnyPhone = comapnyPhone;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyRemark() {
		return this.companyRemark;
	}

	public void setCompanyRemark(String companyRemark) {
		this.companyRemark = companyRemark;
	}

}