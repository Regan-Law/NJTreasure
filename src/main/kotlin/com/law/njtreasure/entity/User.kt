package com.law.njtreasure.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "user")
data class User(
	@Id
	@Column(name = "username")
	val username: String = "",
	val password: String = ""
)