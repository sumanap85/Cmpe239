package com;


import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;



public class HashObject implements Comparable<HashObject> {
	String businessid;
	List<String> users;
	Hashtable<String,YelpDataSet2> userreviews;
	double rating_avg;
	double similarity;
	
	HashObject(String businessid) {
		users = new LinkedList<String>();
		userreviews = new Hashtable<String,YelpDataSet2>();
		this.businessid = businessid;
	}

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}
	
	

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}



	public Hashtable<String, YelpDataSet2> getUserreviews() {
		return userreviews;
	}

	public void setUserreviews(Hashtable<String, YelpDataSet2> userreviews) {
		this.userreviews = userreviews;
	}

	public double getSimilarity() {
		return similarity;
	}

	public void setSimilarity(double similarity) {
		this.similarity = similarity;
	}

	public double getRating_avg() {
		return rating_avg;
	}

	public void setRating_avg(double rating_sum) {
		this.rating_avg = rating_sum;
	}
	@Override
	public String toString() {
		System.out.println(this.businessid);
		System.out.println(this.users);
		System.out.println(this.rating_avg);
		System.out.println(this.similarity);
		System.out.println("****************");
		return null;
		
	}

	@Override
	public int compareTo(HashObject t) {
		// TODO Auto-generated method stub
		if (this.similarity > t.similarity)
			return -1;
		else if (t.similarity > this.similarity)
			return 1;
		else
			return 0;
		
	}
	
}
