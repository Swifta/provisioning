package com.swifta.sub.mats.serviceinterface;

import com.swifta.sub.mats.operation.provisioning.v1.IdentificationType;

public class GetidentificationInt {

	public static int getIntval(IdentificationType e) {
		if (IdentificationType.PASSP.equals(e)) {
			return 1;
		} else if (IdentificationType.NRIN.equals(e)) {
			return 2;
		} else if (IdentificationType.DRLCS.equals(e)) {
			return 3;
		} else if (IdentificationType.IDCD.equals(e)) {
			return 4;
		} else if (IdentificationType.EMID.equals(e)) {
			return 5;
		} else if (IdentificationType.SOCS.equals(e)) {
			return 6;
		} else if (IdentificationType.SOCS.equals(e)) {
			return 7;
		}

		return 0;
	}
}
