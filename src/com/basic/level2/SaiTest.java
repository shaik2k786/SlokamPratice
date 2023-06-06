package com.basic.level2;

public class SaiTest {
	public static void main(String[] args) {


		Smobile sm=new Smobile("realme", 7995958, "jio");
		Smobile sm1=new Smobile("realme", 7995958, "jio");
		Smobile sm2=new Smobile("realme", 7995958, "jio");
		Smobile [] mob= {sm,sm1,sm2};
		
		for(int i=0;i<=mob.length-1;i++) {
			System.out.println(mob[i].getMobile()+"--"+mob[i].getPnumber()+"--"+mob[i].getSim());
		}
       SaiPasport sp=new SaiPasport(10, "shaik", 'm');
       System.out.println(sp.getPasid()+"--"+sp.getName()+"--"+sp.getGender());
       
       
       Saida s=new Saida(1, "shaik", "29", 93929190, mob);
       System.out.println(s.getSid()+"--"+s.getPnum()+"--"+s.getSage()+"--"+s.getPnum());
	}
}
