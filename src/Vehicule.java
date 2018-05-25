public abstract class Vehicule {

    protected String immatriculation;
    protected int puissance;
    protected double consommation;

    public Vehicule(String immatriculation, int puissance, double consommation) {
        this.immatriculation = immatriculation;
        this.puissance = puissance;
        this.consommation = consommation;
    }

    public Vehicule(){
        this.immatriculation = "";
        this.puissance = 0;
        this.consommation = 0;
    }

    public abstract double calculerCout();

    public void setImmatriculation(String immatriculation){
        this.immatriculation = immatriculation;
    }

    public void setPuissance(int puissance){
        this.puissance = puissance;
    }

    public void setConsommation(double consommation){
        this.consommation = consommation;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public int getPuissance() {
        return puissance;
    }

    public double getConsommation() {
        return consommation;
    }

    @Override
    public String toString() {
        return "Immatriculation: " + this.immatriculation + "\nPuissance: " + this.puissance + "\nConsommation: " + this.consommation;
    }

    @Override
    public int hashCode() {
        return this.immatriculation.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicule vehicule = (Vehicule) o;

        return immatriculation.equals(vehicule.immatriculation);
    }
}
