public class Voiture extends Vehicule{

    public Voiture(){
        super();
    }

    public Voiture(String immatriculation, int puissance, double consommation){
        super(immatriculation, puissance, consommation);
    }

    @Override
    public String toString(){
        return "Voiture:\n" + super.toString();
    }
}
