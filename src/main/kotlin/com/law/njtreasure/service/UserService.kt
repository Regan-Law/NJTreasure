package com.law.njtreasure.service

import com.law.njtreasure.entity.User
import com.law.njtreasure.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
	fun registerUser(user: User): Boolean {
		return if (userRepository.findByUsername(user.username) != null) {
			false
		} else {
			userRepository.save(user)
			true
		}
	}
	
	fun loginUser(user: User): Boolean {
		val savedUser = userRepository.findByUsername(user.username) ?: return false
		return savedUser.password == user.password
	}
}