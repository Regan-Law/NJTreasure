package com.law.njtreasure.controller

import com.law.njtreasure.entity.Admin
import com.law.njtreasure.entity.User
import com.law.njtreasure.service.AdminService
import com.law.njtreasure.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class LoginController(private val userService: UserService, private val adminService: AdminService) {
	@GetMapping("/login")
	fun login(model: Model): String {
		model.addAttribute("user", User())
		model.addAttribute("admin", Admin())
		return "login"
	}
	
	@PostMapping("/login")
	fun login(
		@RequestParam("type") type: String,
		@ModelAttribute user: User,
		@ModelAttribute admin: Admin,
		model: Model
	): String {
		return when (type) {
			"user" -> {
				if (userService.loginUser(user)) {
					"home"
				} else {
					model.addAttribute("error", "用户名或密码错误")
					"login"
				}
			}
			
			"admin" -> {
				if (adminService.loginAdmin(admin)) {
					"back"
				} else {
					model.addAttribute("error", "用户名或密码错误")
					"login"
				}
			}
			
			else -> "login"
		}
	}
	
	@GetMapping("/register")
	fun register(model: Model): String {
		model.addAttribute("user", User())
		return "register"
	}
	
	@PostMapping("/register")
	fun register(@ModelAttribute user: User, model: Model): String {
		return if (userService.registerUser(user)) {
			"home"
		} else {
			model.addAttribute("error", "用户名已存在")
			"register"
		}
	}
	
	@GetMapping("/home")
	fun home(): String {
		return "home"
	}
	
	@GetMapping("/back")
	fun back(): String {
		return "back"
	}
	
	@GetMapping("/info")
	fun info(): String {
		return "info"
	}
	
	@GetMapping("/content")
	fun content(): String {
		return "content"
	}
	
	@GetMapping("/gonglue")
	fun gonglue(): String {
		return "gonglue"
	}
	
	@GetMapping("/")
	fun index(): String {
		return "home"
	}
}