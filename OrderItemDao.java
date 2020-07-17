
package com.spring.rest.repository;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
 
import com.spring.rest.model.OrderItem;
 
@Repository
public class OrderItemDao {
 
    @Autowired
    private HibernateTemplate template;
 
    public HibernateTemplate getTemplate() {
        return template;
    }
 
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
 
    // Get all countries from the database  
    public List<OrderItem> getAllOrderItems() {          
        List<OrderItem> OrderItems = getTemplate().loadAll(OrderItem.class);
 
        for(OrderItem c : OrderItems)
            System.out.println(c.toString());
 
        return OrderItems;
    }
 
    // Get country by id from the database
    public OrderItem getOrderItem(int id) {     
    	OrderItem orderItem = (OrderItem) getTemplate().get(OrderItem.class, new Integer(id));
        System.out.println(orderItem.toString());
        return orderItem;
    }
}