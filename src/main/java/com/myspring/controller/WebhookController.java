package com.myspring.controller;


import com.myspring.model.MessageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public String receiveMessage(@RequestBody MessageRequest request) {

        String msg = request.getMessage();

        if (msg.contains("hi") || msg.contains("hello")) {
            return "Hello! 👋 How can I help you?";
        } 
        else if (msg.contains("bye")) {
            return "Goodbye! Have a nice day 😊";
        } 
        else if (msg.contains("how are you")) {
            return "I'm just a bot, but I'm doing great 🤖";
        } 
        else if (msg.contains("your name")) {
            return "I'm your Spring Boot Chatbot 😄";
        } 
        else if (msg.contains("help")) {
            return "You can say Hi, Bye, or ask me questions!";
        } 
        else if (msg.contains("thank you")) {
            return "You are Welcome";
        } 
        else if (msg.contains("who are you")) {
            return "I am a Chatbot";
        } 
        else {
            return "Sorry, I didn’t understand that 😅";
        }
    }
}
