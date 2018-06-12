package com.singtel.practice.model;

public class Bird extends Animal implements Cloneable {
	
	@Override
	protected Bird clone() {
		Bird clonedBird = new Bird();
		clonedBird.setCanWalk(this.isCanWalk());
		clonedBird.setCanFly(this.isCanFly());
		clonedBird.setCanSing(this.isCanSing());
		clonedBird.setCanSwim(this.isCanSwim());
		clonedBird.setSound(this.getSound());
		
		return clonedBird;
	}
}
