
package com;

import java.util.ArrayList;

public class YelpDataSet3
{
			
	public String business_id; 
	public String full_address;
	public ArrayList<String> schools;
	public boolean open;
	public ArrayList<String> categories;
	public String photo_url;
	public String city;
	public String review_count;  
	public String name;
	public ArrayList<String> neighborhoods;
	public String url; 
	public String longitude; 
	public String state; 
	public String stars;  
	public String latitude;
	public String type;
	
	
	public String getBusinessid() 			{ return business_id;}
	public String getFulladdress() 			{ return full_address;}
	public ArrayList<String> getSchools() 	{ return schools;}
	public boolean getOpen() 				{ return open;}
	public ArrayList<String> getCategories() { return categories;}
	public String getPhotourl() 			{ return photo_url;}
	public String getCity() 				{ return city;}
	public String getReviewcount() 			{ return review_count; }
	public String getName() 				{ return name;}
	public ArrayList<String> getNeighborhoods() { return neighborhoods;}
	public String getUrl() 					{ return url;}
	public String getLongtiude() 			{ return longitude;}
	public String getState() 				{ return state;}
	public String getStars() 				{ return stars;}
	public String getLatitude() 			{ return latitude;}
	public String getType() 				{ return type;}
	

	public void setBusinessid(String s) 	{ business_id = s;}
	public void setFulladdress(String s) 	{ full_address = s;}
	public void setSchools(ArrayList<String> s) { schools = s;}
	public void setOpen(boolean b) 			{ open = b;}
	public void setCategories(ArrayList<String> s) { categories = s;}
	public void setPhotourl(String s) 		{ photo_url = s;}
	public void setCity(String s ) 			{ city = s;}
	public void setReviewcount(String s) 	{ review_count = s; }
	public void setName(String s) 			{ name = s;}
	public void settNeighborhoods(ArrayList<String> s) { neighborhoods = s;}
	public void setUrl(String s) 			{ url = s;}
	public void setLongtiude(String s) 		{ longitude = s;}
	public void setState(String s) 			{ state = s;}
	public void setStars(String s) 			{ stars = s;}
	public void setLatitude(String s) 		{ latitude = s;}
	public void setType(String s) 			{ type = s;}
	
	
	
}


