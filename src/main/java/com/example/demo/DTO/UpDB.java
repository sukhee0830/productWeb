package com.example.demo.DTO;


import lombok.Getter;

@Getter
public class UpDB {

	private String id, name, pw, maddr, saddr, paddr, s1, s2;
	
	public UpDB(String id, String name, String pw, String maddr, String saddr, String paddr, String s1, String s2)
	{this.id = id;this.name = name;this.pw = pw;this.maddr = maddr;this.saddr = saddr;this.paddr = paddr;this.s1 = s1;this.s2 = s2;}
	public String getId(){return id;}
	public String getName(){return name;}
	public String getPw(){return pw;}
	public String getMaddr(){return maddr;}
	public String getSaddr(){return saddr;}
	public String getPaddr(){return paddr;}
	public String getS1(){return s1;}
	public String getS2(){return s2;}
}
