package com.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDB {
	
	private String elect, chain, mtb, nomal, nokick, onkick, nocar, oncar;
	
	AdminDB(String elect, String chain, String mtb, String nomal, String nokick, String onkick, String nocar, String oncar)
	{
		this.elect = elect;
		this.chain = chain;
		this.mtb = mtb;
		this.nomal = nomal;
		this.nokick = nokick;
		this.onkick = onkick;
		this.nocar = nocar;
		this.oncar = oncar;
	}

	public String getElect() {return elect;}
	public String getChain() {return chain;}
	public String getMtb() {return mtb;}
	public String getNomal() {return nomal;}
	public String getNokick() {return nokick;}
	public String getOnkick() {return onkick;}
	public String getNocar() {return nocar;}
	public String getOncar() {return oncar;}
}
