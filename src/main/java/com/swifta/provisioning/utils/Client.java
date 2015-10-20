package com.swifta.provisioning.utils;

import java.util.ArrayList;
import java.util.List;

import com.swifta.sub.mats.operation.provisioning.v1.Activationresponse;
import com.swifta.sub.mats.operation.provisioning.v1.AddProfilerequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Credentials;
import com.swifta.sub.mats.operation.provisioning.v1.Linkaccountrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.PasswordResetrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.SetProfilePermissionrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.UnLinkaccountrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1_0.ProvisioningPortImpl;

public class Client {

	public static void main(String args[]) {

		Client.activate();
	}

	// public static void testcommission() {
	//
	// List<ServiceFees> servicefees = new ArrayList<ServiceFees>();

	// List<ServiceCommission> serviceCommissions = new
	// ArrayList<ServiceCommission>();

	// ServiceFees serFees = new ServiceFees();

	// serFees.setTransactiontypeid(5);
	// serFees.setMinimumamount(new BigDecimal(400.00));
	// serFees.setMaximumamount(new BigDecimal(10000.00));
	// serFees.setServicefee(new BigDecimal(50));
	// serFees.setServicefeetype(ServiceFeematrix.FIXED);
	//
	// servicefees.add(serFees);
	//
	// ServiceCommission serviceCommission = new ServiceCommission();
	// serviceCommission
	// .setServicecommissioncondition(ServiceCommissionConditionTypes.FEE);
	// serviceCommission
	// .setServicecommissionmodeltype(ServiceCommissionModelTypes.NOTAPPLICABLE);
	// serviceCommission.setMinimumamount(new BigDecimal(0.00));
	// serviceCommission.setMaximumamount(new BigDecimal(0.00));
	// serviceCommission.setCommissionfeetype(ServiceCommissionmatrix.PERCENT);
	// serviceCommission.setCommissionfee(new BigDecimal(25));
	//
	// serviceCommissions.add(serviceCommission);
	//
	// try {
	// com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse
	// servicefeeandcomissionrequestresponse = new
	// Servicefeeandcomissionrequestresponse();
	//
	// DataResponse dataResponse = ServiceImpl.servicefeecommission("",
	// "7", ServiceFeeConditionTypes.TRANSACTIONTYPE,
	// ServiceFeeModelTypes.TIERED, servicefees,
	// serviceCommissions);

	// servicefeeandcomissionrequestresponse.setResponsecode(dataResponse
	// .getStatusMessage());
	//
	// servicefeeandcomissionrequestresponse
	// .setResponsemessage(dataResponse.getStatusDescription());
	//
	// System.out.println(servicefeeandcomissionrequestresponse
	// .getResponsecode());
	//
	// System.out.println(servicefeeandcomissionrequestresponse
	// .getResponsemessage());
	//
	// } catch (java.lang.Exception ex) {
	// ex.printStackTrace();
	// throw new RuntimeException(ex);
	// }
	//
	// }

	public static void passwordreset() {

		ProvisioningPortImpl provisioningPortImpl = new ProvisioningPortImpl();

		PasswordResetrequestresponse passwordResetrequestresponse = provisioningPortImpl
				.passwordReset("olumide", "modupe", "1345");

		System.out.println(passwordResetrequestresponse.getResponsecode());
		System.out.println(passwordResetrequestresponse.getResponsemessage());

	}

	public static void link() {
		ProvisioningPortImpl provisioningPortImpl = new ProvisioningPortImpl();
		// Linkaccountresponse linkaccountresponse = provisioningPortImpl
		// .linkaccountrequest("100100", "oniru", "8", "100100");
		Linkaccountrequestresponse linkaccountresponse = provisioningPortImpl
				.linkaccount("", "backoffice", "oniru", 8, "100100");
		// backoffice
		System.out.println(linkaccountresponse.getResponsemessage());
	}

	public static void unlink() {
		ProvisioningPortImpl provisioningPortImpl = new ProvisioningPortImpl();
		UnLinkaccountrequestresponse unLinkaccountresponse = provisioningPortImpl
				.unlinkaccount("", "b3", "oniru", 4, "166735");
		System.out.println(unLinkaccountresponse.getResponsemessage());
	}

	public static void addprofile() {
		ProvisioningPortImpl provisioningPortImpl = new ProvisioningPortImpl();
		AddProfilerequestresponse addProfilerequestresponse = provisioningPortImpl
				.addProfile("me", "MATS", 2);

		System.out.println(addProfilerequestresponse.getResponsemessage());

	}

	public static void registration() {

	}

	public static void setprofileperm() {
		ProvisioningPortImpl provisioningPortImpl = new ProvisioningPortImpl();

		List<String> action = new ArrayList<String>();
		action.add("/deposit");

		SetProfilePermissionrequestresponse setProfilePermissionrequestresponse = provisioningPortImpl
				.setProfilePermission("me", "MATS", 1, action);
		System.out.println(setProfilePermissionrequestresponse
				.getResponsemessage());
		System.out.println(setProfilePermissionrequestresponse
				.getResponsecode());

	}

	public static void activate() {
		ProvisioningPortImpl provisioningPortImpl = new ProvisioningPortImpl();
		Credentials credentials = new Credentials();
		credentials.setConfirmpin("1234");
		credentials.setFirstpin("1234");

		Activationresponse activationresponse = provisioningPortImpl
				.activationrequest("matsadminone", "dare", credentials, "",
						"193034", "1", "ngn");

		System.out.println(activationresponse.getResponsecode());
		System.out.println(activationresponse.getResponsemessage());
		System.out.println(activationresponse.getResponsemessage());

		List<String> para = new ArrayList<String>();
		para = activationresponse.getParameterextension().getExtensionparam();

		System.out.println(para.get(0));
		System.out.println(para.get(1));

	}
}
