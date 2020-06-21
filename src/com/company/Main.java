package com.company;


public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealthBoss(100);
        boss1.setDamageBoss(150);
        boss1.setDefenceType(200);
        System.out.println(boss1);
    }

    public static void createHeroes() {
        Hero Kinetic = new Hero(250, 200);
        Hero Golem = new Hero(200, 100);
        Hero Magic = new Hero();
            Magic.setHealthHero(200);
            Magic.setDamageHero(100);
            Magic.setAttakType(150);

    }
}
