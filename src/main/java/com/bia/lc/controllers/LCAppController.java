package com.bia.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bia.lc.api.UserInfoDTO;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {

	@RequestMapping("/")
	public String showHomePage(Model model) {

		// read the existing the property by fetching it from the dto
		
		model.addAttribute("userInfo", new UserInfoDTO());

		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}

			return "home-page";
		}

		return "result-page";
	}
}
