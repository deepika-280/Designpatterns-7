package com.epam.design;

public class Abstract {
	public static void main(String[] args) {
	      AbstractFactory shapeFactory = Producer.get(false);
	      Shape shape11 = shapeFactory.getShape("RECTANGLE");
	      shape11.draw();
	      Shape shape21 = shapeFactory.getShape("SQUARE");
	      shape21.draw();
	      AbstractFactory shapeFactory1 = Producer.get(true);
	      Shape shape31 = shapeFactory1.getShape("RECTANGLE");
	      shape31.draw();
	      Shape shape41 = shapeFactory1.getShape("SQUARE");
	      shape41.draw();
	      
	   }

}