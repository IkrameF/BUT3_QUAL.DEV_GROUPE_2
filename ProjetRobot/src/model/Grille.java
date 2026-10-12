package model;

public class Grille {
    protected int nb_colonne;
    protected int nb_ligne;

    public Grille(){
        this.nb_colonne = 0;
        this.nb_ligne = 0;
    }
    public Grille(int nb_colonne, int nb_ligne) {
        this.nb_colonne = nb_colonne;
        this.nb_ligne = nb_ligne;
    }


    public int getNb_colonne() {
        return nb_colonne;
    }

    public void setNb_colonne(int nb_colonne) {
        this.nb_colonne = nb_colonne;
    }

    public int getNb_ligne() {
        return nb_ligne;
    }

    public void setNb_ligne(int nb_ligne) {
        this.nb_ligne = nb_ligne;
    }

    public void afficher_grille(){
        // Création de la ligne qui séparera chaque ligne
        String ligne_separatrice = "+";
        for(int k = 1; k <= this.nb_colonne+1; k++){
            ligne_separatrice += "---+";
        }

        // Ligne avec les indices
        System.out.print(ligne_separatrice);
        System.out.println();
        System.out.print("|   | ");
        for(int i = 1; i <= this.nb_colonne; i++){
            System.out.print("\u001B[32m"+ i + "\u001B[0m | "); // Avec la couleur verte pour les indices
        }
        System.out.println();
        System.out.print(ligne_separatrice);

        System.out.println();
        for(int i = 1; i <= this.nb_ligne; i++){
            // Colonne avec les indices
            System.out.print("| \u001B[32m" + i + "\u001B[0m | ");
            // Remplissage de la grille avec des points
            for(int j = 1; j <= this.nb_colonne; j++){
                System.out.print("." + " | ");
            }
            System.out.println();
            System.out.print(ligne_separatrice);
            System.out.println();
       }
    }



}
