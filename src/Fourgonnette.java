public class Fourgonnette extends Utilitaire{

    public Fourgonnette(String immatriculation, int puissance, double consommation, double hauteur) {
        super(immatriculation, puissance, consommation, hauteur);
    }

    public Fourgonnette() {
        super();
    }

    @Override
    public String toString(){
        return "Fourgonnette:\n" + super.toString();
    }
}
