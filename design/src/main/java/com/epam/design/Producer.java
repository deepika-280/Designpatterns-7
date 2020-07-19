package com.epam.design;

public class Producer {
	public static AbstractFactory get(boolean rounded){   
	      if(rounded){
	         return new RoundShape();         
	      }else{
	         return new ShapeFactory();
	      }
	   }


}
