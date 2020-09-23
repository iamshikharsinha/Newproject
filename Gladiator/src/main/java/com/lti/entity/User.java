package com.lti.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	private String email;
	private long phoneno;
	private String password;
	private String address;
	@OneToOne(mappedBy="user",cascade = CascadeType.ALL)
	@JoinColumn(name="emicard_id")
	private EmiCard emicard;
	@OneToOne(mappedBy="user",cascade = CascadeType.ALL)
	@JoinColumn(name="bank_id")
	private UserBank userbank;
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
	private List<Purchase> purchases;
	@OneToOne(mappedBy="user",cascade = CascadeType.ALL)
	private UserPayment userpayment;
	public UserPayment getUserpayment() {
		return userpayment;
	}
	public void setUserpayment(UserPayment userpayment) {
		this.userpayment = userpayment;
	}
	public UserBank getUserbank() {
		return userbank;
	}
	public void setUserbank(UserBank userbank) {
		this.userbank = userbank;
	}
	public List<Purchase> getPurchases() {
		return purchases;
	}
	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public EmiCard getEmicard() {
		return emicard;
	}
	public void setEmicard(EmiCard emicard) {
		this.emicard = emicard;
	}
	
}
