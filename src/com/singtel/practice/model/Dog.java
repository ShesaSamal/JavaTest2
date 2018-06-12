package com.singtel.practice.model;

public class Dog extends Animal {

	public Dog() {
		super.setCanWalk(true);
		super.setCanSing(true);
		super.setCanSwim(true);
		super.setSound("Woof, woof");
	}
}
