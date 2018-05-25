public class Test_2 {

    public static void main(String[] args){
        Vehicule[] tab = new Vehicule[5];
        tab[0] = new Voiture("abc 1", 100, 4.8);
        tab[1] = new Fourgonnette("abc 2", 70, 7.0, 1.80);
        tab[2] = new Camion("abc 3", 150, 10.5, 2.8, 1500);
        tab[3] = new Camion("abc 4", 150, 10.5, 2.8, 2200);
        tab[4] = new Camion("abc 5", 150, 10.5, 2.8, 3000);

        for(Vehicule v : tab){
            System.out.println("Immatriculation : " + v.getImmatriculation() + " Cout : " + v.calculerCout());
        }
    }
}
