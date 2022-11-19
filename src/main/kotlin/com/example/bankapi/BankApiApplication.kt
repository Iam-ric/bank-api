package com.example.bankapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankApiApplication

fun main(args: Array<String>) {
	runApplication<BankApiApplication>(*args)
}

// open api, documentação da aplicação
// http://localhost:8080/swagger-ui/index.html#/
