package com.singtel.practice.test;

import org.junit.Assert;
import org.junit.Test;

import com.singtel.practice.model.Bird;
import com.singtel.practice.model.Rooster;

public class Question3Test {
	
	@Test
	public void testQuestion3() {
		Bird rooster = Rooster.getInstance();
		Assert.assertEquals("Cock-a-doodle-doo", rooster.sing());
	}
}
