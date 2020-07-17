package com.spring.rest.component;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.springframework.stereotype.Component;
 
@Entity
@Table(name="ORDER_ITEM")
@Component
public class OrderItem {
 
    @Id
    @Column(name="Product_Code")
    private int productCode;
 
    @Column(name="Product_Name")
    private String productName;
 
    @Column(name="Quantity")
    private long quantity;
 
    public OrderItem() { }
 
    public OrderItem(int productCode, String productName, long quantity) {   
        this.productCode = productCode;
        this.productName = productName;
        this.quantity = quantity;
    }

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
 
    
   }