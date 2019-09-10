package com.sabbath.say.sayservice

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import org.springframework.stereotype.Service

@Service
class SayService {

    fun say(message: String): String {
        val cowExecutor = CowExecutor().apply {
//            setCowfile("vader")
            setMessage(message)
        }
        return cowExecutor.execute()
    }
}