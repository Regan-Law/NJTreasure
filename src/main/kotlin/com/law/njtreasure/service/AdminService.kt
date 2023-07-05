package com.law.njtreasure.service

import com.law.njtreasure.entity.Admin
import com.law.njtreasure.repository.AdminRepository
import org.springframework.stereotype.Service

@Service
class AdminService(private val adminRepository: AdminRepository) {
	fun loginAdmin(admin: Admin): Boolean {
		val savedAdmin = adminRepository.findByUsername(admin.username) ?: return false
		return savedAdmin.password == admin.password
	}
}