public class Voiture extends Vehicule{

    public Voiture(){
        super();
    }

    public Voiture(String immatriculation, int puissance, double consommation){
        super(immatriculation, puissance, consommation);
    }

    @Override
    public double calculerCout(){
        return (double) 20 + 2*this.puissance;
    }

    @Override
    public String toString(){
        return "Voiture:\n" + super.toString();
    }
}
