
package com;

public class YelpDataSet2
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
	public String review_id;  
	public String stars; 
	public String date; 
	public String text;  
	public String type;
	public String business_id; 
	
	public String getUserid() 	{ return user_id;}
	public String getReviewid() { return review_id;}
	public String getStars() 	{ return stars;}
	public String getDate() 	{ return date;}
	public String getText() 	{ return text;}
	public String getType() 	{ return type;}
	public String getBusinessid() { return business_id;}
	
	public void SetUserid(String s) 	{ user_id = s;}
	public void SetReviewid(String s) 	{ review_id = s;}
	public void SetStars(String s) 		{ stars = s;}
	public void SetDate(String s) 		{ date = s;}
	public void SetText(String s) 		{ text = s;}
	public void SetType(String s) 		{ type = s;}
	public void SetBusinessid(String s) { business_id = s;}
	
}


