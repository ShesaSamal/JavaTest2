package com.singtel.practice.model;

public class Animal {
	private boolean canWalk;
	private boolean canSing;
	private boolean canSwim;
	private String sound;
	
	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void swim() {
		if (canSwim) {
			System.out.println("I can swim");
		} else {
			System.out.println("I can't swim");
		}
	}

	public String sing() {
		if (canSing) {
			System.out.println(sound);
			return sound;
		}else {
			return "";
		}
	}

	public void walk() {
		if (canWalk) {
			System.out.println("I can walk");
		} else {
			System.out.println("I can't walk");
		}
	}
}
