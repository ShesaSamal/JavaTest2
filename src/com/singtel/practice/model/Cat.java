package com.singtel.practice.model;

public class Cat extends Animal {

	public Cat() {
		super.setCanWalk(true);
		super.setCanSing(true);
		super.setCanSwim(false);
		super.setSound("Meow");
	}
}
