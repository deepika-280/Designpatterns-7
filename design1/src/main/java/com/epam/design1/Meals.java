package com.epam.design1;

public class Meals {
	public Mealday VegMeal(){
	      Mealday m = new Mealday();
	      m.addItem(new Vegburger());
	      m.addItem(new coco());
	      return m;
	   }   

}