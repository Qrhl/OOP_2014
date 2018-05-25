import static java.lang.Math.floor;

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

    @Override
    public double calculerCout(){
        double cout_poids = 0;
        double surplus;
        if((surplus = this.poids - 2000) > 0){
            cout_poids = 2 * floor(surplus/200);
        }
        return (double) 30 + 2*this.puissance + cout_poids;
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
