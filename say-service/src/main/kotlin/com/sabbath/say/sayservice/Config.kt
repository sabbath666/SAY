package com.sabbath.say.sayservice

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.boot.web.client.RootUriTemplateHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.web.client.RestTemplate

@Configuration
class Config(
        val env:Environment
) {

    @Bean
    fun monsterRestTemplate(): RestTemplate = RestTemplateBuilder()
            .uriTemplateHandler(RootUriTemplateHandler(env["monster.url"]))
            .build()
    @Bean
    fun quoteRestTemplate(): RestTemplate = RestTemplateBuilder()
            .uriTemplateHandler(RootUriTemplateHandler(env["quote.url"]))
            .build()

}