package com.example.swtest;

import org.springframework.web.client.RestTemplate;

public class RequestBinSenderImpl implements RequestBinSender {
    @Override
    public void send(String message) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(
                "https://ent2v6jy8ksg.x.pipedream.net/bas",
                message,
                String.class);
    }
}
