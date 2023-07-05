package com.law.njtreasure.controller

import com.law.njtreasure.entity.Type
import com.law.njtreasure.service.TypeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class TypeController(private val typeService: TypeService) {
	@GetMapping("/type")
	fun getType(model: Model): String {
		val types = typeService.getAllTypes()
		model.addAttribute("types", types)
		model.addAttribute("newType", Type())
		return "type"
	}
	
	@PostMapping("/type/add")
	fun addType(@ModelAttribute("newType") newType: Type): String {
		typeService.addType(newType)
		return "redirect:/type"
	}
}