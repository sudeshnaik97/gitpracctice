package com.lti.model;

import javax.persistence.*;

@Entity
@Table(name="TBL_ITEM")
public class Item {

	@Id
	
	private int id;
	
	private int quantity;
	
	//private Product product
	@ManyToOne
	@JoinColumn(name="Cart_Id")
	private Cart cart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
}
