public class Test {

    public static void main(String[] args){
        Vehicule[] tab = new Vehicule[5];
        tab[0] = new Voiture("abc 1", 100, 4.8);
        tab[1] = new Fourgonnette("abc 2", 70, 7.0, 1.80);
        tab[2] = new Camion("abc 3", 150, 10.5, 2.8, 1500);
        tab[3] = new Voiture("abc 2", 100, 4.8);
        tab[4] = new Voiture("abc 1", 80, 6.2);

        // Caractéristiques des vehicules
        for(Vehicule v : tab){
            System.out.println(v);
            System.out.println();
        }

        // Test equals
        // Must return False
        System.out.println(tab[0] == tab[3]);

        //Must return True
        System.out.println(tab[0] == tab[4]);

    }
}
