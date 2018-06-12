package com.singtel.practice.model;

public class Duck extends Bird {

	public Duck() {
		super.setCanWalk(true);
		super.setCanFly(false);
		super.setCanSing(true);
		super.setCanSwim(true);
		super.setSound("Quack, quack");
	}
}
