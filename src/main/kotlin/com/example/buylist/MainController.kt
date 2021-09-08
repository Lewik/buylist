package com.example.buylist

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping("/")
    fun root(): String {
        return "index"
    }

    @GetMapping("/list")
    fun list(): String {
        return "list"
    }
}
