package fr.diginamic.combat.entites;

public class Troll extends Creature{

    // Constructeur de Créature avec pour force et puissance des valeur int random
    public Troll (){
        super("Troll",(int)(Math.random()*6+3),(int)(Math.random()*5+10));
    }
}
