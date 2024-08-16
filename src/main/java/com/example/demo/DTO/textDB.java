package com.example.demo.DTO;

import lombok.Getter;

@Getter
public class textDB {
	
	private int serial;
	private String id, title, story, cdate;
	
	textDB(int serial, String id, String title, String story, String cdate)
	{
		this.serial = serial;
		this.id = id;
		this.title = title;
		this.story = story;
		this.cdate = cdate;
	}
	
	public int getSerial(){return serial;}
	public String getId(){return id;}
	public String getTitle(){return title;}
	public String getStory(){return story;}
	public String getCdate(){return cdate;}
}

