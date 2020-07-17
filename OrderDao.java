package com.spring.rest.repository;


	import java.util.List;
	 
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.orm.hibernate5.HibernateTemplate;
	import org.springframework.stereotype.Repository;
	 
	import com.spring.rest.model.OrderItem;
	 
	@Repository
	public class OrderDao {
	 
	    @Autowired
	    private HibernateTemplate template;
	 
	    public HibernateTemplate getTemplate() {
	        return template;
	    }
	 
	    public void setTemplate(HibernateTemplate template) {
	        this.template = template;
	    }
	 
	    // Get all countries from the database  
	    public List<Order> getAllOrders() {          
	        List<Order> Orders = getTemplate().loadAll(Order.class);
	 
	        for(Order c : Orders)
	            System.out.println(c.toString());
	 
	        return Orders;
	    }
	 
	    // Get country by id from the database
	    public OrderItem getOrder(int id) {     
	    	OrderItem order = (Order) getTemplate().get(Order.class, new Integer(id));
	        System.out.println(order.toString());
	        return order;
	    }
}
