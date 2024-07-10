package com.example.demo.DTO;


public class AdminBuild {
	
	private String elect, chain, mtb, nomal, nokick, onkick, nocar, oncar;
	
	public AdminBuild elect(String elect){this.elect = elect;return this;}
	public AdminBuild chain(String chain){this.chain = chain;return this;}
	public AdminBuild mtb(String mtb){this.mtb = mtb;return this;}
	public AdminBuild nomal(String nomal){this.nomal = nomal;return this;}
	public AdminBuild nokick(String nokick){this.nokick = nokick;return this;}
	public AdminBuild onkick(String onkick){this.onkick = onkick;return this;}
	public AdminBuild nocar(String nocar){this.nocar = nocar;return this;}
	public AdminBuild oncar(String oncar){this.oncar = oncar;return this;}
	public AdminDB build()
	{
		return new AdminDB(elect, chain, mtb, nomal, nokick, onkick, nocar, oncar);
	}
}
