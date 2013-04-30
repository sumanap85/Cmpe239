package com;

import com.aliasi.util.AbstractExternalizable;
import com.aliasi.util.Files;

import com.aliasi.classify.Classification;
import com.aliasi.classify.Classified;
import com.aliasi.classify.DynamicLMClassifier;
import com.aliasi.classify.LMClassifier;

import com.aliasi.lm.NGramProcessLM;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class SentimentTrain {

    File mPolarityDir;
    String[] mCategories;
    DynamicLMClassifier<NGramProcessLM> mClassifier;
    LMClassifier mClassifier1;    

    SentimentTrain(String args) {
        System.out.println("\nBASIC POLARITY DEMO");
        mPolarityDir = new File(args,"txt_sentoken");
        System.out.println("\nData Directory=" + mPolarityDir);
        mCategories = mPolarityDir.list();
        System.out.println(Arrays.asList(mCategories));
        int nGram = 8;
        mClassifier 
            = DynamicLMClassifier
            .createNGramProcess(mCategories,nGram);
    }

    void run() throws ClassNotFoundException, IOException {
        train();
       // evaluate();
    }

    boolean isTrainingFile(File file) {
        return file.getName().charAt(2) != '9';  // test on fold 9
    }

    void train() throws IOException {
        System.out.println("\nTraining.");
        for (int i = 0; i < mCategories.length; ++i) {
            String category = mCategories[i];
            Classification classification
                = new Classification(category);
            File file = new File(mPolarityDir,mCategories[i]);
            File[] trainFiles = file.listFiles();
            for (int j = 0; j < trainFiles.length; ++j) {
                File trainFile = trainFiles[j];
                if (isTrainingFile(trainFile)) {
                    String review = Files.readFromFile(trainFile,"ISO-8859-1");
                    Classified<CharSequence> classified
                        = new Classified<CharSequence>(review,classification);
                    mClassifier.handle(classified);
                }
            }
        }
        AbstractExternalizable.compileTo(mClassifier, new File("sentiment.model"));
        System.out.println(" Training Completed ");
    }

    void evaluate() throws IOException {
    	try {
			mClassifier1 =(LMClassifier) AbstractExternalizable.readObject(new File("sentiment.model"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("\nEvaluating.");
        int numTests = 0;
        int numCorrect = 0;
        String str = "OMG!! How could i have not known about this place?! well because it's in that odd slightly outta the way area of kendall sq across from the landmark cinema. I stopped in here after seeing a movie for a nightime snack. I was in love with the place right away- large doll heads in plant pots in the entry, and a little vintage nook area with 50's style couch and formica. ah, the 50's, this place is a kitsch lovers dream! and the food- a delightful menu of breakfast thro dinner items served all day. Being a lover of breakfast at night, I opted for the hansel and gretel waffle which was delightful. very hard to choose tho, with so many excellent choices. I'd prob give it 5 stars, but i'd want to come back during a busier time to see how seating and service goes then. all was great tonight.";
        String str1 = "Was a walk by 'oh lets eat there' type of situation.  Service took for. ever.  $4 mango iced tea wasn't worth $4, but it was pretty tasty.  Chicken club is some buster ass sandwich, on white bread--not a bun and delicious chicken patty and whatever yummy thing you might expect to come out from a place where the waiter greets you in french.  Waiter took so long to even come around and check in on us that we almost consider dining and dashing.  Almost.";
        String str2 = "This place (as mentioned) was BEAUTIFUL. There was only two other groups of people in the place but, I was so excited when we had first arrived, and was pleased with their beer list. Ordered a Gansett Porter, found out they were all out, ordered another selection, all out and they poured me something I had never heard of. It sucked, very acidic.. just awful. Finally, I just asked for a Magic Hat, was fine. Impressed with the locally inspired options (saugies and beans, stuffies, johnnycakes). We ordered randomly.. two bowls of RI chowder, JohnnyCakes with gravy, stuffies and clam cakes.. The chowder came first-- it was full of potatoes and tasted acidic and urine like..typically indicates bad shellfish, they had no oyster crackers and brought out stale bread with no butter.. we sent it back thinking whatever it will get better. Johnny Cakes were VERY hard, the gravy was gelatinous and cold, and the clam cakes were incredibly dark and liquidous  in the center. The stuffies were cold, and they didn't offer hot sauce or lemon. The stuffies were bad, but not awful..other than that OUR ENTIRE MEAL WAS INEDIBLE. We were told this never happens and our waitress took it back and said she would see what they have to say. She comes out a few minutes later and says ''I have no explanation, I'm just charging you for the two beers, that's all I can do.\" Not an apology, or anything! The bill was 9.63, we left $10 and left. SO HORRIBLE.";
        Classification classification1
        = mClassifier1.classify(str);
        System.out.println(classification1.bestCategory());
        classification1
        = mClassifier1.classify(str1);
        System.out.println(classification1.bestCategory());
        classification1
        = mClassifier1.classify(str2);
        System.out.println(classification1.bestCategory());
        for (int i = 0; i < mCategories.length; ++i) {
            String category = mCategories[i];
            File file = new File(mPolarityDir,mCategories[i]);
            File[] trainFiles = file.listFiles();
            for (int j = 0; j < trainFiles.length; ++j) {
                File trainFile = trainFiles[j];
                if (!isTrainingFile(trainFile)) {
                    String review = Files.readFromFile(trainFile,"ISO-8859-1");
                    ++numTests;
                    Classification classification
                        = mClassifier1.classify(review);
                    //System.out.println(review+"-------"+classification.bestCategory());
                    if (classification.bestCategory().equals(category))
                        ++numCorrect;
                }
            }
        }
        System.out.println("  # Test Cases=" + numTests);
        System.out.println("  # Correct=" + numCorrect);
        System.out.println("  % Correct=" 
                           + ((double)numCorrect)/(double)numTests);
    }

    public static void main(String[] args1) {
    	String args = "C:\\Users\\sowmya\\Desktop\\239\\review_polarity";
        try {
            new SentimentTrain(args).run();
        } catch (Throwable t) {
            System.out.println("Thrown: " + t);
            t.printStackTrace(System.out);
        }
    }

}
