package com.sabbath.say.sayservice

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import com.github.ricksbrown.cowsay.plugin.CowExecutor



@RunWith(SpringRunner::class)
@SpringBootTest
class SayServiceApplicationTests {

    @Test
    fun contextLoads() {
        val cowExecutor = CowExecutor()
//        cowExecutor.setCowfile("stegosaurus")
        cowExecutor.setMessage("Hello from Java!")
        val result = cowExecutor.execute()
        println(result)
    }

}
