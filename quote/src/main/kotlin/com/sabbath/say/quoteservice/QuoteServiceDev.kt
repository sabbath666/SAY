package com.sabbath.say.quoteservice

import com.github.javafaker.Faker
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
class QuoteServiceDev(
        private val faker: Faker = Faker()
) : QuoteService {
    override fun quote(): String =
            faker.lebowski().quote()
}