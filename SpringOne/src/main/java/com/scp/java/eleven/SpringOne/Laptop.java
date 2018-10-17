package com.scp.java.eleven.SpringOne;

public class Laptop {
	
	private int laptopId;
	private String laptopName;
	private Vendor vendor;
	private double price;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", vendor=" + vendor + ", price=" + price
				+ "]";
	}
	

}
class Vendor extends Laptop{
	private int vid;
	private String vname;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + "]";
	}
		
} 
