package crudoperation.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Administrator")

public class Admin implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String name;
	private String password;
	
	@OneToOne(mappedBy = "studentAdmin",orphanRemoval = true)
	private User user;
	
	
	public Admin() {
		
	}
	public Admin(int id, String name, String password, User user) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.user = user;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public User getUser()
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", user=" + user + "]";
	}
	
	
}
