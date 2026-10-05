package fr.iutmetz.info.projetrobot;

public class Robot {
    private String nom;
    //private Grille grille;
    //private Case position;
}

public Robot(String nom, Grille grille, Case position){
    this.nom = nom;
    this.grille = grille;
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