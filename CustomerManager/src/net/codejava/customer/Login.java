package net.codejava.customer;

import javax.validation.constraints.NotNull;

public class Login {
	@NotNull
	private String name;
	@NotNull
	private String password;
	
	public Login() {
		super();
	}
	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
