package com.bia.lc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bia.lc.api.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		
		model.addAttribute("emailDTO", new EmailDTO());
		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO){
		
	
		
		return "process-email-page";
	}

}
