import java.util.HashSet;

public class Client {

    private String prenom;
    private String nom;
    private HashSet<Vehicule> vehiculesLoues;

    public Client(){
        this.nom = "";
        this.prenom = "";
        this.vehiculesLoues = new HashSet<Vehicule>();
    }

    public Client(String prenom, String nom){
        this.nom = nom;
        this.prenom = prenom;
        this.vehiculesLoues = new HashSet<Vehicule>();
    }

    public void ajouterLocation(Vehicule v){
        this.vehiculesLoues.add(v);
    }

    public void supprimerLocation(Vehicule v){
        this.vehiculesLoues.remove(v);
    }

    public String getClef(){
        return this.prenom + this.nom;
    }

    @Override
    public String toString(){
        return this.prenom + " " + this.nom + "\nVehicules loués: " + this.vehiculesLoues.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!prenom.equals(client.prenom)) return false;
        return nom.equals(client.nom);
    }

    @Override
    public int hashCode() {
        int result = prenom.hashCode();
        result = 31 * result + nom.hashCode();
        return result;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVehiculesLoues(HashSet vehiculesLoues) {
        this.vehiculesLoues = vehiculesLoues;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public HashSet getVehiculesLoues() {
        return vehiculesLoues;
    }
}
