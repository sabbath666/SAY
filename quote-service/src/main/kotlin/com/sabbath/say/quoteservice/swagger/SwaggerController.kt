package com.sabbath.say.quoteservice.swagger

import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Component
class SwaggerController {
    @Controller
    class SwaggerUIController {
        @RequestMapping(value = ["/"])
        fun index() = "redirect:swagger-ui.html"
    }
}