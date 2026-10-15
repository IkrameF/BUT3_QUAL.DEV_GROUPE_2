package model;

public class Robot {
    private String nom;
    private Grille grille;
    private Case position;

    public Robot(String nom, Grille grille, Case position){
        this.setNom(nom);
        this.setGrille(grille);
        this.setPosition(position);
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

    }

    public void bas(){

    }

    public void gauche(){

    }

    public void droite(){

    }

    public void seDeplacer(Directions directions){
        switch(directions){
            case HAUT : haut();
            case BAS : bas();
            case GAUCHE : gauche();
            case DROITE : droite();
        }
    }


}
