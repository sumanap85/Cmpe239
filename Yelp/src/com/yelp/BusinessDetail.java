package com.yelp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;



public class BusinessDetail 
{
	// user
	private String user_id; 
	private String user_name;
	private String user_url; 
	//private String user_average_stars; 
	//private String user_review_count;  
	
	private List<BusinessData> list_business_data;
	
	public  BusinessDetail(String user_id, String user_name, String user_url, List<BusinessData> list_business_data)
	{
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_url = user_url;
		this.list_business_data = list_business_data;	
	}
	
	public String  getUserid()
	{
		return user_id;
	}
	public String getUserName()
	{
		return user_name;
	}
	public String getUserUrl()
	{
		return user_url;
	}
	public List<BusinessData> getBusinessData()
	{
		return list_business_data;
	}
	
}
