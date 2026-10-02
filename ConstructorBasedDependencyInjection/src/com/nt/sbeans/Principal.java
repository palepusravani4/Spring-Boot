package com.nt.sbeans;

public class Principal {
   String name;
   int exp;
   public void setName(String name) {
	this.name = name;
   }
   public void setExp(int exp) {
	this.exp = exp;
   }
   public void pricipal() {
	   System.out.println("Principal: "+name+"("+exp+" years experience)");
   }
}
