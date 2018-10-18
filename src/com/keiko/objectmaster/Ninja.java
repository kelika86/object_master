package com.keiko.objectmaster;

public class Ninja extends Human {
	public int stealth;
	public Ninja() {
		this.stealth=10;
	}
	public void steal (Human stole) {
		stole.health -= this.stealth; 
		this.health += this.stealth;
		System.out.println("Human stole ninja's stealth by " + this.stealth + "and ninja's current health is " + this.health);
	}
	
	public void runAway() {
		this.health -=10;
		System.out.println("Ninja's health after running away is " + this.health);
	}
}
