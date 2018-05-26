import java.util.HashMap;
import java.util.HashSet;

public class Loueur {

    private HashSet<Vehicule> vLibres;
    private HashMap<String, Client> clients;
    private HashMap<Vehicule, String> locations;

    public Loueur(){
        this.vLibres = new HashSet<Vehicule>();
        this.clients = new HashMap<String, Client>();
        this.locations = new HashMap<Vehicule, String>();
    }

    @Override
    public String toString(){
        String vlib = "Vehicules libres: " + this.vLibres.toString() + "\n";
        String loc = "Clients: " + this.clients.toString();
        return vlib + loc;
    }
}
