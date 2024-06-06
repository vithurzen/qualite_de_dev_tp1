package vithurzen;
import java.util.ArrayList;

public class Service implements Statistique {
    public ArrayList<Voiture> voitures = new ArrayList<Voiture>();

    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    public int prix() throws ArithmeticException {

        if (voitures.size() % 5 == 0) {
            int tailleVoiture = voitures.size() - 1;
            for (int i = tailleVoiture; i > tailleVoiture - 4; i--) {
                int reduction = voitures.get(i).getPrix()-(5/100);
                int prixReduction = voitures.get(i).getPrix();

            }
        }
        return 0;
    }
}

