package com.feizy.ollama.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.feizy.ollama.service.OllamaService;

@RestController
@RequestMapping("/api")
public class BaseController {
    @Resource
    private OllamaService ollamaService;

//    @PostMapping("/generate")
//    public String generate(@RequestBody String prompt) {
//        return ollamaService.generate(prompt);
//    }

    @PostMapping("/chat")
    public String chat(@RequestBody String message) {
        return ollamaService.chat(message);
    }
}