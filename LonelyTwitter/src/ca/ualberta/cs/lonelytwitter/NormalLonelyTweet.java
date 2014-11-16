package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date tweetDate;
	private String tweetBody;
	
	public NormalLonelyTweet(Date tweetDate, String tweetBody) {
		this.tweetDate = tweetDate;
		this.tweetBody = tweetBody;
	}

	public Date getTweetDate() {
		return tweetDate;
	}

	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

	public String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	
	public boolean isValid() {
		if (tweetBody.trim().length() == 0 && tweetBody.trim().length() > 10) {
			return false;
		}
		
		return true;
	}
	
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeObject(tweetDate);
		out.writeObject(tweetBody);
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		tweetDate = (Date) in.readObject();
		tweetBody = (String) in.readObject();
	}

	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}
}
