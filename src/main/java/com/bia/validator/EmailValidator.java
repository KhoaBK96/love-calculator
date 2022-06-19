package com.bia.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bia.lc.api.CommunicationDTO;
import com.bia.lc.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
		
		String email = ((UserRegistrationDTO)object).getCommunicationDTO().getEmail();
		
		if(!email.endsWith("seleniumexpress.com")) {
			errors.rejectValue("communicationDTO.email", "email.invalidDomain");
		}
	}

}
