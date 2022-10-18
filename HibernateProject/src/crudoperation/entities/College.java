package crudoperation.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="College")

public class College implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String CollegeName;
	private String location;
	
	
	@OneToOne(mappedBy = "College",orphanRemoval = true)
	private User user;
	
	
	@OneToMany(mappedBy="College",orphanRemoval = true)
	private Set<Student> student;
	
	
	@OneToMany(mappedBy="College",orphanRemoval = true)
	private Set<Placement> placement;
	
	
	@OneToMany(mappedBy="College",orphanRemoval = true)
	private Set<Certificate> certificate;
	
	
	public College() {
	
	}
	
	public College(int id, String CollegeName, String location, User user, Set<Student> student,
			Set<Placement> placement, Set<Certificate> certificate) {
		this.id = id;
		this.CollegeName = CollegeName;
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
	
	public String getCollegeName()
	{
		return CollegeName;
	}
	public void setCollegeName(String CollegeName)
	{
		this.CollegeName = CollegeName;
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
		return "College [id=" + id + ", CollegeName=" + CollegeName + ", location="
				+ location + ", user=" + user + ", student=" + student + ", placement=" + placement + ", certificate="
				+ certificate + "]";
	}
	
	
	
	
	

}
