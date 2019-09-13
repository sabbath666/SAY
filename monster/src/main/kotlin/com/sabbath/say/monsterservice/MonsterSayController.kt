package com.sabbath.say.monsterservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*

@RestController
class MonsterSayController(
        val monsterSayService: MonsterSayService
) {

    @GetMapping("/date")
    fun date(): String {
        val date = Date()
        val sf = SimpleDateFormat("dd.MM.yyyy")
        val result = monsterSayService.say("Сегодня ${sf.format(date)}")
        println(result)
        return result
    }

    @PostMapping("/say")
    fun say(@RequestBody message: String): String {
        val quote = String(Base64.getDecoder().decode(message))
        val result = monsterSayService.say(quote)
        println(result)
        return result
    }

}