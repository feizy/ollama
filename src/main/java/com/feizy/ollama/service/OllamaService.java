package com.feizy.ollama.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.ai.ollama.OllamaChatModel;
@Service
public class OllamaService {

    @Autowired
    private OllamaChatModel chatModel;
    private final RestTemplate restTemplate = new RestTemplate();

//    public String generate(String prompt) {
//        // 调用 Ollama 的 /api/generate 接口
//        // 返回生成的结果
//    }

    public String chat(String message) {
        // 调用 Ollama 的 /api/chat 接口
        // 返回聊天的响应
        String response = chatModel.call(message);
        return response;
    }
}
