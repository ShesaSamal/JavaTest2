package com.singtel.practice.model;

public class Chicken extends Bird {

	public Chicken() {
		super.setCanFly(false);
		super.setCanSing(true);
		super.setCanSwim(false);
		super.setSound("Cluck, cluck");
	}
}
