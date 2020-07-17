package com.spring.rest.model;

@Entity
@Table(name="ORDER")
@Component
public class Order {
	
	@Id
    @Column(name="Order_Code")
    private int orderCode;
 
    @Column(name="Customer_Name")
    private String customerName;
 
    @Column(name="Address")
    private long address;
    
    @Column(name="Order_Date")
    private long orderDate;
    
    @Column(name="Total")
    private long total;
    
    private List<OrderItem> orderItemList;

	public int getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAddress() {
		return address;
	}

	public void setAddress(long address) {
		this.address = address;
	}

	public long getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(long orderDate) {
		this.orderDate = orderDate;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
    
    
    

}
