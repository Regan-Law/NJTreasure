package com.law.njtreasure.service

import com.law.njtreasure.entity.Service
import com.law.njtreasure.repository.ServiceRepository

@org.springframework.stereotype.Service
class ServiceService(private val serviceRepository: ServiceRepository) {
	fun getAllServices(): List<Service> {
		return serviceRepository.findAll()
	}
	
	fun saveService(service: Service) {
		serviceRepository.save(service)
	}
	
	fun getServiceById(id: Long): Service {
		return serviceRepository.findById(id).orElseThrow { NoSuchElementException() }
	}
	
	fun deleteService(service: Service) {
		serviceRepository.delete(service)
	}
}