package com.law.njtreasure.repository

import com.law.njtreasure.entity.Admin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AdminRepository : JpaRepository<Admin, Long> {
	fun findByUsername(username: String): Admin?
}