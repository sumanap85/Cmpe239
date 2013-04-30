package com.yelp;



public class BusinessData 
{
	private String business_id; 
	private String business_name;
	private String business__address;
	private String business_stars;  
	
	public BusinessData(String busid, String busname, String busaddress, String busstars)
	{
		this.business_id = busid;
		this.business_name = busname;
		this.business__address = busaddress;
		this.business_stars = busstars;
	}
	
	public String getBusinessID()
	{
		return business_id;
	}
	public String getBusinessName()
	{
		return business_name;
	}
	public String getBusinessAddress()
	{
		return business__address;
	}
	public String getBusinessStars()
	{
		return business_stars;
	}

}
