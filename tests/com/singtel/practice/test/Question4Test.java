package com.singtel.practice.test;

import org.junit.Assert;
import org.junit.Test;

import com.singtel.practice.model.Cat;
import com.singtel.practice.model.Dog;
import com.singtel.practice.model.Parrot;
import com.singtel.practice.model.Rooster;

public class Question4Test {
	
	@Test
	public void testQuestion4() throws Exception{
		Parrot parrotObj = new Parrot();
		parrotObj.setNearbyObjectSound(new Cat());
		
		Assert.assertEquals("Meow", parrotObj.sing());
		
		parrotObj = new Parrot();
		parrotObj.setNearbyObjectSound(Rooster.getInstance());
		
		Assert.assertEquals("Cock-a-doodle-doo", parrotObj.sing());
		
		parrotObj = new Parrot();
		parrotObj.setNearbyObjectSound(new Dog());
		
		Assert.assertEquals("Woof, woof", parrotObj.sing());
	}
}
