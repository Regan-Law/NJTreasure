package com.law.njtreasure.controller

import com.law.njtreasure.entity.ServicePosition
import com.law.njtreasure.service.ServicePositionService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller
class ServicePositionController(private val servicePositionService: ServicePositionService) {
	@GetMapping("/area")
	fun getAreas(model: Model): String {
		val servicePositions = servicePositionService.getAllServicePositions()
		model.addAttribute("areas", servicePositions)
		model.addAttribute("newArea", ServicePosition())
		return "area"
	}
	
	@PostMapping("/area-add")
	fun getAreaAdd(@ModelAttribute("newArea") newArea: ServicePosition): String {
		servicePositionService.saveServicePosition(newArea)
		return "redirect:/area"
	}
	
	@GetMapping("/area-update/{id}")
	fun getAreaUpdate(model: Model, @PathVariable("id") id: Long): String {
		val servicePositions = servicePositionService.getServicePositionById(id)
		model.addAttribute("area", servicePositions)
		return "area-update"
	}
	
	@PostMapping("/area-update/{id}")
	fun updateArea(
		model: Model,
		@PathVariable("id") id: Long,
		@ModelAttribute("area") updateArea: ServicePosition
	): String {
		val servicePositions = servicePositionService.getServicePositionById(id)
		servicePositions.id = updateArea.id
		servicePositions.name = updateArea.name
		servicePositions.description = updateArea.description
		servicePositionService.saveServicePosition(servicePositions)
		return "redirect:/area"
	}
	
	@GetMapping("/area-delete/{id}")
	fun getAreaDelete(@PathVariable("id") id: Long): String {
		val servicePositions = servicePositionService.getServicePositionById(id)
		servicePositionService.deleteServicePosition(servicePositions)
		return "redirect:/area"
	}
}