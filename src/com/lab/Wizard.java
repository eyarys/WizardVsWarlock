package com.lab;

public class Wizard extends Character {
    Wizard (String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }

    //this 2 methods is the attack spells
    public void thunder(Character enemyCharacter) {
        int damagePoints = 30;
        int manaCost = 20;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with thunder (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void fireStorm(Character enemyCharacter){
        int damagePoints = 50;
        int manaCost = 35;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with fireStorm (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }

    //this method is the heal spell
    public void healSpell(){
        int heal=90;
        int manaRegen=80;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }


}