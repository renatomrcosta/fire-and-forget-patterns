package com.xunfos.fireandforgetpatterns

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FireAndForgetPatternsApplication

fun main(args: Array<String>) {
	runApplication<FireAndForgetPatternsApplication>(*args)
}
