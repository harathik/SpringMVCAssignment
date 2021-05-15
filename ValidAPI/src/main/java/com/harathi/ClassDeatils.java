package com.harathi;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.*;

public class ClassDeatils {
	@NotEmpty
	@Size(min = 8, max = 20)
	public String username;
	@NotBlank
	public String pass;
	@Email
	public String email;
	@NotEmpty
	@Size(min = 10, max = 10)
	public long contact;
	@NotEmpty
	public String city;
	@NotEmpty
	@Size(min = 4, max = 6)
	public int zip;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contact;
	}
	public void setContactno(long contactno) {
		this.contact = contactno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
}
