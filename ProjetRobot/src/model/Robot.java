package model;

import process.Deplacements;

public class Robot {
    private String nom;
    private Grille grille;
    private Case position;

    //attribut qui permettra de deplacer le robot grace au design pattern strategy
    private Deplacements deplacementStrategy;

    public Robot(String nom, Grille grille, Case position, Deplacements deplStrat){
        this.setNom(nom);
        this.setGrille(grille);
        this.setPosition(position);
        this.setDeplacement(deplStrat);
    }

    public void setDeplacement(Deplacements deplacement){
        this.deplacementStrategy=deplacement;
    }

    public Deplacements getDeplacement(){
        return deplacementStrategy;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }

    public Case getPosition() {
        return position;
    }

    public void setPosition(Case position) {
        this.position = position;
    }


    public void haut(){
        if (position.getX() > 1) {
            position.setX(position.getX() - 1);
        }
    }

    public void bas(){
        if (position.getX() < grille.getNbLigne()) {
            position.setX(position.getX() + 1);
        }
    }

    public void gauche(){
        if (position.getY() > 1) {
            position.setY(position.getY() - 1);
        }
    }

    public void droite(){
        if (position.getY() < grille.getNbColonne()) {
            position.setY(position.getY() + 1);
        }
    }


    //Strategy permet d'eviter des conditions du type: si on est en deplacement manuel alors (50lignes de logiques pour le deplacement)
    public void seDeplacer(Directions directions){
       if (directions != null){
           switch(directions){
               case HAUT: haut();
               break;
               case BAS: bas();
               break;
               case GAUCHE: gauche();
               break;
               case DROITE: droite();
               break;
           }
       }
    }


}