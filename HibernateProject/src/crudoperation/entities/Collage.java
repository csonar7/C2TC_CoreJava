package crudoperation.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Collage")

public class Collage implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String collageName;
	private String location;
	
	
	@OneToOne(mappedBy = "collage",orphanRemoval = true)
	private User user;
	
	
	@OneToMany(mappedBy="collage",orphanRemoval = true)
	private Set<Student> student;
	
	
	@OneToMany(mappedBy="collage",orphanRemoval = true)
	private Set<Placement> placement;
	
	
	@OneToMany(mappedBy="collage",orphanRemoval = true)
	private Set<Certificate> certificate;
	
	
	public Collage() {
	
	}
	
	public Collage(int id, String collageName, String location, User user, Set<Student> student,
			Set<Placement> placement, Set<Certificate> certificate) {
		this.id = id;
		this.collageName = collageName;
		this.location = location;
		this.user = user;
		this.student = student;
		this.placement = placement;
		this.certificate = certificate;
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getCollageName()
	{
		return collageName;
	}
	public void setCollageName(String collageName)
	{
		this.collageName = collageName;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Set<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(Set<Student> student)
	{
		this.student = student;
	}
	
	public Set<Placement> getPlacement()
	{
		return placement;
	}

	public void setPlacement(Set<Placement> placement) 
	{
		this.placement = placement;
	}
	
	public Set<Certificate> getCertificate() 
	{
		return certificate;
	}

	public void setCertificate(Set<Certificate> certificate) 
	{
		this.certificate = certificate;
	}
	
	@Override
	public String toString() {
		return "Collage [id=" + id + ", collageName=" + collageName + ", location="
				+ location + ", user=" + user + ", student=" + student + ", placement=" + placement + ", certificate="
				+ certificate + "]";
	}
	
	
	
	
	

}
