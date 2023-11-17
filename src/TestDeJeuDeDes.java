import java.util.Arrays;
import java.util.Scanner;

public class TestDeJeuDeDes {

    public void TestDuJeu() {

        System.out.println("Entrez le nombre de joueur :");
        Scanner sc1 = new Scanner(System.in);
        int nbr2 = Integer.parseInt(sc1.next());
        int max = 0;
        Joueur vainc = new Joueur();
        Joueur[] joueurs = new Joueur[nbr2];
        for (int i = 0; i <= (nbr2-1); i++) {
            System.out.println("Entrez le nom du joueur " + (i + 1) + " : ");
            String nom = sc1.next();
            System.out.println("Entrez le prénom du joueur " + (i + 1) + " : ");
            String prenom = sc1.next();
            System.out.println("Entrez le nombre de dés qu'il utilise : ");
            int nbrDe = Integer.parseInt(sc1.next());
            System.out.println("Entrez le nombre de faces du dé : ");
            int nbrFace = Integer.parseInt(sc1.next());
            Joueur j = new Joueur(nom, prenom, nbrDe, nbrFace);
            joueurs[i] = j;
        }
        for (int i = 0; i <= (joueurs.length-1) ; i++) {
            System.out.println("Le joueur " + (i + 1) + " lance le dé. ");
            joueurs[i].lancer();
            joueurs[i].setScore(joueurs[i].score());
            System.out.println("Son score est : " + joueurs[i].score());
        }

        for (int i = 0; i< (joueurs.length-1); i++){
            if(joueurs[i].getScore()> max) {
                max = joueurs[i].getScore();
                vainc = joueurs[i];
            }
        }

        System.out.println("Le vaincqueur est "+vainc.getPrenom());
    }
}
