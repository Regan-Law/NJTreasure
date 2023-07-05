package com.law.njtreasure.service

import com.law.njtreasure.entity.EnterpriseUser
import com.law.njtreasure.repository.EnterpriseUserRepository
import org.springframework.stereotype.Service

@Service
class EnterpriseUserService(private val enterpriseUserRepository: EnterpriseUserRepository) {
	fun getAllEnterpriseUsers(): List<EnterpriseUser> {
		return enterpriseUserRepository.findAll()
	}
}