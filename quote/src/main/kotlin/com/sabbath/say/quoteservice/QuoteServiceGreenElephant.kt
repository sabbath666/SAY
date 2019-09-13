package com.sabbath.say.quoteservice

import com.github.javafaker.Faker
import org.springframework.stereotype.Service
import java.util.*

@Service
class QuoteServiceGreenElephant : QuoteService {
    override fun quote(): String {
        val quote = listOf(
                "Я на лошади. Ты на белом коне, и я на белом коне.",
                "Меня твои истории просто недоели уже, я уже не могу их слушать. Одна история лучше другой, просто",
                "Курлык-курлык",
                "Хочешь я цаплей постою?",
                "Ты понимаешь, что ты поехавший уже, всё?",
                "В деревнях ели все…",
                "Иди под струю! Мойся!",
                "Будьте ж людьми, ребята. Ну все ж мы люди",
                "Чем чистить, вилкой, что ли?",
                "Как я буду вилкой-то чистить?",
                "У тебя получается классно, давай!",
                "Как поспал, братишка? Проголодался наверное, братишка?",
                "Шишка встала",
                "Кто «вы-то»?! К кому ты обращаешься? Я один здесь",
                "Сладкий хлеб"
        ).shuffled()[0]
        return Base64.getEncoder().encodeToString(quote.toByteArray())
    }

}