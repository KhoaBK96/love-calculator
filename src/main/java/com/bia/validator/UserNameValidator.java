package com.bia.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bia.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User Name cant be empty");
		
		String userName = ((UserRegistrationDTO)object).getUserName();
		
		if(!userName.contains("_")) {
			
			errors.rejectValue("userName", "userName.invalidString", "String must contain a '_'");
			
		}
		
	}

}
