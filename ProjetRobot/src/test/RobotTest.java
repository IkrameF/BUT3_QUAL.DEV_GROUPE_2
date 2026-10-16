package test;


import model.Case;
import model.Grille;
import model.Robot;
import model.Directions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//classe pour les test du robot (deplacements)

public class RobotTest{

    private Grille grille;
    private Case caseInitiale;
    private Robot robot;

    //beforeEach permet d'initier la case avant chaque test
    //pour chaque test la case est x:2 y:2 et meme principe pour la grille
    @BeforeEach
    public void setUp() {
        grille = new Grille(5,5);
        //position initiale (case initiale) en 2 2
        caseInitiale = new Case(2, 2);
        robot = new Robot("aspirateur", grille, caseInitiale);
    }


    @Test
    public void testSeDeplacerHaut() {
        //manque l'implementation complete de Robot pour fonctionner
        robot.seDeplacer(Directions.HAUT);

        //le teste verifie la position attendue (on s'attend a tomber sur la case 2 3
        Case positionAttendue = new Case(2, 3);
        assertEquals(positionAttendue, robot.getPosition(), "le robot doit monter d'une case");
    }


    @Test
    public void testSeDeplacerBas() {
        robot.seDeplacer(Directions.BAS);
        Case positionAttendue = new Case(2, 1);
        assertEquals(positionAttendue, robot.getPosition(), "le robot doit descendre d'une case");
    }


    @Test
    public void testSeDeplacerDroite() {
        robot.seDeplacer(Directions.DROITE);
        Case positionAttendue = new Case(3, 2);
        assertEquals(positionAttendue, robot.getPosition(), "le robot doit aller a droite d'une case");
    }

    @Test
    public void testSeDeplacerGauche() {
        robot.seDeplacer(Directions.GAUCHE);
        Case positionAttendue = new Case(1, 2);
        assertEquals(positionAttendue, robot.getPosition(), "le robot doit aller a gauche d'une case");
    }




    //dans la classe grille il faut une methode pour check les limites de la grille
    @Test
    public void testEnDehorsGrille() {
    Grille grilleTestLimite = new Grille(3, 3);

    Case caseLimite = new Case(0, 1);
    Robot robotTestLimite = new Robot("transformers", grilleTestLimite, caseLimite);

    robotTestLimite.seDeplacer(Directions.HAUT);

    //test: le robot ne doit pas bouger
    assertEquals(caseLimite, robotTestLimite.getPosition(), "le robot ne peut pas sortir de la grille");
}


}
