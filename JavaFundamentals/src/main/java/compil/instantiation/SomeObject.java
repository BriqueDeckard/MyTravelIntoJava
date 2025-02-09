package compil.instantiation;

public class SomeObject {
    String valeur;

    public SomeObject(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "valeur='" + valeur + '\'' +
                '}';
    }
}
