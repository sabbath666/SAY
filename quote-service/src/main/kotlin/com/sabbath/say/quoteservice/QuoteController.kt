package com.sabbath.say.quoteservice

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController

class QuoteController(
        val quoteService: QuoteService
) {
    @GetMapping("/quote")
    fun quote():String{
        return quoteService.quote()
    }
}