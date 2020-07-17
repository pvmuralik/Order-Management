package com.spring.rest.controller;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.spring.rest.model.OrderItem;
import com.spring.rest.service.OrderItemService;
 
@RestController
public class OrderItemController {
 
    @Autowired
    private OrderItemService orderItemService;
 
    // Get all countries
    @RequestMapping(value="/getOrderItems", method=RequestMethod.GET, headers="Accept=application/json")
    public List<OrderItem> getOrderItems() {
        List<OrderItem> list = orderItemService.getAllOrderItems()();      
        return list;
    }
 
    // Get a country by id
    @RequestMapping(value="/getOrderItem/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public OrderItem getOrderItem(@PathVariable(name="id") int id) {
        return orderItemService.getOrderItem(id);
    }   
}
