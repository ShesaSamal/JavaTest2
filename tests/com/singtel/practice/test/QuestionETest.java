package com.singtel.practice.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import org.junit.Test;

import com.singtel.practice.model.Animal;
import com.singtel.practice.model.Bird;
import com.singtel.practice.model.Cat;
import com.singtel.practice.model.Chicken;
import com.singtel.practice.model.Dog;
import com.singtel.practice.model.Duck;
import com.singtel.practice.model.Parrot;
import com.singtel.practice.model.Rooster;

public class QuestionETest {
	
	private Animal[] animals = new Animal[]{
			 new Bird(),
			 new Duck(),
			 new Chicken(),
			 new Rooster(),
			 new Parrot(),
			 new Dog(),
			 new Cat()
			};
	
	@Test
	public void testQuestion4() throws Exception{
		List<Animal> animalList = (List<Animal>)Arrays.asList(animals);
		
		final AtomicInteger counter = new AtomicInteger(0);
		
		animalList
	    .stream()
	    .filter(s -> s.isCanFly())
	    .forEach(s -> counter.getAndIncrement());
		
		System.out.println("Count of animals that can fly: "+counter.get());
		
		final AtomicInteger counter2 = new AtomicInteger(0);
		
		animalList
	    .stream()
	    .filter(s -> s.isCanWalk())
	    .forEach(s -> counter2.getAndIncrement());
		
		System.out.println("Count of animals that can walk: "+counter2.get());
		
		final AtomicInteger counter3 = new AtomicInteger(0);
		
		animalList
	    .stream()
	    .filter(s -> s.isCanSing())
	    .forEach(s -> counter3.getAndIncrement());
		
		System.out.println("Count of animals that can sing: "+counter3.get());
		
		final AtomicInteger counter4 = new AtomicInteger(0);
		
		animalList
	    .stream()
	    .filter(s -> s.isCanSwim())
	    .forEach(s -> counter4.getAndIncrement());
		
		System.out.println("Count of animals that can swim: "+counter4.get());
	}
	
}
