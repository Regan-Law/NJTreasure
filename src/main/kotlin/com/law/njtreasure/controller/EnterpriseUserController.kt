package com.law.njtreasure.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class EnterpriseUserController() {
	@GetMapping("/company")
	fun getCompany(model: Model): String {
		model.addAttribute("company", "company")
		return "company"
	}
}