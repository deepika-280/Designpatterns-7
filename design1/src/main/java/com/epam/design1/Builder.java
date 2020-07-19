package com.epam.design1;

public class Builder {
	public static void main(String[] args) {
		   
	      Meals m = new Meals();

	      Mealday vegMeal = m.VegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	}

}
