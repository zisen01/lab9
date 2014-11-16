package ca.ualberta.cs.lonelytwitter;

import java.util.List;

import ca.ualberta.cs.lonelytwitter.data.LonelyTweet;

public interface TweetsManager {

	public abstract List<LonelyTweet> loadTweets();

	public abstract void saveTweets(List<LonelyTweet> tweets);

}