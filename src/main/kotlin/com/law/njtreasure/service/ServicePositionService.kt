package com.law.njtreasure.service

import com.law.njtreasure.entity.ServicePosition
import com.law.njtreasure.repository.ServicePositionRepository
import org.springframework.stereotype.Service

@Service
class ServicePositionService(private val servicePositionRepository: ServicePositionRepository) {
	fun getAllServicePositions(): List<ServicePosition> {
		return servicePositionRepository.findAll()
	}
	
	fun saveServicePosition(servicePosition: ServicePosition) {
		servicePositionRepository.save(servicePosition)
	}
	
	fun getServicePositionById(id: Long): ServicePosition {
		return servicePositionRepository.findById(id).orElseThrow { NoSuchElementException() }
	}
	
	fun deleteServicePosition(servicePosition: ServicePosition) {
		servicePositionRepository.delete(servicePosition)
	}
}