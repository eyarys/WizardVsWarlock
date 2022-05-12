package com.lab;

public class Warlock extends Character {
    Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

    //this 2 methods is the attack spells
    public void nailStorm(Character enemyCharacter) {
        int damagePoints = 30;
        int manaCost = 20;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with nailStorm (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void snowBall(Character enemyCharacter){
        int damagePoints = 50;
        int manaCost = 35;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with snowBall (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }

    //this method is the heal spell
    public void healthRegen(){
        int heal=90;
        int manaRegen=80;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}