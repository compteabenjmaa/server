package com.abdelaziz.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_client")
public class Client {

	 @Id
	 @GeneratedValue
	 @Column(name="id_clt")
	 private Long id ;
	 
	 @Column(name="clt_name")
	 private String name;
	 
	 @Column(name="clt_login")
	 private String login;
	 
	 @Column(name="clt_psw")
	 private String password;
	 
	 @Column(name="clt_role")
	 private String role;
	 
	 @OneToMany
	 @JoinColumn(name="id_loc")
	 private List<Location> listLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Location> getListLocation() {
		return listLocation;
	}

	public void setListLocation(List<Location> listLocation) {
		this.listLocation = listLocation;
	}
	 
}
