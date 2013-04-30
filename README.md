Hot Meals Steward README file
==============================
 
The Hot Meals Steward Project is an online recommendation system which consolidates all the reviews of a restaurant, and suggests 
only the top rated restaurants based on ethnicity of cuisine.With the raising popularity of ecommerce, blogs about product reviews, 
social networking many people have turned to the Internet for suggestions, alternatives and decision-making. People now want to know 
which bag to buy, which restaurant to go to, where to get a haircut, and all this information and ratings of these businesses are
available on their fingertips. Gone are the days of asking reviews from peers, family, or friends, now reliable reviews from different 
users are available in websites like Yelp. All this information is readily available but they are scattered, websites like yelp only 
give a list of restaurants and their reviews.User history and review is taken into consideration to recommend other similar businesses.
This project attempts to uncover data mining techniques and algorithms to build a proficient and applicable recommendation system. 

System Requirements
===================

- Eclipse EE Juno (see:http://www.eclipse.org/juno)

- Apache Tomcat Application Server(see: http://tomcat.apache.org/tomcat-7.0-doc/index.html)
 
- lingpipe-4.1.0.jar (see: http://alias-i.com/lingpipe/web/install.html)

-jackson-all-1.9.0.jar(see: http://www.java2s.com/Code/Jar/j/Downloadjacksonall190jar.htm)

In addition there are additional Jar files that has to be included to run this project. Jar files can be found in project library folder


Installation
============

**Make sure that Tomcat is installed correctly to deploy this project**

Installation should be as simple as going to the Hot Meals Steward source code
Directory, and typing:

1.  Import the project as existing project in Eclipse Workspace
2.	YelpWeb is a dyanmic web project. File->import->Dynamic Web Project or include the WAR file 
3.	Change the name of Json file reference in Yelp.java to point to your dataset location(where YelpDataSet1, YelpDataSet2, YelpDataSet3 are stored)
4.	Run sentimentTrain.java to train your dataset to find positive and negative. This will give you a model file (sentiment.model) as output
5.	Run Yelp.java to get form the final output
6.	Run Main.jsp as Run on Server to get the web page. This web page allows you to navigate to other options provided in the site

Package Explanation
===================

1. Testing
==========

1. Hot Meals Steward allows you to test with different training dataset and train the algorithm
2. Random reviews can be aggregated and fed to sentiment analysis to get positive and negative reviews

Source Code Repository
======================

Like most of the Open source Data mining projects, Hot Meals Steward 
currently uses git for distributed source code control, hosted by github
at https://github.com/sushmithas/Cmpe239.git

Package Explanation
===================

1. com.ItemItemFiltering : contains implementation of collaborative filtering for business and user
2. com.MatrixRow: a class defined to structure mxn matrix for business recommendation
3. com.yelp: contains business logic
4. com.YelpDataSet1 : defines User_information JSON format
4. com.YelpDataSet2: defines User_review_on_business JSON format
5. com.YelpDataSet3: defines business_information JSON format
6. com.SentimentTrain : trains algorithm for sentiment analysis on reviews
7. sjsu.cmpe239.web.BusinessRecomServlet: contains implementation logic to display business 	   recommendations
8. sjsu.cmpe239.web.CompareUsersServlet:contains implementation logic to display user recommendations

