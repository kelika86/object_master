package com.keiko.objectmaster;

public class Human {
	public int health;
	public int strength;
	public int stealth;
	public int intelligence;
	public Human() {
		this.health=100;
		this.strength=3;
		this.stealth=3;
		this.intelligence=3;
	}
	public Human attack(Human attacked) {
		attacked.health-=this.strength;
		return this;
	}
	public void displayHealth() {
		System.out.println("Human health is " + this.health);
	}
}



