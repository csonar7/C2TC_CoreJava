package day56;

public class Fruits {

	private String type;
	private String taste;
	private int rates;
	
	public Fruits()
	{
		
	}
	public Fruits(String type, String taste, int rates) {
		this.type = type;
		this.taste = taste;
		this.rates = rates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public String toString() {
		return "Fruits [type=" + type + ", taste=" + taste + ", rates=" + rates + "]";
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Fruits)
		{
			return ((Fruits)o).type == this.type;
		}
		return false;
		
	}
	
	

}
