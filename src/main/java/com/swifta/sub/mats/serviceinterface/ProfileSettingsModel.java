package com.swifta.sub.mats.serviceinterface;

import java.util.List;

public class ProfileSettingsModel {

	public Integer profileid;
	public Integer profiletypeid;
	public String configtype;
	public String configname;
	public String configdescription;
	public Integer counterthresholdtypeid;
	public List<Integer> transactiontypeid;
	public Double configlimitvalue;
	public Integer resetcounterevery;
	public String resetcountereveryinperiod;
	public String transactionid;
	public List<String> soapaction;
	public String responsemessage;
	public String responsecode;

	public ProfileSettingsModel() {
		// TODO Auto-generated constructor stub
	}

	public ProfileSettingsModel(Integer profileid, Integer profiletypeid,
			String configtype, String configname, String configdescription,
			Integer counterthresholdtypeid, List<Integer> transactiontypeid,
			Double configlimitvalue, Integer resetcounterevery,
			String resetcountereveryinperiod, String transactionid,
			List<String> soapaction, String responsemessage, String responsecode) {
		super();
		this.profileid = profileid;
		this.profiletypeid = profiletypeid;
		this.configtype = configtype;
		this.configname = configname;
		this.configdescription = configdescription;
		this.counterthresholdtypeid = counterthresholdtypeid;
		this.transactiontypeid = transactiontypeid;
		this.configlimitvalue = configlimitvalue;
		this.resetcounterevery = resetcounterevery;
		this.resetcountereveryinperiod = resetcountereveryinperiod;
		this.transactionid = transactionid;
		this.soapaction = soapaction;
		this.responsemessage = responsemessage;
		this.responsecode = responsecode;
	}

	public Integer getProfileid() {
		return profileid;
	}

	public void setProfileid(Integer profileid) {
		this.profileid = profileid;
	}

	public Integer getProfiletypeid() {
		return profiletypeid;
	}

	public void setProfiletypeid(Integer profiletypeid) {
		this.profiletypeid = profiletypeid;
	}

	public String getConfigtype() {
		return configtype;
	}

	public void setConfigtype(String configtype) {
		this.configtype = configtype;
	}

	public String getConfigname() {
		return configname;
	}

	public void setConfigname(String configname) {
		this.configname = configname;
	}

	public String getConfigdescription() {
		return configdescription;
	}

	public void setConfigdescription(String configdescription) {
		this.configdescription = configdescription;
	}

	public Integer getCounterthresholdtypeid() {
		return counterthresholdtypeid;
	}

	public void setCounterthresholdtypeid(Integer counterthresholdtypeid) {
		this.counterthresholdtypeid = counterthresholdtypeid;
	}

	public List<Integer> getTransactiontypeid() {
		return transactiontypeid;
	}

	public void setTransactiontypeid(List<Integer> transactiontypeid) {
		this.transactiontypeid = transactiontypeid;
	}

	public Double getConfiglimitvalue() {
		return configlimitvalue;
	}

	public void setConfiglimitvalue(Double configlimitvalue) {
		this.configlimitvalue = configlimitvalue;
	}

	public Integer getResetcounterevery() {
		return resetcounterevery;
	}

	public void setResetcounterevery(Integer resetcounterevery) {
		this.resetcounterevery = resetcounterevery;
	}

	public String getResetcountereveryinperiod() {
		return resetcountereveryinperiod;
	}

	public void setResetcountereveryinperiod(String resetcountereveryinperiod) {
		this.resetcountereveryinperiod = resetcountereveryinperiod;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public List<String> getSoapaction() {
		return soapaction;
	}

	public void setSoapaction(List<String> soapaction) {
		this.soapaction = soapaction;
	}

	public String getResponsemessage() {
		return responsemessage;
	}

	public void setResponsemessage(String responsemessage) {
		this.responsemessage = responsemessage;
	}

	public String getResponsecode() {
		return responsecode;
	}

	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}

}
