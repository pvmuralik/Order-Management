package com.spring.rest.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.spring.rest.model.OrderItem;
import com.spring.rest.repository.OrderItemDao;
 
@Service
public class OrderItemService {
 
    @Autowired
    private OrderItemDao orderItemDao;
 
    public List<OrderItem> getAllOrderItems() {
        return orderItemDao.getAllOrderItems();
    }
 
    @Transactional
    public OrderItem getOrderItem(int id) {
        return orderItemDao.getOrderItem(id);
    }   
}

