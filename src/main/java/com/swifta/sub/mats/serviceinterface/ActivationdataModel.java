package com.swifta.sub.mats.serviceinterface;

public class ActivationdataModel {

	public String Operatorid;
	public String Confirmpassword;
	public String Currency;
	public String Firstpassword;
	public String Identificationno;
	public String Securityquestionanswer;
	public String StatusMessage;
	public String Username;
	public String Firstname;

	public ActivationdataModel() {
		super();
	}

	public ActivationdataModel(String operatorid, String confirmpassword,
			String currency, String firstpassword, String identificationno,
			String securityquestionanswer, String statusMessage,
			String username, String firstname) {
		super();
		Operatorid = operatorid;
		Confirmpassword = confirmpassword;
		Currency = currency;
		Firstpassword = firstpassword;
		Identificationno = identificationno;
		Securityquestionanswer = securityquestionanswer;
		StatusMessage = statusMessage;
		Username = username;
		Firstname = firstname;
	}

	public String getOperatorid() {
		return Operatorid;
	}

	public void setOperatorid(String operatorid) {
		Operatorid = operatorid;
	}

	public String getConfirmpassword() {
		return Confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		Confirmpassword = confirmpassword;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getFirstpassword() {
		return Firstpassword;
	}

	public void setFirstpassword(String firstpassword) {
		Firstpassword = firstpassword;
	}

	public String getIdentificationno() {
		return Identificationno;
	}

	public void setIdentificationno(String identificationno) {
		Identificationno = identificationno;
	}

	public String getSecurityquestionanswer() {
		return Securityquestionanswer;
	}

	public void setSecurityquestionanswer(String securityquestionanswer) {
		Securityquestionanswer = securityquestionanswer;
	}

	public String getStatusMessage() {
		return StatusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		StatusMessage = statusMessage;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

}
