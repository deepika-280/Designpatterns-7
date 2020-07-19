package com.epam.design1;

public abstract class colddrink implements ItemType{
	public mover packing() {
       return new Bottles();
	}

	public abstract float price();

}