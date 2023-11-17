public class DeAJouer {

    private int valeur;
    private int nbrFace;
    private int nbrDe;

    public DeAJouer(int valeur, int nbrFace) {
        this.valeur = 1;
        this.nbrFace = 6;
        this.nbrDe =+nbrDe;
    }

    public DeAJouer(int valeur, int nbrFace, int nbrDe) {
        this.valeur = valeur;
        this.nbrFace = nbrFace;
        this.nbrDe = nbrDe;
    }

    public int lancerLeDe() {
        int nbr = (int) (Math.random() * 6+1);
        return nbr;
    }
    public void afficherValeur(){
        System.out.println("La valeur du dé est : "+valeur);
    }

    public int getNbrDe() {
        return nbrDe;
    }

    public void setNbrDe(int nbrDe) {
        this.nbrDe = nbrDe;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getNbrFace() {
        return nbrFace;
    }

    public void setNbrFace(int nbrFace) {
        this.nbrFace = nbrFace;
    }
    public void setNbrFaceParDefault(int nbrFace) {
        this.nbrFace = 6;
    }
}
