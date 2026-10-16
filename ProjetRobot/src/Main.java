import model.Case;
import model.Grille;
import model.Robot;

void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Veuillez choisir le nombre de colonne : ");
    int nbColonne = scanner.nextInt();

    System.out.print("Veuillez choisir le nombre de ligne : ");
    int nbLigne = scanner.nextInt();
    scanner.close();

    Grille grille = new Grille(nbColonne, nbLigne);

    Robot robot = new Robot("robot", grille, new Case(1,1));

    System.out.println("Affichage de la grille : ");
    grille.afficherGrille(robot);


}
