package com.lti.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="purchase")
public class Purchase {

	@Id
	@GeneratedValue
	private int id;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="product_id")
    private List<Product> products;
	@Temporal(TemporalType.DATE)
	private LocalDate purchasedate; 
	private double price;
	private int emiTenure;
	private double emiAmount;
	private int emiPaid;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	@OneToMany(mappedBy="purchase", cascade=CascadeType.ALL)
	private List<EmiPayment> emipayments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public LocalDate getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(LocalDate purchasedate) {
		this.purchasedate = purchasedate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getEmiTenure() {
		return emiTenure;
	}
	public void setEmiTenure(int emiTenure) {
		this.emiTenure = emiTenure;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public int getEmiPaid() {
		return emiPaid;
	}
	public void setEmiPaid(int emiPaid) {
		this.emiPaid = emiPaid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<EmiPayment> getEmipayments() {
		return emipayments;
	}
	public void setEmipayments(List<EmiPayment> emipayments) {
		this.emipayments = emipayments;
	}
	
}