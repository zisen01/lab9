package ca.ualberta.cs.lonelytwitter.data;

import java.io.Serializable;


public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	private static final long serialVersionUID = 1L;

	public NormalLonelyTweet(String text) {
		super(text);
	}
	
	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}

	public String getTweetBody() {
		return tweetBody;
	}
}
