package com.nag.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ToDo {
	
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	private String summary;
	private String description;
	private String id;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
