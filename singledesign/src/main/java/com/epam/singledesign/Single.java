package com.epam.singledesign;

public class Single {
	private static Single s = new Single();
	   private Single(){}
	   public static Single getInstance(){
	      return s;
	   }

	   public void show(){
	      System.out.println("It's a single pattern type");
	   }


}