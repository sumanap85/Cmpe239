
package com.yelp;


public class YelpDataSet1
{
	public static class Vote
	{
		public String funny;
		public String useful;
		public String cool;
		
		public String getFunny() { return funny;}
		public String getUseful() { return useful;}
		public String getCool() { return cool;}
		
		public void SetFunny(String s) { funny = s;}
		public void SetUseful(String s) { useful = s;}
		public void SetCool(String s) { cool = s;}	
	}
	
	public Vote votes;
	public Vote getVote() { return votes;}
	public void SetVote(Vote v) { votes = v; }
	
	public String user_id; 
	public String name;  
	public String url; 
	public String average_stars; 
	public String review_count;  
	public String type;
	
	public String getUserid() 		{ return user_id;}
	public String getName() 		{ return name;}
	public String getUrl() 			{ return url;}
	public String getAveragestars() { return average_stars;}
	public String getReviewcount() 	{ return review_count;}
	public String getType() 		{ return type;}
	
	public void SetUserid(String s) { user_id = s;}
	public void SetName(String s) 	{ name = s;}
	public void SetUrl(String s) 	{ url = s;}
	public void SetAveragestars(String s) { average_stars = s;}
	public void SetReviewcount(String s) { review_count = s;}
	public void SetType(String s) 	{ type = s;}
	
	
	
	
	
	
	
	
}


