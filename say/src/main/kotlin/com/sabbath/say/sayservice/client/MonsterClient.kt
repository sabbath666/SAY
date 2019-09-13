package com.sabbath.say.sayservice.client

import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class MonsterClient(
        val monsterRestTemplate: RestTemplate
) {

    fun say(message: String): String? {
        val result = monsterRestTemplate.postForObject(
                "/say",
                message,
                String::class.java
        )
        return result
    }
}