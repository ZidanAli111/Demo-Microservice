package com.fiserv.payment360.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class P360Util {

	public static String convertBDToString(BigDecimal bd) {

		String amount = "";

		amount = new DecimalFormat("#0.##").format(bd);

		return amount;

	}

}
