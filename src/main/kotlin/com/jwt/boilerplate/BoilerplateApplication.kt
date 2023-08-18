package com.jwt.boilerplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class BoilerplateApplication

fun main(args: Array<String>) {
	runApplication<BoilerplateApplication>(*args)
}
