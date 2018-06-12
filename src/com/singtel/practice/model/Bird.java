package com.singtel.practice.model;

public class Bird extends Animal implements Cloneable {
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
	
	@Override
	protected Bird clone() {
		Bird clonedBird = new Bird();
		clonedBird.setCanWalk(this.isCanWalk());
		clonedBird.setCanFly(this.canFly);
		clonedBird.setCanSing(this.isCanSing());
		clonedBird.setCanSwim(this.isCanSwim());
		clonedBird.setSound(this.getSound());
		
		return clonedBird;
	}
}
