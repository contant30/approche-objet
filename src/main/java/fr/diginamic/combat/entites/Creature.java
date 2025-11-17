package fr.diginamic.combat.entites;

public abstract class Creature {

    protected String nom;
    protected int force;
    protected int pointsSante;

    public Creature(String nom, int force, int pointsSante) {
        this.nom = nom;
        this.force = force;
        this.pointsSante = pointsSante;
    }

    // Methode pour savoir si en vie ou non
    public boolean enVie(){
        return pointsSante >0;
    }

    // Methode pour recevoir des dégats
    public void recevoirDegats(int degats){
        pointsSante = Math.max(0,pointsSante - degats);
    }

    // Methode pour envoyer des dégats
    public int attaquer(){
        return force + (int)(Math.random()*10+1);
    }

    public String getNom(){
        return nom;
    }

    public int getPointsSante(){
        return pointsSante;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "nom='" + nom + '\'' +
                ", force=" + force +
                ", pointsSante=" + pointsSante +
                '}';
    }
}
