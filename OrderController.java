package com.spring.rest.controller;

import java.util.List;

import com.spring.rest.model.OrderItem;
import com.spring.rest.service.OrderItemService;

@RestController
public class OrderController {

	
	@Autowired
    private OrderService orderService;
 
    // Get all countries
    @RequestMapping(value="/getOrders", method=RequestMethod.GET, headers="Accept=application/json")
    public List<Order> getOrder() {
        List<Order> list = orderService.getAllOrders();      
        return list;
    }
 
    // Get a country by id
    @RequestMapping(value="/getOrder/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public Order getOrder(@PathVariable(name="id") int id) {
        return orderService.getOrder(id);
    }   
}
