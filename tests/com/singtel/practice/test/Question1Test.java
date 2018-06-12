package com.singtel.practice.test;

import org.junit.Assert;
import org.junit.Test;

import com.singtel.practice.model.Bird;
import com.singtel.practice.model.Chicken;
import com.singtel.practice.model.Duck;

public class Question1Test {
	
	@Test
	public void testQuestion1() {
		Bird bird = new Chicken();
		Assert.assertEquals("Cluck, cluck", bird.sing());
		
		bird = new Duck();
		Assert.assertEquals("Quack, quack", bird.sing());
	}
}
