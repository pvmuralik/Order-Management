package com.spring.rest.service;

import java.util.List;

import com.spring.rest.controller.OrderItemClient;
import com.spring.rest.model.Order;
import com.spring.rest.model.OrderItem;
import com.spring.rest.repository.OrderItemDao;

@Service
public class OrderService {
	
	@Autowired
    private OrderDao orderDao;
	
	@Autowired
	private OrderItemClient orderItemClient;
 
    public List<Order> getAllOrders() {
        return orderDao.getAllOrders();
    }
 
    @Transactional
    public Order getOrder(int id) {
    	OrderItem orderItem=orderItemClient.getOrderItem(id);
    	List<OrderItem> orderItemList=new ArrayList<OrderItem>();
    	orderItemList.add(orderItem);
    	Order order= orderDao.getOrder(id);
    	order.setOrderItemList(orderItemList);
    	return order;
    }   

}
