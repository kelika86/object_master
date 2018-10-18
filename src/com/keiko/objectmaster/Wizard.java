package com.keiko.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		this.health=50;
		this.intelligence=8;
	}
	public void heal (Human healed) {
		healed.health+=this.intelligence; //healed is referred to Human and this mean "this" Wizard// overloading + adding 8 wizard intelligence to human
		System.out.println("Wizard has healed Human is " + healed.health);
	}
	
	public void fireball (Human fireballed) { //fireball is called a method and fireballed is the parameter//overloading --wizard intel: 8*3=24 so human health minus 24
		fireballed.health-=this.intelligence*3;
		System.out.println("Wizard has fireballed Human by and current health is " + fireballed.health);
	}
}
