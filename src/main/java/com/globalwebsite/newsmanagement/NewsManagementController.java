package com.globalwebsite.newsmanagement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsManagementController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}