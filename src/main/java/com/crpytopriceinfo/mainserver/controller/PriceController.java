package com.crpytopriceinfo.mainserver.controller;

import com.crpytopriceinfo.mainserver.domain.PriceRequest;
import com.crpytopriceinfo.mainserver.domain.PriceResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class PriceController {
    @Autowired
    ObjectMapper mapper;

    @PostMapping("/price")
    public @ResponseBody PriceResponse getPrice(@RequestBody PriceRequest priceRequest) {
        //String url = System.getenv("PRICE_SERVER_URL");
        String url = "http://127.0.0.1:8081/api/price";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<PriceRequest> entity = new HttpEntity<>(priceRequest, headers);

        ResponseEntity<PriceResponse> response = restTemplate.postForEntity(url, entity, PriceResponse.class);
        return response.getBody();
    }
}
