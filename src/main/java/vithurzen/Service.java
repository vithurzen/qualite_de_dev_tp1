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
            for (int i = tailleVoiture; i > tailleVoiture - 5; i--) {
                int prixReduction = voitures.get(i).getPrix();
                int reduction = prixReduction - prixReduction * 5/100;
                voitures.get(i).setPrix(reduction);
                int newPrix = voitures.get(i).getPrix();
                System.out.println(newPrix);

            }
        }
        return 0;
    }
}

