package com.cg.projectHibernate;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OrderLists")
public class Orders {
	@Id
	private int orderId;
	@ManyToMany
	private List<Product> productList;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", productList=" + productList + "]";
	}
	public Orders(int orderId, List<Product> productList) {
		super();
		this.orderId = orderId;
		this.productList = productList;
	}
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
}
