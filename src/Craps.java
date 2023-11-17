public class Craps {

    public void JeuDeCraps(){
        Joueur j1 = new Joueur("Duval", "Pierre", 2, 6);
        j1.lancer();
        int score = j1.score();
        System.out.println("Le premier score du joueur est : " + score);
        int total = 0;
        if(score == 7 || score == 11){
            System.out.println("Le joueur à gagné");
        } else if (score ==2 || score == 3 || score == 12) {
            System.out.println("Le joueur a perdu");
        }else{
            total = score;
            j1.lancer();
            score=j1.score();
            System.out.println("Le score du joueur est : " + score);
            while(score != 7 || total != score ){
                j1.lancer();
                score=j1.score();
                System.out.println("Le score du joueur est : " + score);
                total = score;
            }
            if(score==7){
                System.out.println("Le joueur a perdu");
            } else if (score==total) {
                System.out.println("Le joueur a gagné");

            }
        }

    }

}
