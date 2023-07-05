package com.law.njtreasure.controller

import com.law.njtreasure.entity.Service
import com.law.njtreasure.service.ServiceService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class ServiceController(private val serviceService: ServiceService) {
	@GetMapping("/service")
	fun getServices(model: Model): String {
		val services = serviceService.getAllServices()
		model.addAttribute("services", services)
		return "service"
	}
	
	@GetMapping("/service-add")
	fun getServiceAdd(model: Model): String {
		model.addAttribute("newService", Service())
		return "service-add`"
	}
	
	@PostMapping("/service-add")
	fun addService(@ModelAttribute("newService") newService: Service): String {
		serviceService.saveService(newService)
		return "redirect:/service"
	}
	
	@GetMapping("/service-update/{id}")
	fun getServiceUpdate(@PathVariable("id") serviceId: Long, model: Model): String {
		val service = serviceService.getServiceById(serviceId)
		model.addAttribute("service", service)
		return "service-update"
	}
	
	@PostMapping("/service-update/{id}")
	fun updateService(@PathVariable("id") serviceId: Long, @ModelAttribute("service") updateService: Service): String {
		val service = serviceService.getServiceById(serviceId)
		service.project = updateService.project
		service.name = updateService.name
		serviceService.saveService(service)
		return "redirect:/service"
	}
	
	@GetMapping("/service-delete/{id}")
	fun getServiceDelete(@PathVariable("id") serviceId: Long): String {
		val service = serviceService.getServiceById(serviceId)
		serviceService.deleteService(service)
		return "redirect:/service"
	}
}