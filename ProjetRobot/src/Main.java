import model.Grille;

void main() {
    Grille grille = new Grille();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Veuillez choisir le nombre de colonne : ");
    grille.setNb_colonne(scanner.nextInt());

    System.out.print("Veuillez choisir le nombre de ligne : ");
    grille.setNb_ligne(scanner.nextInt());
    scanner.close();

    System.out.println("Affichage de la grille : ");
    grille.afficher_grille();


}
