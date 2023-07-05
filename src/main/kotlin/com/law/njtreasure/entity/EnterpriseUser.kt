package com.law.njtreasure.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class EnterpriseUser(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long? = null,
	val username: String = "",
	val company: String = "",
	val name: String = "",
	val phone: String = "",
)