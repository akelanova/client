package com.db.dasboard.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liubov Ruzanova
 */
@RestController
public class ClientController {

    private final RestTemplate restTemplate;

    public ClientController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/dashboard")
    public Object getDashboard() {
        return this.restTemplate.getForObject("http://localhost:8080/dashboard", Object.class);
    }

}
