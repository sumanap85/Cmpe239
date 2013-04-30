package com.yelp;

import java.util.List;
import java.util.ArrayList;

public class Businesstypefilter {

	String business_id;
	List<String> business_type = new ArrayList<String>();
	String business_address;
	String stars;
	String business_name;
	String review_count;
	
	Businesstypefilter(String id, List<String> typelist, String add, String star, String name, String count)
	{
		this.business_id=id;
		this.business_address=add;
		this.business_name=name;
		this.business_type=typelist;
		this.stars=star;
		this.review_count=count;
	}
	
	public String getBusinessid()
	{
		return business_id;
	}
	public String getbusiness_address()
	{
		return business_address;
	}
	public String getstars()
	{
		return stars;
	}
	public String getbusiness_name()
	{
		return business_name;
	}
	public String getreview_count()
	{
		return review_count;
	}
	public List<String> getbusiness_type()
	{
		return business_type;
	}
}
