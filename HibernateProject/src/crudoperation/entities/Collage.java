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
	private long id;
	private User collageAdmin;
	private String collageName;
	private String location;
	
	@OneToOne( mappedBy="User_Id")
	private User user;
	
	@OneToMany(mappedBy="collage")
	private Set<Student> student;
	
	@OneToMany(mappedBy="collage")
	private Set<Placement> placement;
	
	@OneToMany(mappedBy="collage")
	private Set<Certificate> certificate;
	
	public Collage() {
	
	}
	public Collage(long id, User collageAdmin, String collageName, String location, User user) {
		this.id = id;
		this.collageAdmin = collageAdmin;
		this.collageName = collageName;
		this.location = location;
		this.user=user;
	}
	public long getId() 
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public User getCollageAdmin() 
	{
		return collageAdmin;
	}
	public void setCollageAdmin(User collageAdmin) 
	{
		this.collageAdmin = collageAdmin;
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
	public String toString() 
	{
		return "Collage [id=" + id + ", collageAdmin=" + collageAdmin + ", collageName=" + collageName + ", location="
				+ location + ", user=" + user + ", student=" + student + ", placement=" + placement + ", certificate="
				+ certificate + "]";
	}
	
	
	
	

}
