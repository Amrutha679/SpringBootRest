package com.mondee;

public class Topic {
	
	private String tid;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String tid,String name,String description) {
		super();
		this.tid = tid;
		this.name = name;
		this.description = description;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
