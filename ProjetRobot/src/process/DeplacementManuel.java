package process;

import model.Robot;
import model.Directions;
import java.util.Scanner;

public class DeplacementManuel implements Deplacements {

    //au lieu de gerer les deplacements dans la classe robot on gere avec strategy
    @Override
    public void deplacer(Robot robot) {

        //on demande les valeurs pour le deplacement à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez une direction pour " + robot.getNom() + " (HAUT, BAS, GAUCHE, DROITE) : ");
        //on recupere ce que l'utilisateur a donné comme direction (on recup le resultat avec .nextLine() et on met touppercase)
        String saisie = scanner.nextLine().toUpperCase();

        try {
            //on recupere la valeur donnée par l'utilisateur et on l'attribu a direction (correspondance entre l'enum et la saisie)
            Directions direction = Directions.valueOf(saisie);

            //on appelle la methode seDeplacer de la classe robot
            robot.seDeplacer(direction);

            System.out.println(robot.getNom() + " s'est déplacé vers " + direction);
        } catch (IllegalArgumentException e) {
            System.out.println("Direction invalide");
        }
    }
}