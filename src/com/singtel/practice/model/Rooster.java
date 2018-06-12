package com.singtel.practice.model;

public class Rooster extends Bird {

	public static Bird getInstance() {
		Bird bird = new Chicken();
		bird.setSound("Cock-a-doodle-doo");
		
		return bird.clone();
	}
}
