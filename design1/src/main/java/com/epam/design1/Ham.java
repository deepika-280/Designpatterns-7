package com.epam.design1;

public abstract class Ham implements ItemType{
	 public mover packing() {
	      return new franky();
	   }

	   public abstract float price();

}