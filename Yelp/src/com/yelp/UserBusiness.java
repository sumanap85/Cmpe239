package com.yelp;

import java.util.List;


public class UserBusiness 
{
	private List<String> listbus;
	private List<String> listnear;

	
	private String user_id;
	private String username;
	private String userurl;
	
//	public String busname;
//	public String busaddress;
//	public String busstars;
	
	public UserBusiness(String userid, List<String> listbus, List<String> listnear,
						String name, String userurl)
	{
		this.user_id = userid;
		this.listbus = listbus;
		this.listnear = listnear;
		this.username = name;
		this.userurl = userurl;
//		this.busname = busname;
//		this.busaddress = busaddress;
//		this.busstars = busstars;
	}
	public String getUserid()
	{
		return user_id;
	}
	public List<String> getBusinessIDs()
	{
		return listbus;
	}
	public List<String> getNear()
	{
		return listnear;
	}
	public String getUserName()
	{
		return username;
	}
	public String getUserUrl()
	{
		return userurl;
}
//	public String getBusName()
//	{
//		return busname;
//	}
//	public String getBusAddress()
//	{
//		return busaddress;
//	}
//	public String getBusStars()
//	{
//		return busstars;
//	}
	
}
