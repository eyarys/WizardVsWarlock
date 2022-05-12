package com.lab;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        //creating the objects
        Wizard Thea = new Wizard("Thea", 30,300,400);
        Warlock Chen = new Warlock("Chen", 15, 150, 200);

        //the implementation of method nameDisplay();
        Thea.nameDisplay();
        Chen.nameDisplay();

        //start of the sequence
        Thea.fireStorm(Chen);

        //implementation of method showStats();
        Thea.showStats();
        Chen.showStats();

        Chen.nailStorm(Thea);
        Thea.showStats();
        Chen.showStats();

        //the use of regen spell
        Thea.healSpell();
        Thea.showStats();
        Chen.showStats();

        Chen.snowBall(Thea);
        Thea.showStats();
        Chen.showStats();

        Thea.thunder(Chen);

        //the levelUp(); method
        Thea.levelUp();
    }
}
