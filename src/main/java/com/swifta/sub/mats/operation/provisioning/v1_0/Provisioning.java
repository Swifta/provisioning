package com.swifta.sub.mats.operation.provisioning.v1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1 2015-05-18T15:14:24.457+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "Provisioning")
@XmlSeeAlso({ com.swifta.sub.mats.operation.provisioning.v1.ObjectFactory.class })
public interface Provisioning {

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "deleteProfileThreshold", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.DeleteProfileThreshold")
	@WebMethod(action = "deleteProfileThreshold")
	@ResponseWrapper(localName = "deleteProfileThresholdResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.DeleteProfileThresholdResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.DeleteProfileThresholdrequestresponse deleteProfileThreshold(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "action", targetNamespace = "") java.util.List<java.lang.Integer> action,
			@WebParam(name = "thresholdtypeid", targetNamespace = "") int thresholdtypeid,
			@WebParam(name = "profileid", targetNamespace = "") int profileid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "removeProfilePermission", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.RemoveProfilePermission")
	@WebMethod(action = "removeProfilePermission")
	@ResponseWrapper(localName = "removeProfilePermissionResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.RemoveProfilePermissionResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.RemoveProfilePermissionrequestresponse removeProfilePermission(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "operation", targetNamespace = "") java.util.List<java.lang.String> operation);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "removeProfile", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.RemoveProfile")
	@WebMethod(action = "removeProfile")
	@ResponseWrapper(localName = "removeProfileResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.RemoveProfileResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.RemoveProfilerequestresponse removeProfile(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "profileid", targetNamespace = "") int profileid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "setProfilePermission", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetProfilePermission")
	@WebMethod(action = "setProfilePermission")
	@ResponseWrapper(localName = "setProfilePermissionResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetProfilePermissionResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.SetProfilePermissionrequestresponse setProfilePermission(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "operation", targetNamespace = "") java.util.List<java.lang.String> operation);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "setupcommission", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setupcommission")
	@WebMethod(action = "setupcommission")
	@ResponseWrapper(localName = "setupcommissionResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetupcommissionResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Servicecommissionrequestresponse setupcommission(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.Integer userresourceid,
			@WebParam(name = "commissionsetuptype", targetNamespace = "") java.lang.Integer commissionsetuptype,
			@WebParam(name = "servicefeepropertiesid", targetNamespace = "") java.lang.Integer servicefeepropertiesid,
			@WebParam(name = "transactiontypeid", targetNamespace = "") java.lang.Integer transactiontypeid,
			@WebParam(name = "commissionfeefortrnxfee", targetNamespace = "") java.math.BigDecimal commissionfeefortrnxfee,
			@WebParam(name = "servicecommissiondetails", targetNamespace = "") java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "addProfile", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddProfile")
	@WebMethod(action = "addProfile")
	@ResponseWrapper(localName = "addProfileResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddProfileResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.AddProfilerequestresponse addProfile(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "profiletypeid", targetNamespace = "") int profiletypeid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "suspendaccountholder", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Suspendaccountholder")
	@WebMethod(action = "suspendaccountholder")
	@ResponseWrapper(localName = "suspendaccountholderResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SuspendaccountholderResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Suspendaccountholderrequestresponse suspendaccountholder(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "resourceid", targetNamespace = "") java.lang.String resourceid,
			@WebParam(name = "confirmcredential", targetNamespace = "") java.lang.String confirmcredential);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "linkaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Linkaccount")
	@WebMethod(action = "linkaccount")
	@ResponseWrapper(localName = "linkaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.LinkaccountResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Linkaccountrequestresponse linkaccount(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "initiatinguserresourceid", targetNamespace = "") java.lang.String initiatinguserresourceid,
			@WebParam(name = "childuserresourceid", targetNamespace = "") java.lang.String childuserresourceid,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "paraentaccountresourceid", targetNamespace = "") java.lang.String paraentaccountresourceid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "editProfileThreshold", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.EditProfileThreshold")
	@WebMethod(action = "editProfileThreshold")
	@ResponseWrapper(localName = "editProfileThresholdResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.EditProfileThresholdResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.EditProfileThresholdrequestresponse editProfileThreshold(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "action", targetNamespace = "") java.util.List<java.lang.Integer> action,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "thresholdtypeid", targetNamespace = "") int thresholdtypeid,
			@WebParam(name = "profiletypeid", targetNamespace = "") int profiletypeid,
			@WebParam(name = "value", targetNamespace = "") java.lang.String value);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "addProfileThreshold", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddProfileThreshold")
	@WebMethod(action = "addProfileThreshold")
	@ResponseWrapper(localName = "addProfileThresholdResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddProfileThresholdResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.AddProfileThresholdrequestresponse addProfileThreshold(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "action", targetNamespace = "") java.util.List<java.lang.Integer> action,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "thresholdtypeid", targetNamespace = "") int thresholdtypeid,
			@WebParam(name = "profiletypeid", targetNamespace = "") int profiletypeid,
			@WebParam(name = "value", targetNamespace = "") java.lang.String value);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "registration", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Registration")
	@WebMethod(action = "registration")
	@ResponseWrapper(localName = "registrationResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.RegistrationResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Registrationrequestresponse registration(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "username", targetNamespace = "") java.lang.String username,
			@WebParam(name = "msisdn", targetNamespace = "") java.lang.String msisdn,
			@WebParam(name = "email", targetNamespace = "") java.lang.String email,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "bankcodeid", targetNamespace = "") int bankcodeid,
			@WebParam(name = "bankaccount", targetNamespace = "") java.lang.String bankaccount,
			@WebParam(name = "clearingnumber", targetNamespace = "") java.lang.String clearingnumber,
			@WebParam(name = "accountholderdetails", targetNamespace = "") com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails accountholderdetails,
			@WebParam(name = "currencyid", targetNamespace = "") java.lang.String currencyid,
			@WebParam(name = "bankdomainnameid", targetNamespace = "") java.lang.String bankdomainnameid,
			@WebParam(name = "termscondition", targetNamespace = "") java.lang.String termscondition,
			@WebParam(name = "securityquestions", targetNamespace = "") java.util.List<com.swifta.sub.mats.operation.provisioning.v1.Securityquestions> securityquestions);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "addcustodyaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Addcustodyaccount")
	@WebMethod(action = "addcustodyaccount")
	@ResponseWrapper(localName = "addcustodyaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddcustodyaccountResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Addcustodyaccountrequestresponse addcustodyaccount(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "currencycode", targetNamespace = "") java.lang.String currencycode,
			@WebParam(name = "bankcode", targetNamespace = "") java.lang.String bankcode,
			@WebParam(name = "accountnumber", targetNamespace = "") java.lang.String accountnumber,
			@WebParam(name = "accountname", targetNamespace = "") java.lang.String accountname,
			@WebParam(name = "bankdomain", targetNamespace = "") java.lang.String bankdomain);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "setparentaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setparentaccount")
	@WebMethod(action = "setparentaccount")
	@ResponseWrapper(localName = "setparentaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetparentaccountResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse setparentaccount(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.String userresourceid,
			@WebParam(name = "paraentaccountresourceid", targetNamespace = "") java.lang.String paraentaccountresourceid,
			@WebParam(name = "reason", targetNamespace = "") java.lang.String reason);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "webauthenticate", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Webauthenticate")
	@WebMethod(action = "webauthenticate")
	@ResponseWrapper(localName = "webauthenticateResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.WebauthenticateResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Webauthenticationrequestresponse webauthenticate(
			@WebParam(name = "resourceid", targetNamespace = "") java.lang.String resourceid,
			@WebParam(name = "password", targetNamespace = "") java.lang.String password);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "unlinkaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Unlinkaccount")
	@WebMethod(action = "unlinkaccount")
	@ResponseWrapper(localName = "unlinkaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.UnlinkaccountResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.UnLinkaccountrequestresponse unlinkaccount(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "initiatinguserresourceid", targetNamespace = "") java.lang.String initiatinguserresourceid,
			@WebParam(name = "childuserresourceid", targetNamespace = "") java.lang.String childuserresourceid,
			@WebParam(name = "profileid", targetNamespace = "") int profileid,
			@WebParam(name = "paraentaccountresourceid", targetNamespace = "") java.lang.String paraentaccountresourceid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "deleteservicefees", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Deleteservicefees")
	@WebMethod(action = "deleteservicefees")
	@ResponseWrapper(localName = "deleteservicefeesResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.DeleteservicefeesResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Deletefeerequestresponse deleteservicefees(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.Integer userresourceid,
			@WebParam(name = "transactiontypeid", targetNamespace = "") java.lang.Integer transactiontypeid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "editcommission", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Editcommission")
	@WebMethod(action = "editcommission")
	@ResponseWrapper(localName = "editcommissionResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.EditcommissionResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Editcommissionrequestresponse editcommission(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.Integer userresourceid,
			@WebParam(name = "commissionsetuptype", targetNamespace = "") java.lang.Integer commissionsetuptype,
			@WebParam(name = "servicefeepropertiesid", targetNamespace = "") java.lang.Integer servicefeepropertiesid,
			@WebParam(name = "transactiontypeid", targetNamespace = "") java.lang.Integer transactiontypeid,
			@WebParam(name = "commissionfeefortrnxfee", targetNamespace = "") java.math.BigDecimal commissionfeefortrnxfee,
			@WebParam(name = "servicecommissiondetails", targetNamespace = "") java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "setdefaultaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setdefaultaccount")
	@WebMethod(action = "setdefaultaccount")
	@ResponseWrapper(localName = "setdefaultaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetdefaultaccountResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse setdefaultaccount(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "initiatinguserresourceid", targetNamespace = "") java.lang.String initiatinguserresourceid,
			@WebParam(name = "childuserresourceid", targetNamespace = "") java.lang.String childuserresourceid,
			@WebParam(name = "paraentaccountresourceid", targetNamespace = "") java.lang.String paraentaccountresourceid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "activationrequest", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Activationrequest")
	@WebMethod(action = "activationrequest")
	@ResponseWrapper(localName = "activationrequestResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.ActivationrequestResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Activationresponse activationrequest(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "resourceid", targetNamespace = "") java.lang.String resourceid,
			@WebParam(name = "credential", targetNamespace = "") com.swifta.sub.mats.operation.provisioning.v1.Credentials credential,
			@WebParam(name = "securityquestionanswer", targetNamespace = "") java.lang.String securityquestionanswer,
			@WebParam(name = "identificationno", targetNamespace = "") java.lang.String identificationno,
			@WebParam(name = "bankdomainid", targetNamespace = "") java.lang.String bankdomainid,
			@WebParam(name = "currency", targetNamespace = "") java.lang.String currency);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "passwordReset", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.PasswordReset")
	@WebMethod(action = "passwordReset")
	@ResponseWrapper(localName = "passwordResetResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.PasswordResetResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.PasswordResetrequestresponse passwordReset(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "username", targetNamespace = "") java.lang.String username,
			@WebParam(name = "confirmnewpassword", targetNamespace = "") java.lang.String confirmnewpassword);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "editservicefees", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Editservicefees")
	@WebMethod(action = "editservicefees")
	@ResponseWrapper(localName = "editservicefeesResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.EditservicefeesResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Editfeerequestresponse editservicefees(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.Integer userresourceid,
			@WebParam(name = "serviceconfigtype", targetNamespace = "") java.lang.Integer serviceconfigtype,
			@WebParam(name = "transactiontypeid", targetNamespace = "") java.lang.Integer transactiontypeid,
			@WebParam(name = "servicefeedetails", targetNamespace = "") java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "setupservicefees", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setupservicefees")
	@WebMethod(action = "setupservicefees")
	@ResponseWrapper(localName = "setupservicefeesResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetupservicefeesResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Servicefeerequestresponse setupservicefees(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.Integer userresourceid,
			@WebParam(name = "serviceconfigtype", targetNamespace = "") java.lang.Integer serviceconfigtype,
			@WebParam(name = "transactiontypeid", targetNamespace = "") java.lang.Integer transactiontypeid,
			@WebParam(name = "servicefeedetails", targetNamespace = "") java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "addaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Addaccount")
	@WebMethod(action = "addaccount")
	@ResponseWrapper(localName = "addaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddaccountResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Addaccountrequestresponse addaccount(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "accounttype", targetNamespace = "") java.lang.String accounttype,
			@WebParam(name = "accountprofileid", targetNamespace = "") java.lang.String accountprofileid,
			@WebParam(name = "accountreferenceprofile", targetNamespace = "") java.lang.String accountreferenceprofile);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "addaccounttoexistinguser", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Addaccounttoexistinguser")
	@WebMethod(action = "addaccounttoexistinguser")
	@ResponseWrapper(localName = "addaccounttoexistinguserResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddaccounttoexistinguserResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Addaccounttoexistinguserrequestresponse addaccounttoexistinguser(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "resourceid", targetNamespace = "") java.lang.String resourceid,
			@WebParam(name = "accounttype", targetNamespace = "") java.lang.String accounttype,
			@WebParam(name = "profileid", targetNamespace = "") java.lang.String profileid,
			@WebParam(name = "currency", targetNamespace = "") java.lang.String currency);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "changepassword", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Changepassword")
	@WebMethod(action = "changepassword")
	@ResponseWrapper(localName = "changepasswordResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.ChangepasswordResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Changepasswordrequestresponse changepassword(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "username", targetNamespace = "") java.lang.String username,
			@WebParam(name = "newcredentials", targetNamespace = "") java.lang.String newcredentials,
			@WebParam(name = "oldcredentials", targetNamespace = "") java.lang.String oldcredentials);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "editProfile", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.EditProfile")
	@WebMethod(action = "editProfile")
	@ResponseWrapper(localName = "editProfileResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.EditProfileResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.EditProfilerequestresponse editProfile(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "profilename", targetNamespace = "") java.lang.String profilename,
			@WebParam(name = "oldprofilename", targetNamespace = "") java.lang.String oldprofilename,
			@WebParam(name = "profileid", targetNamespace = "") int profileid);

	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "deletecommission", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Deletecommission")
	@WebMethod(action = "deletecommission")
	@ResponseWrapper(localName = "deletecommissionResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.DeletecommissionResponse")
	public com.swifta.sub.mats.operation.provisioning.v1.Deletecommissionrequestresponse deletecommission(
			@WebParam(name = "loggedinUser", targetNamespace = "") java.lang.String loggedinUser,
			@WebParam(name = "userresourceid", targetNamespace = "") java.lang.Integer userresourceid,
			@WebParam(name = "servicefeepropertiesid", targetNamespace = "") java.lang.Integer servicefeepropertiesid,
			@WebParam(name = "transactiontypeid", targetNamespace = "") java.lang.Integer transactiontypeid);
}
