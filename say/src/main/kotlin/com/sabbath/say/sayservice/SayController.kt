package com.sabbath.say.sayservice

import com.sabbath.say.sayservice.client.MonsterClient
import com.sabbath.say.sayservice.client.QuoteClient
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SayController(
        val monsterClient: MonsterClient,
        val quoteClient: QuoteClient
) {
    @GetMapping("/say")
    fun say(): String {
        var result = ""
        try {
            val message = quoteClient.getQuote()!!
            result = monsterClient.say(message)!!
            println(result)
        } catch (ex: Exception) {
            println(ex)
        }
        return "******************************\n$result"
    }

    @GetMapping("/test")
    fun test()="test"

}