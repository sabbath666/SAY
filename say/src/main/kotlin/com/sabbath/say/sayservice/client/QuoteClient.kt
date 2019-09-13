package com.sabbath.say.sayservice.client

import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class QuoteClient(
        val quoteRestTemplate: RestTemplate
) {

    fun getQuote(): String? {
        val result = quoteRestTemplate.getForObject(
                "/quote",
                String::class.java
        )
        return result;
    }
}