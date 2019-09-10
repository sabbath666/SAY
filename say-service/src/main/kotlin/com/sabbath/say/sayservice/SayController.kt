package com.sabbath.say.sayservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*

@RestController
class SayController(
        val sayService: SayService
) {

    @GetMapping("/date")
    fun date():String {
        val date= Date()
        val sf=SimpleDateFormat("dd.MM.yyyy")
        val result = sayService.say("Сегодня ${sf.format(date)}")
        println(result)
        return result
    }

}