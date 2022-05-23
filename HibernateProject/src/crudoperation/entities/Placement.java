package crudoperation.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Placement")

public class Placement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long placeId;
	private String pname;
	private String qualification;
	private int year;
	private String date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Collage_ID")
	private Collage collage;
	
	public Placement() {
		
	}
	
	public Placement(long placeId, String pname, String qualification, int year, String date) {
		this.placeId = placeId;
		this.pname = pname;
		this.qualification = qualification;
		this.year = year;
		this.date = date;
	}
	public long getPlaceId() 
	{
		return placeId;
	}
	public void setPlaceId(long placeId) 
	{
		this.placeId = placeId;
	}
	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}
	public String getQualification() 
	{
		return qualification;
	}
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public String getDate()
	{
		return date;
	}
	public void setDate(String date) 
	{
		this.date = date;
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
		return "Placement [placeId=" + placeId + ", pname=" + pname + ", qualification=" + qualification + ", year="
				+ year + ", date=" + date + ", collage=" + collage + "]";
	}
	

}
