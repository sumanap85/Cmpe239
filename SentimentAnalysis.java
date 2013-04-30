package com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.aliasi.classify.Classification;
import com.aliasi.classify.LMClassifier;
import com.aliasi.util.AbstractExternalizable;

public class SentimentAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String d1 = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\yelpdataset1.txt";	// users and reviews.
				String d2 = "C:\\Users\\sowmya\\workspace_Recommendation\\yelpdataset2.txt";	// business id , user id, review id and full text of the review. Review object in original code.
				String d3 = "C:\\Users\\sowmya\\workspace_Recommendation\\yelpdataset3.txt";	// business data
				//List<YelpDataSet1> list_alldata1;	
				List<YelpDataSet2> list_alldata2;	
				List<YelpDataSet3> list_alldata3;	
				
				List<String> posbus = new ArrayList<String>();
				List<String> negbus = new ArrayList<String>();
				HashMap<String, Integer> negative  = new HashMap<String,Integer>(); 
				HashMap<String, Integer> result  = new HashMap<String,Integer>(); 
				SentimentAnalysis t = new SentimentAnalysis();
				list_alldata2 = t.dataset2(d2);
				
				LMClassifier mClassifier1 = null;
				try {
					mClassifier1 =(LMClassifier) AbstractExternalizable.readObject(new File("C:\\Users\\sowmya\\workspace_Recommendation\\YelpApp\\sentiment.model"));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int i=0;
				int poscount=0, negcount=0;
				for(YelpDataSet2 d : list_alldata2)
				{
					
					
					Classification classification= mClassifier1.classify(d.getText());
					/*if (d.getBusinessid().equals("OsL5GapIoQ4CtXxAiyvtoQ")&&(i<1))
					{
					System.out.println("business_id :" + d.getBusinessid() + "  " + classification.bestCategory() + "  Feedback");
					i++;}*/
					if (classification.bestCategory().equals("pos"))
					{
						posbus.add(d.getBusinessid());
						poscount++;
					}
					 else if (classification.bestCategory().equals("neg"))
					 {
						 negbus.add(d.getBusinessid());
						 negcount++;
					 }
					
				}
				
				//System.out.println("poscount: " + poscount + " negcount: " + negcount);
				//t.printlist1(negbus);
	}
	
	public void printlist1(List<String> negbus)
	{
		int i=0;
		for(String s : negbus)
		{
			if (i<30)
			{
			System.out.println("neg bus:::" + s);
			i++;
			}
		}
	}
	
	public List<YelpDataSet2> dataset2(String filename)
	{
	List<YelpDataSet2> data = new ArrayList<YelpDataSet2>();	
	ObjectMapper mapper = new ObjectMapper();
	try 
	{
		Iterator<YelpDataSet2> it = mapper.reader(YelpDataSet2.class).readValues(new File(filename));
		while (it.hasNext())
	    {
			YelpDataSet2 d = it.next();
			data.add(d);
	    }	
	} 
	catch (IOException e)
	{
		e.printStackTrace();
	}
	return data;
	}

}
