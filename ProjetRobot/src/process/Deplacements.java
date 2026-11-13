package process;

import model.Robot;


//dans process il va y avoir toutes les strategies de deplacements/ actions du robot
// process contient les comportements qu'un robot peux avoir

//Strategy se base sur une interface qui permet de gerer efficacement le comportement
public interface Deplacements {
    void deplacer(Robot robot);
}



//on retire la logique des deplacements de la classe Robot pour la mettre dans une classe dédiée a ca
//pour eviter les conditions (pour tous les cas possible de deplacement)
//dans process on va pouvoir avoir de fichiers qui correspondent chacun a la maniere dont le robot se comporte precisemment
//(deplacement manuelle, aleatoirement, contrainte de deplacements etc)

//on aura donc par exemple l'interface Deplacements
//et des classes filles pour tout type de deplacement (une manuelle, une aleatoire, une avec contraintes...)

