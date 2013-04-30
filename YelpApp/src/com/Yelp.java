package com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Yelp
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException
	{
		String d1 = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\yelpdataset1.txt";
		String d2 = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\yelpdataset2.txt";
		String d3 = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\yelpdataset3.txt";
		
		Yelp y = new Yelp();
		y.dataset1(d1);
		//y.dataset2(d2);
		//y.dataset3(d3);
		
	}
	public void dataset1(String filename)
	{
		int i = 0;
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			Iterator<YelpDataSet1> it = mapper.reader(YelpDataSet1.class).readValues(new File(filename));
			while (it.hasNext())
		    {
				YelpDataSet1 d = it.next();
				System.out.println(d.name);
				System.out.println(d.getUserid());	
				String y = d.getName();
				int x = y.length();
				i++;
		    }	
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("records: " + i);
	}
	public void dataset2(String filename)
	{
		int i = 0;
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			Iterator<YelpDataSet2> it = mapper.reader(YelpDataSet2.class).readValues(new File(filename));
			while (it.hasNext())
		    {
				YelpDataSet2 d = it.next();
				System.out.println(d.business_id);
				System.out.println(d.getUserid());	
				System.out.println(d.getReviewid());
				i++;
		    }	
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("records: " + i);
	}
	public void dataset3(String filename)
	{
		int i = 0;
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			Iterator<YelpDataSet3> it = mapper.reader(YelpDataSet3.class).readValues(new File(filename));
			while (it.hasNext())
		    {
				YelpDataSet3 d = it.next();
				ArrayList<String> x = d.getCategories();
				for(String s : x)
				{
					System.out.print(s);
					System.out.print("  ");
				}
				i++;
				System.out.println();
		    }	
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("records: " + i);
	}
}
