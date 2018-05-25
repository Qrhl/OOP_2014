public class Camion extends Utilitaire{

    private double poids;

    public Camion(String immatriculation, int puissance, double consommation, double hauteur, double poids) {
        super(immatriculation, puissance, consommation, hauteur);
        this.poids = poids;
    }

    public Camion() {
        super();
        this.poids = 0;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Camion:\n" + super.toString() + "\nPoids: " + this.poids;
    }
}
