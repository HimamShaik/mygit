package com.technoelevate.encapsulation;

public class Bgmi {
	public String name;
	public int health;
	public String weapon;

	public void looseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out");
		}
	}

	public int healthRemaining() {
		return this.health;
	}

}
