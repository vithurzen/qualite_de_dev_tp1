package java.vithurzen;

public class Voiture {

    public String marque;
    public int prix;

    public Voiture(String marque, int prix) {
        this.marque = marque;
        this.prix = prix;
    }
    public String getMarque() {
        return this.marque;
    }
    public void setMarque(String newMarque) {
        marque = newMarque;
    }
    public int getPrix() {
        return this.prix;
    }
    public void setPrix(int newPrix) {
        prix = newPrix;
    }

    public String toString()
    {
        return "marque: " + getMarque() + " prix: " + getPrix();
    }

}
