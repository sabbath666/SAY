package com.sabbath.say.sayservice.client

import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.util.*

@Component
class QuoteClient(
        val quoteRestTemplate: RestTemplate
) {

    fun getQuote(): String? {
        val result = try {
            quoteRestTemplate.getForObject(
                    "/quote",
                    String::class.java
            )
        } catch (e: Exception) {
            Base64.getEncoder().encodeToString(e.message!!.substring(0, 100).plus("...ЭТО ПИПЕЦ!!").toByteArray())
        }
        return result;
    }
}