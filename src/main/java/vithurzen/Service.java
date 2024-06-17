package vithurzen;
import java.util.*;
import java.lang.*;

public class Service implements Statistique {
    ArrayList<Voiture> voitures;

    public Service() {
        voitures = new ArrayList<Voiture>();
    }

    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }


    public List<Voiture> getVoitures() {
        return voitures;
    }
    @Override
    public int prix() throws ArithmeticException {
        if (voitures.isEmpty()) {
            throw new ArithmeticException("La liste des voitures est vide");
        }

        if (voitures.size() >= 5) {
            for (int j = voitures.size() - 5; j < voitures.size(); j++) {
                Voiture voiture = voitures.get(j);
                int prix = voiture.getPrix();
                double remise = prix * 0.05; // Calculer la remise
                if (remise > 20000) {
                    remise = 20000;
                }
                int remiseInt = (int) remise;
                voiture.setPrix(prix - remiseInt);
            }
        }

        return voitures.get(voitures.size() - 1).getPrix();
    }

}