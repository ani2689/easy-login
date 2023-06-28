package com.ani.easylogin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class EasyLoginApplication

fun main(args: Array<String>) {
	runApplication<EasyLoginApplication>(*args)
}
