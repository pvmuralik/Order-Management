package com.spring.rest.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
 
@FeignClient(name= "orderItem")
public interface OrderItemClient {
 
    /**
     * Interface method to get the greetings information from a different microservice.
     * @param langCode
     * @return
     */
    @GetMapping(value= "/getOrderItem/{id}")
    public OrderItem getOrderItem(@PathVariable(name= "id") String id);
}