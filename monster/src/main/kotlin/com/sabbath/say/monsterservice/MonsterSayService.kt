package com.sabbath.say.monsterservice

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import org.springframework.stereotype.Service

@Service
class MonsterSayService {

    fun say(message: String): String {
        val cowExecutor = CowExecutor().apply {
            setMessage(message)
            setHtml(true)
        }
        return cowExecutor.execute()
    }
}