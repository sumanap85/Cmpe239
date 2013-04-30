package com;

import java.util.HashMap;


public class YelpSimilarity 
{
	 
	 
	 String business_id;
	 
	 HashMap<String,Double> similar_business = new HashMap<String,Double>();

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	public HashMap<String, Double> getSimilar_business() {
		return similar_business;
	}

	public void setSimilar_business(HashMap<String, Double> similar_business) {
		this.similar_business = similar_business;
	}
	 
}
