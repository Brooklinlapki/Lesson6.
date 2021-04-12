package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setTypeOfProtection("Increase");

        System.out.println("Boss health: " + boss.getHealth() + "\n" + "Boss damage: " + boss.getDamage() + "\n" +
                "Boss Protection: " + boss.getTypeOfProtection());

        createHero();
        for (int i = 0; i < createHero().length; i++) {
            System.out.println("Health" + " " + createHero()[i].getHealth() + " " + "Damage:" + createHero()[i].getDamage() + " " + "Super Power:" +  createHero()[i].getSuperPower());
        }
    }

    public static Hero[] createHero(){
        Hero thor = new Hero(300,40,"Lightning");
        Hero vision = new Hero(280,30);
        Hero blackWidow = new Hero(260,20,"slope");

        Hero superHeroes[] = {thor, vision, blackWidow};
        return superHeroes;
    }
}