package model;

import java.util.ArrayList;
import java.util.List;

public class Grille {
    private int nbColonne;
    private int nbLigne;
    private List<Case> cases;

    public Grille(int nbColonne, int nbLigne) {
        this.nbColonne = nbColonne;
        this.nbLigne = nbLigne;
        initGrille();
    }


    public int getNbColonne() {
        return nbColonne;
    }

    public void setNbColonne(int nb_colonne) {
        this.nbColonne = nb_colonne;
    }

    public int getNbLigne() {
        return nbLigne;
    }

    public void setNbLigne(int nb_ligne) {
        this.nbLigne = nb_ligne;
    }

    private void initGrille(){
        // Créé la liste vide
        this.cases = new ArrayList<>();
        for(int i = 0; i <= this.nbLigne; i++){
            for(int j = 0; j <= this.nbColonne; j++){
                // Rempli la liste avec les cases qui composent la grille
                Case caseij = new Case(i,j);
                this.cases.add(caseij);
            }
        }
    }

    public void afficherGrille(Robot robot){
        // Création de la ligne qui séparera chaque ligne
        String ligne_separatrice = "+";
        for(int k = 1; k <= this.nbColonne+1; k++){
            ligne_separatrice += "---+";
        }

        // Ligne avec les indices
        System.out.print(ligne_separatrice);
        System.out.println();
        System.out.print("|   | ");
        for(int i = 1; i <= this.nbColonne; i++){
            System.out.print("\u001B[32m"+ i + "\u001B[0m | "); // Avec la couleur verte pour les indices
        }
        System.out.println();
        System.out.print(ligne_separatrice);

        System.out.println();
        for(int i = 1; i <= this.nbLigne; i++){
            // Colonne avec les indices
            System.out.print("| \u001B[32m" + i + "\u001B[0m | ");
            // Remplissage de la grille avec des points
            for(int j = 1; j <= this.nbColonne; j++){
                Case p = robot.getPosition();
            if (p.getX() == i && p.getY() == j) {
                System.out.print("R | ");
            } else {
                System.out.print(". | ");
            }
            }
            System.out.println();
            System.out.print(ligne_separatrice);
            System.out.println();
       }
    }



}
