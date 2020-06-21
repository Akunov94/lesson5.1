package com.company;

public class Boss {
    private int healthBoss;
    private int DamageBoss;
    private int defenceType;

    public int getHealthBoss() {
        return healthBoss;
    }

    public void setHealthBoss(int healthBoss) {
        this.healthBoss = healthBoss;
    }

    public int getDamageBoss() {
        return DamageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        DamageBoss = damageBoss;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "healthBoss=" + healthBoss +
                ", DamageBoss=" + DamageBoss +
                ", defenceType=" + defenceType +
                '}';
    }

}
