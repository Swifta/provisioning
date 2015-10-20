package com.swifta.provisioning.utils;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.Provisioningclient;
import com.swifta.sub.mats.operation.provisioning.v1.IdentificationType;
import com.swifta.sub.mats.operation.provisioning.v1.Securityquestions;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceCommissionModel;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModel;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.GetidentificationInt;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.ProfileSettingsModel;
import com.swifta.sub.mats.serviceinterface.RegistrationdataModel;
import com.swifta.sub.mats.serviceinterface.SetdefaultaccountModel;

public class ServiceImpl {

	public static DataResponse linkaccountrequest(
			java.lang.String loggedinUser, String childuserresourceid,
			String parentresourceid, String initiatingresourceid, int profileid)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		LinkaccountModel linkaccountModel = new LinkaccountModel();
		linkaccountModel.setLinkchildresourceid(childuserresourceid);
		linkaccountModel.setLinkparentaccountresourceid(parentresourceid);
		linkaccountModel.setinitiatinguserresourceid(initiatingresourceid);
		linkaccountModel.setProfileid(profileid);
		linkaccountModel.setTransactiontypeid("28");
		DataResponse dataResponse = provisioningclient
				.linkaccountrequest(linkaccountModel);
		return dataResponse;
	}

	public static DataResponse unlinkaccountrequest(
			java.lang.String loggedinUser, String childuserresourceid,
			String parentresourceid, String initiatingresourceid, int profileid)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		LinkaccountModel linkaccountModel = new LinkaccountModel();
		linkaccountModel.setLinkchildresourceid(childuserresourceid);
		linkaccountModel.setLinkparentaccountresourceid(parentresourceid);
		linkaccountModel.setinitiatinguserresourceid(initiatingresourceid);
		linkaccountModel.setProfileid(profileid);
		linkaccountModel.setTransactiontypeid("29");
		DataResponse dataResponse = provisioningclient
				.linkaccountrequest(linkaccountModel);
		return dataResponse;
	}

	public static DataResponse registration(
			java.lang.String loggedinUser,
			java.lang.String username,
			java.lang.String msisdn,
			java.lang.String email,
			int profileid,
			int bankcodeid,
			java.lang.String bankaccount,
			java.lang.String clearingnumber,
			com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails accountholderdetails,
			java.lang.String currencyid,
			java.lang.String bankdomainnameid,
			java.lang.String termscondition,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.Securityquestions> securityquestions)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		RegistrationdataModel registration = new RegistrationdataModel();

		registration.setOperatorid(loggedinUser);
		registration.setPrimarycontactname(accountholderdetails
				.getPrimarycontact().getName());
		registration.setPrimarycontactmobilenumber(accountholderdetails
				.getPrimarycontact().getMobilenumber());
		registration.setPrimarycontactphonenumber(accountholderdetails
				.getPrimarycontact().getPhonenumber());
		registration.setPrimarycontactemail(accountholderdetails
				.getPrimarycontact().getEmail());

		registration.setSecondarycontactname(accountholderdetails
				.getSecondarycontact().getName());
		registration.setSecondarycontactmobilenumber(accountholderdetails
				.getSecondarycontact().getMobilenumber());
		registration.setSecondarycontactphonenumber(accountholderdetails
				.getSecondarycontact().getPhonenumber());
		registration.setSecondarycontactemail(accountholderdetails
				.getSecondarycontact().getEmail());

		registration.setIdentificationnumber(accountholderdetails
				.getIdentification().getIdentificationNo());

		IdentificationType identificationType = accountholderdetails
				.getIdentification().getIdentificationType();
		registration.setIdentificationtypeid(GetidentificationInt
				.getIntval(identificationType));
		registration.setExpirydate(accountholderdetails.getIdentification()
				.getExpirydate().toString());
		registration.setIsssuer(accountholderdetails.getIdentification()
				.getIssuer());
		registration.setIssueDate(accountholderdetails.getIdentification()
				.getIssueDate());

		registration.setStreetaddress(accountholderdetails.getAddress()
				.getStreetaddress());
		registration.setPostalCode(accountholderdetails.getAddress()
				.getPostalCode());
		registration.setCity(accountholderdetails.getAddress().getCity());
		registration.setProvince(accountholderdetails.getAddress()
				.getProvince());

		registration.setFirstname(accountholderdetails.getFirstname());
		registration.setLastname(accountholderdetails.getLastname());
		registration.setMiddlename(accountholderdetails.getMiddlename());
		registration.setSuffix(accountholderdetails.getSuffix());
		registration.setPrefix(accountholderdetails.getPrefix());
		registration.setGender(accountholderdetails.getGender().toString());
		registration.setCountryid(accountholderdetails.getCountryid());
		registration.setCountrystateid(accountholderdetails.getStateid());
		registration.setCountrystatelgaid(accountholderdetails.getLgaid());
		registration.setLanguageid(accountholderdetails.getLanguageid());
		registration.setOccupation(accountholderdetails.getOccupation());
		registration.setEmployer(accountholderdetails.getEmployer());
		registration.setDateofbirth(accountholderdetails.getDateofbirth()
				.toString());
		registration.setUsername(username);
		registration.setMsisdn(msisdn);
		registration.setEmail(email);
		registration.setProfileid(profileid);
		registration.setBankcodeid(bankcodeid);
		registration.setBankaccount(bankaccount);
		registration.setClearingnumber(clearingnumber);
		registration.setCurrencyid(new Integer(currencyid));
		registration.setTermscondition(termscondition);
		registration.setStatusMessage("1");
		registration.setReason("1");
		registration.setTransactionid(-1);

		for (Securityquestions securityquestions2 : securityquestions) {
			registration.setSecurityquestions(securityquestions2.getQuestion());
			registration.setSecurityquestionanswer(securityquestions2
					.getAnswer());
		}

		DataResponse dataResponse = provisioningclient
				.registration(registration);

		return dataResponse;

	}

	public static DataResponse setupservicefee(
			java.lang.String loggedinUser,
			java.lang.Integer userresourceid,
			java.lang.Integer serviceconfigtype,
			java.lang.Integer transactiontypeid,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceFeeModel serviceFeeModel = new ServiceFeeModel();
		serviceFeeModel.setLoggedInuser(loggedinUser);
		serviceFeeModel.setUserresourceid(userresourceid);
		serviceFeeModel.setServiceconfigtype(serviceconfigtype);
		serviceFeeModel.setTransactiontypeid(transactiontypeid);
		serviceFeeModel.setServicefees(servicefeedetails);

		DataResponse daResponse = provisioningclient.setupfees(serviceFeeModel);

		return daResponse;

	}

	public static DataResponse editservicefee(
			java.lang.String loggedinUser,
			java.lang.Integer userresourceid,
			java.lang.Integer serviceconfigtype,
			java.lang.Integer transactiontypeid,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceFeeModel serviceFeeModel = new ServiceFeeModel();
		serviceFeeModel.setLoggedInuser(loggedinUser);
		serviceFeeModel.setUserresourceid(userresourceid);
		serviceFeeModel.setServiceconfigtype(serviceconfigtype);
		serviceFeeModel.setTransactiontypeid(transactiontypeid);
		serviceFeeModel.setServicefees(servicefeedetails);

		DataResponse daResponse = provisioningclient.editfees(serviceFeeModel);

		return daResponse;

	}

	public static DataResponse deleteservicefee(java.lang.String loggedinUser,
			java.lang.Integer userresourceid,
			java.lang.Integer transactiontypeid) throws RemoteException,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceFeeModel serviceFeeModel = new ServiceFeeModel();
		serviceFeeModel.setLoggedInuser(loggedinUser);
		serviceFeeModel.setUserresourceid(userresourceid);
		serviceFeeModel.setTransactiontypeid(transactiontypeid);

		DataResponse daResponse = provisioningclient
				.deletefees(serviceFeeModel);

		return daResponse;

	}

	public static DataResponse setupcommission(
			java.lang.String loggedinUser,
			java.lang.Integer userresourceid,
			java.lang.Integer commissionsetuptype,
			java.lang.Integer servicefeepropertiesid,
			java.lang.Integer transactiontypeid,
			BigDecimal commissionfeefortrnxfee,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceCommissionModel serviceCommissionModel = new ServiceCommissionModel();
		serviceCommissionModel.setLoggedInuser(loggedinUser);
		serviceCommissionModel.setUserresourceid(userresourceid);
		serviceCommissionModel.setCommissionconfigtype(commissionsetuptype);
		serviceCommissionModel
				.setServicefeepropertiesid(servicefeepropertiesid);
		serviceCommissionModel.setTransactiontypeid(transactiontypeid);
		serviceCommissionModel.setCommissionfee(commissionfeefortrnxfee);
		serviceCommissionModel.setServicecommissions(servicecommissiondetails);

		DataResponse daResponse = provisioningclient
				.setupcommission(serviceCommissionModel);

		return daResponse;

	}

	public static DataResponse editcommission(
			java.lang.String loggedinUser,
			java.lang.Integer userresourceid,
			java.lang.Integer commissionsetuptype,
			java.lang.Integer servicefeepropertiesid,
			java.lang.Integer transactiontypeid,
			BigDecimal commissionfeefortrnxfee,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceCommissionModel serviceCommissionModel = new ServiceCommissionModel();
		serviceCommissionModel.setLoggedInuser(loggedinUser);
		serviceCommissionModel.setUserresourceid(userresourceid);
		serviceCommissionModel.setCommissionconfigtype(commissionsetuptype);
		serviceCommissionModel
				.setServicefeepropertiesid(servicefeepropertiesid);
		serviceCommissionModel.setTransactiontypeid(transactiontypeid);
		serviceCommissionModel.setCommissionfee(commissionfeefortrnxfee);
		serviceCommissionModel.setServicecommissions(servicecommissiondetails);

		DataResponse daResponse = provisioningclient
				.editcommission(serviceCommissionModel);

		return daResponse;

	}

	public static DataResponse deletecommission(java.lang.String loggedinUser,
			java.lang.Integer userresourceid,
			java.lang.Integer servicefeepropertiesid,
			java.lang.Integer transactiontypeid) throws RemoteException,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceCommissionModel serviceCommissionModel = new ServiceCommissionModel();
		serviceCommissionModel.setLoggedInuser(loggedinUser);
		serviceCommissionModel.setUserresourceid(userresourceid);
		serviceCommissionModel
				.setServicefeepropertiesid(servicefeepropertiesid);
		serviceCommissionModel.setTransactiontypeid(transactiontypeid);

		DataResponse daResponse = provisioningclient
				.deletecommission(serviceCommissionModel);
		return daResponse;

	}

	public static DataResponse activationrequest(
			java.lang.String loggedinUser,
			java.lang.String resourceid,
			com.swifta.sub.mats.operation.provisioning.v1.Credentials credential,
			java.lang.String securityquestionanswer,
			java.lang.String identificationno, java.lang.String bankdomainid,
			java.lang.String currency) throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ActivationdataModel activationdataModel = new ActivationdataModel();
		activationdataModel.setOperatorid(loggedinUser);
		activationdataModel.setFirstpassword(credential.getFirstpin());
		activationdataModel.setConfirmpassword(credential.getConfirmpin());
		activationdataModel.setCurrency(currency);
		activationdataModel.setIdentificationno(identificationno);
		activationdataModel.setUsername(resourceid);
		activationdataModel.setSecurityquestionanswer(securityquestionanswer);

		DataResponse dataResponse = provisioningclient
				.activation(activationdataModel);

		return dataResponse;
	}

	public static DataResponse setdefaultaccount(java.lang.String loggedinUser,
			java.lang.String childuserresourceid,
			java.lang.String paraentaccountresourceid,
			java.lang.String initiatinguserresourceid) throws RemoteException,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		SetdefaultaccountModel setdefaultaccountModel = new SetdefaultaccountModel();
		setdefaultaccountModel.setDchilduserresourceid(childuserresourceid);
		setdefaultaccountModel
				.setDparentaccountresourceid(paraentaccountresourceid);
		setdefaultaccountModel
				.setInitiatinguserresourceid(initiatinguserresourceid);

		DataResponse dataResponse = provisioningclient
				.setdefaultaccount(setdefaultaccountModel);

		return dataResponse;
	}

	public static DataResponse authenticate(java.lang.String resourceid,
			java.lang.String password) {

		return null;

	}

	public static DataResponse removeProfilePermission(
			java.lang.String loggedinUser, java.lang.String profilename,
			int profileid, java.util.List<java.lang.String> operation)
			throws Exception, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(0.00);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("removepermission");
		profileSettingsModel.setCounterthresholdtypeid(0);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setProfiletypeid(0);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(operation);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(null);

		DataResponse dataResponse = provisioningclient
				.profilesettings(profileSettingsModel);

		return dataResponse;

	}

	public static DataResponse removeProfile(java.lang.String loggedinUser,
			java.lang.String profilename, int profileid) throws Exception,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(0.00);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("deleteprofile");
		profileSettingsModel.setCounterthresholdtypeid(0);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setProfiletypeid(0);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(null);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(null);

		DataResponse dataResponse = provisioningclient
				.profilesettings(profileSettingsModel);

		return dataResponse;

	}

	public static DataResponse setProfilePermission(
			java.lang.String loggedinUser, java.lang.String profilename,
			int profileid, java.util.List<java.lang.String> operation)
			throws Exception, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(0.00);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("addpermission");
		profileSettingsModel.setCounterthresholdtypeid(0);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setProfiletypeid(0);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(operation);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(null);

		DataResponse dataResponse = provisioningclient
				.profilesettings(profileSettingsModel);

		return dataResponse;

	}

	public static DataResponse addProfile(java.lang.String loggedinUser,
			java.lang.String profilename, int profileidtypeid)
			throws Exception, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(0.00);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("addprofile");
		profileSettingsModel.setCounterthresholdtypeid(0);
		profileSettingsModel.setProfileid(0);
		profileSettingsModel.setProfiletypeid(profileidtypeid);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(null);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(null);

		DataResponse dataResponse = provisioningclient
				.profilesettings(profileSettingsModel);

		return dataResponse;

	}

	public static DataResponse editProfile(java.lang.String loggedinUser,
			java.lang.String profilename, int profileid) throws Exception,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(0.00);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("editprofile");
		profileSettingsModel.setCounterthresholdtypeid(0);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setProfiletypeid(0);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(null);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(null);

		DataResponse dataResponse = provisioningclient
				.profilesettings(profileSettingsModel);

		return dataResponse;
	}

	public static DataResponse addProfileThreshold(
			java.lang.String loggedinUser, java.lang.String profilename,
			int profileid, java.util.List<Integer> action, int thresholdtypeid,
			int profiletypeid, String value) throws Exception, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		double dvalue = Double.parseDouble(value);

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(dvalue);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("threshold");
		profileSettingsModel.setCounterthresholdtypeid(thresholdtypeid);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setProfiletypeid(profiletypeid);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(null);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(action);

		DataResponse dataResponse = provisioningclient
				.profilesettings(profileSettingsModel);

		return dataResponse;
	}

	public static DataResponse editProfileThreshold(
			java.lang.String loggedinUser, java.lang.String profilename,
			int profileid, java.util.List<Integer> action, int thresholdtypeid,
			int profiletypeid, String value) throws Exception, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		double dvalue = Double.parseDouble(value);

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();
		profileSettingsModel.setConfigdescription("0");
		profileSettingsModel.setConfiglimitvalue(dvalue);
		profileSettingsModel.setConfigname(profilename);
		profileSettingsModel.setConfigtype("threshold");
		profileSettingsModel.setCounterthresholdtypeid(thresholdtypeid);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setProfiletypeid(profiletypeid);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(null);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(action);

		DataResponse dataResponse = provisioningclient
				.editthresholdonprofile(profileSettingsModel);

		return dataResponse;
	}

	public static DataResponse deleteProfileThreshold(
			java.lang.String loggedinUser, int profileid, int thresholdtypeid,
			java.util.List<Integer> action) throws Exception, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ProfileSettingsModel profileSettingsModel = new ProfileSettingsModel();

		profileSettingsModel.setCounterthresholdtypeid(thresholdtypeid);
		profileSettingsModel.setProfileid(profileid);
		profileSettingsModel.setResetcounterevery(0);
		profileSettingsModel.setResetcountereveryinperiod("0");
		profileSettingsModel.setResponsecode("0");
		profileSettingsModel.setResponsemessage("0");
		profileSettingsModel.setSoapaction(null);
		profileSettingsModel.setTransactionid("-1");
		profileSettingsModel.setTransactiontypeid(action);

		DataResponse dataResponse = provisioningclient
				.deletethresholdonprofile(profileSettingsModel);

		return dataResponse;
	}

}
