package com.keiko.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human bob=new Human();
		Human bill=new Human();
		Human joe=new Human();// TODO Auto-generated method stub
		bob.attack(bill);
		bill.displayHealth();
		Wizard lisa=new Wizard();
		lisa.fireball(bob);
		lisa.heal(bob);
		Ninja keiko=new Ninja();
		keiko.steal(bill);
		keiko.runAway();
		Samurai nobunaga=new Samurai();
		nobunaga.deathBlow(joe);
		nobunaga.meditate();
		nobunaga.howMany();
	}
	
}
