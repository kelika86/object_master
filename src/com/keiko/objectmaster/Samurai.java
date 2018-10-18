package com.keiko.objectmaster;

public class Samurai extends Human {
	private static int counter;
	public Samurai() {
		this.health=200;
		counter++;
	}
	public void deathBlow (Human deathBlown) {
		deathBlown.health=0;
		this.health=this.health/2;
		System.out.println("Samurai killed human and Samurai's health is cut by " + this.health);
	}
	public void meditate() {
		this.health=this.health *2;
		System.out.println("Samurai meditates and health is " + this.health);
	}
	public static int howMany() {
		return counter;
		System.out.println("There is " + counter "samurai");
	}
}
