package com.bia.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bia.lc.api.UserRegistrationDTO;
import com.bia.lc.propertyeditor.NamePropertyEditor;
import com.bia.validator.EmailValidator;
import com.bia.validator.UserNameValidator;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

		return "user-registration-page";
	}

	@RequestMapping("/registration-sucess")
	public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {
		if (result.hasErrors()) {
			
			System.out.println("My page has errors");
			
			List<ObjectError> allErrors = result.getAllErrors();
			
			for(ObjectError error : allErrors) {
				System.out.println(error);
			}
			
			return "user-registration-page";
		}

		return "registration-sucess";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);
		
		UserNameValidator validator = new UserNameValidator();
		binder.addValidators(validator);
		
		EmailValidator emailValidator = new EmailValidator();
		binder.addValidators(emailValidator);
	}
}
