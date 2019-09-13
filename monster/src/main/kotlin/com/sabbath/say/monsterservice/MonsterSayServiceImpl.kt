package com.sabbath.say.monsterservice

import com.github.ricksbrown.cowsay.plugin.CowExecutor
import org.springframework.stereotype.Service
import java.util.*

@Service
class MonsterSayServiceImpl:MonsterSayService {

    override fun say(message: String): String {
        val cowExecutor = CowExecutor().apply {
            setMessage(String(Base64.getDecoder().decode(message)))
            setCowfile(randomStyle())
            setHtml(true)
        }
        return cowExecutor.execute()
    }

    fun randomStyle() = listOf(
            "bearface",
            "beavis.zen",
            "bud-frogs",
            "bunny",
            "cat",
            "catfence",
            "charizardvice",
            "cheese",
            "cower",
            "daemon",
            "cowfee",
            "default",
            "dragon-and",
            "dragon",
            "elephant-in-snake",
            "elephant",
            "eyes",
            "fence",
            "flaming-sheep",
            "ghostbusters",
            "goat",
            "hellokitty",
            "hippie",
            "hiya",
            "hypno",
            "kitty",
            "koala",
            "kosh",
            "lamb",
            "lamb2",
            "luke-koala",
            "mech-and",
            "meow",
            "milk",
            "minotaur",
            "moofasa",
            "mooghidjirah",
            "moojira",
            "moose",
            "mutilated",
            "psychiatrichelp",
            "psychiatrichelp2",
            "ren",
            "roflcopter",
            "satanic",
            "sheep",
            "shrug",
            "skeleton",
            "small",
            "snoopy",
            "snoopyhouse",
            "snoopysleep",
            "spide",
            "stegosaurus",
            "stimpy",
            "supermilker",
            "surgery",
            "tableflip",
            "three-eyes",
            "turkey",
            "turtle",
            "tux",
            "udder",
            "vader-koala",
            "vader",
            "www"
    ).shuffled()[0]
}