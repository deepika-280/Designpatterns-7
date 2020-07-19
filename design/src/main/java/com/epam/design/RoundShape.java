package com.epam.design;

public class RoundShape extends AbstractFactory  {
	 public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundRectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundSquare();
	      }	 
	      return null;
	   }
}
