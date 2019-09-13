package com.sabbath.say.sayservice

import com.sabbath.say.sayservice.client.MonsterClient
import com.sabbath.say.sayservice.client.QuoteClient
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class SayController(
        val monsterClient: MonsterClient,
        val quoteClient: QuoteClient
) {
    @GetMapping
    fun say(model: Model): String {
        val message = quoteClient.getQuote()!!
        val result = monsterClient.say(message)!!
        model.addAttribute("say", result)
        return "index"
    }
}