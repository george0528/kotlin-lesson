package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

  @GetMapping("/")
  fun demo(model: Model): String {
    model["title"] = "Blog"
    return "demo"
  }

  @GetMapping("/origin")
  fun origin(model: Model): String {
    model["title"] = "testtttttttt"
    return "origin"
  }


  @GetMapping("/html")
  fun html(): String {
    return "index"
  }

}