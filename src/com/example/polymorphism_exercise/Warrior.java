package com.example.polymorphism_exercise;

public class Warrior extends Person {

    private Weapon weapon;
    public Warrior(String name) {
        super(name);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void decHealth(int amt) {
        this.setHealth(Math.max(0, health - amt));
    }

    public void attack(Warrior opponent) {
        if (this.getHealth() > 0 && opponent.getHealth() > 0 && this.weapon != null) {
            System.out.println(this.getName() + " is attacking " + opponent.getName());
            weapon.strike(opponent);
            System.out.println(opponent.getName() + "'s health is now " + opponent.getHealth());
        }
    }
}
