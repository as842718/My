package com.bot.runner.botuser;

public class User {

	private String userID;
	
	private String  password;
	
	private String reviewID;
	
	private String userComment;

	public User(String userID, String password, String reviewID, String userComment) {
		
		this.userID=userID;
		this.password=password;
		this.reviewID=reviewID;
		this.userComment=userComment;
		
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReviewID() {
		return reviewID;
	}

	public void setReviewID(String reviewID) {
		this.reviewID = reviewID;
	}

	public String getUserComment() {
		return userComment;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", password=" + password + ", reviewID=" + reviewID + ", userComment="
				+ userComment + "]";
	}
	
	
	

}
