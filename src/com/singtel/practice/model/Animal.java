package com.singtel.practice.model;

public class Animal {
	private boolean canSing;
	private boolean canSwim;
	private String sound;

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
		System.out.println("I can walk");
	}
}
