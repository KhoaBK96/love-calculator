package com.bia.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.bia.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		Phone phone = new Phone();

		String[] phoneNumberArray = completePhoneNumber.split("-");

		int index = completePhoneNumber.indexOf("-");
		
		if (index == -1) {
			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberArray[0]);
		}else if(phoneNumberArray[0] == ""){
			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberArray[1]);
		}			
		else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		return phone;
	}

}
