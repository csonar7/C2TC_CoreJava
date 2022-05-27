package crudoperation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Certificates")

public class Certificate implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="certId")
	private int certId;
	
	@Column(name="Year")
	private int year;
	
	@OneToOne(mappedBy = "certificate",orphanRemoval = true)
	private Student student;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Collage_ID")
	private Collage collage;
	
	public Certificate() {
		
	}
	
	public Certificate(int certId, int year, Student student, Collage collage) {
		this.certId = certId;
		this.year = year;
		this.student = student;
		this.collage = collage;
	}

	public int getCertId() 
	{
		return certId;
	}

	public void setCertId(int certId)
	{
		this.certId = certId;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}


	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
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
		return "Certificate [certId=" + certId + ", year=" + year + ", student=" + student + ", collage=" + collage
				+ "]";
	}
	


}
