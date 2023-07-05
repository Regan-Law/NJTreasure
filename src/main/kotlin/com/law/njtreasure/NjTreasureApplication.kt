package com.law.njtreasure

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class NjTreasureApplication

fun main(args: Array<String>) {
	runApplication<NjTreasureApplication>(*args)
}

@Component
class OpenBrowser : CommandLineRunner {
	override fun run(vararg args: String?) {
		Runtime.getRuntime().exec("cmd /c start http://localhost:8080")
	}
}