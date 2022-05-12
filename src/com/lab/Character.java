package com.lab;

public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    //non-parameterized constructor
    Character(){
        System.out.println("Non Parameterized Constructor");
    }

    //parameterized constructor
    Character(String name, int newLevel, int newHealth, int newMana){
        characterName = name;
        level = newLevel;
        manaPoints = newMana;
        healthPoints = newHealth;
    }

    //the nameDisplay(); method
    public void nameDisplay(){
        System.out.println("Character Initialized "+ characterName);
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){

        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

        //the prompt if a character is defeated
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character "+ enemyCharacter.characterName +" Defeated");
        }
    }

    //method for showing the stats of the character
    public void showStats(){
        System.out.println(characterName +" Status \nHP "+ healthPoints +"\nMana "+ manaPoints);
    }

    //method for increasing the level of the winner
    public void levelUp(){
        int levelUp = 10;
        level += levelUp;

        System.out.println(characterName +" Leveled up to Level "+ level);
    }
}
