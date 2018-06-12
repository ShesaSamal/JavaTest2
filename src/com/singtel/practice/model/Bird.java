package com.singtel.practice.model;

public class Bird extends Animal {
	private boolean canFly;

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void fly() {
		if (canFly) {
			System.out.println("I can fly");
		} else {
			System.out.println("I can't fly");
		}
	}
}
