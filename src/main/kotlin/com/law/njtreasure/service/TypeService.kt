package com.law.njtreasure.service

import com.law.njtreasure.entity.Type
import com.law.njtreasure.repository.TypeRepository
import org.springframework.stereotype.Service

@Service
class TypeService(private val typeRepository: TypeRepository) {
	fun getAllTypes(): List<Type> {
		return typeRepository.findAll()
	}
	
	fun addType(type: Type) {
		typeRepository.save(type)
	}
}