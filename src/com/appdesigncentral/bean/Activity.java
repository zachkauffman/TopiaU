package com.appdesigncentral.bean;

public class Activity {
	private int avatar, ivpost;
	private String name, comment, time;

	public Activity(int avatar, int ivpost, String name, String comment,
			String time) {
		super();
		this.avatar = avatar;
		this.ivpost = ivpost;
		this.name = name;
		this.comment = comment;
		this.time = time;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public int getIvpost() {
		return ivpost;
	}

	public void setIvpost(int ivpost) {
		this.ivpost = ivpost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
