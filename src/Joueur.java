import java.util.ArrayList;

public class Joueur {
    private String nom;
    private String prenom;
    private DeAJouer[] Des;
    private ArrayList<Integer> arr;
    private int score;

    public Joueur(String nom, String prenom, int nbrDes, int nbrFaces) {
        this.nom = nom;
        this.prenom = prenom;
        Des = new DeAJouer[nbrDes];
        for(int i = 0; i <= (nbrDes-1); i++){
          Des[i]= new DeAJouer(1, nbrFaces);
        }
        this.score=0;
        this.arr=new ArrayList<>();
    }

    public Joueur() {
    }

    public ArrayList lancer(){
        arr=new ArrayList<>();
        for (DeAJouer de : Des) {
            int nbr = de.lancerLeDe();
            arr.add(nbr);
        }
        return arr;
    }

    public int score(){
        int somme=0;
        for (int i = 0; i<arr.size(); i++) {
            somme=somme + arr.get(i);
        }
        return somme;
    }

    public int max(){
        int max = 0;
        for (int i = 0; i< Des.length; i++){
                if(Des[i].getValeur()> Des[i+1].getValeur()) max = Des[i].getValeur();
        }
        return max;
    }
    public int min(){
        int min = 0;
        for (int i = 0; i< Des.length; i++){
                if(Des[i].getValeur()> Des[i+1].getValeur()) min = Des[i].getValeur();
        }
        return min;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public DeAJouer[] getDes() {
        return Des;
    }

    public void setDes(DeAJouer[] des) {
        this.Des = des;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }
}
