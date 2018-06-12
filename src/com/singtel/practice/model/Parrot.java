package com.singtel.practice.model;

public class Parrot extends Bird {
	
	public Parrot() {
		super.setCanWalk(true);
		super.setCanFly(true);
		super.setCanSing(true);
		super.setCanSwim(false);
	}

	public void setNearbyObjectSound(Object nearbyObject) throws Exception{
		if(nearbyObject instanceof Animal) {
			this.setSound(((Animal)nearbyObject).getSound());
		}else if(nearbyObject instanceof Machine) {
			this.setSound(((Machine)nearbyObject).getSound());
		}else {
			throw new Exception("Invalid Nearby object type");
		}
	}
}
