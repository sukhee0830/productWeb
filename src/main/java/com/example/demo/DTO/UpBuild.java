package com.example.demo.DTO;


public class UpBuild {
	
	private String id, name, pw, maddr, saddr, paddr, s1, s2;
	
	
	
	
	public UpBuild ID(String id){this.id = id;return this;}
	public UpBuild NAME(String name){this.name = name;return this;}
	public UpBuild PW(String pw){this.pw = pw;return this;}
	public UpBuild MADDR(String maddr){this.maddr = maddr;return this;}
	public UpBuild SADDR(String saddr){this.saddr = saddr;return this;}
	public UpBuild PADDR(String paddr){this.paddr = paddr;return this;}
	public UpBuild S1(String s1){this.s1 = s1;return this;}
	public UpBuild S2(String s2){this.s2 = s2;return this;}
	public UpDB Biluder(){return new UpDB(id, name, pw, maddr, saddr, paddr, s1, s2);}
}
