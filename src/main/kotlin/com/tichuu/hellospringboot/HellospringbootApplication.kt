package com.tichuu.hellospringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class HellospringbootApplication

@RestController
@RequestMapping("/")
class APIController{
	@GetMapping
	fun hello(): String {
		return "Hello Spring Boot"
	}
}


fun main(args: Array<String>) {
	runApplication<HellospringbootApplication>(*args)
}
