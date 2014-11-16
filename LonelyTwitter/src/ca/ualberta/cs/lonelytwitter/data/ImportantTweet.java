package ca.ualberta.cs.lonelytwitter.data;

import android.util.Log;

public class ImportantTweet extends LonelyTweet {

	private static final long serialVersionUID = 1L;

	public ImportantTweet(String text) {
		super(text);
		this.maxNumChars = 20;
	}

	@Override
	public String toString() {
		String importantTweetString = "IMPORTANT " + this.tweetDate + " | " + this.tweetBody;
		Log.i("MY_TAG", importantTweetString);
		
		return importantTweetString;
	}

	public String getTweetBody() {
		return "IMPORTANT " + tweetBody;
	}

	
}
