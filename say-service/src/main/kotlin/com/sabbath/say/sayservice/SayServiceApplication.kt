package com.sabbath.say.sayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SayServiceApplication

fun main(args: Array<String>) {
    runApplication<SayServiceApplication>(*args)
}
