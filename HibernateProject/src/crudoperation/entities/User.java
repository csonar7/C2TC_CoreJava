package crudoperation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String type;
	
	@Id
	private long userId;
	private String name;
	private String password;
	
	@OneToOne(mappedBy = "user")
	private Admin admin;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="collage_Id")
	private Collage collage;
	
	public User() {
		
	}
	public User(String type, long userId, String name, String password, Admin admin) {
		this.type = type;
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.admin=admin;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public long getUserId() 
	{
		return userId;
	}
	public void setUserId(long userId) 
	{
		this.userId = userId;
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
	public Collage getCollage()
	{
		return collage;
	}
	public void setCollage(Collage collage)
	{
		this.collage=collage;
	}
	
	@Override
	public String toString()
	{
		return "User [type=" + type + ", userId=" + userId + ", name=" + name + ", password=" + password + ", admin="
				+ admin + ", collage=" + collage + "]";
	}
	
	
	

}
