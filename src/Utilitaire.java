public abstract class Utilitaire extends Vehicule{

    protected double hauteur;

    public Utilitaire(String immatriculation, int puissance, double consommation, double hauteur) {
        super(immatriculation, puissance, consommation);
        this.hauteur = hauteur;
    }

    public Utilitaire() {
        super();
        this.hauteur = 0;
    }

    @Override
    public abstract double calculerCout();

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public String toString(){
        return super.toString() + "\nHauteur: " + this.hauteur;
    }
}
