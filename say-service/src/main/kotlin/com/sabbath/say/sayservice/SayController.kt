package com.sabbath.say.sayservice

import com.sabbath.say.sayservice.client.MonsterClient
import com.sabbath.say.sayservice.client.QuoteClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SayController(
        val monsterClient: MonsterClient,
        val quoteClient: QuoteClient
) {
    @GetMapping
    fun say(): String {
        val message = quoteClient.getQuote()!!
        val result=monsterClient.say(message)!!
        return result
    }
}