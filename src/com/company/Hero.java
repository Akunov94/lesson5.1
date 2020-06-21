package com.company;

public class Hero {
    private int healthHero;
    private int damageHero;
    private int attakType;

    public Hero(){}

    public int getHealthHero() {
        return healthHero;
    }

    public void setHealthHero(int healthHero) {
        this.healthHero = healthHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        this.damageHero = damageHero;
    }

    public int getAttakType() {
        return attakType;
    }

    public void setAttakType(int attakType) {
        this.attakType = attakType;
    }

    public Hero(int health, int damage) {
        this.healthHero = health;
        this.damageHero = damage;
    }
}

