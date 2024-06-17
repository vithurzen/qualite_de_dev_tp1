package vithurzen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    Service s1;

    @BeforeEach
    void setUp() {
        s1 = new Service();
    }

    @Test
    public void testAjouter() {
        Voiture voiture = new Voiture("Renault",10000);
        s1.ajouter(voiture);
        Assertions.assertEquals(1, s1.voitures.size());
    }
    @Test
    public void testPrix() {
        Service s1 = new Service();
        s1.ajouter(new Voiture("Renault", 10000));
        s1.ajouter(new Voiture("Peugeot", 15000));
        s1.ajouter(new Voiture("Lamborghini", 20000));
        s1.ajouter(new Voiture("BMW", 25000));
        s1.ajouter(new Voiture("Mercedes", 5000000));

        int dernierPrix = s1.prix();
        // Vérifier que le prix de la Mercedes après remise est correct
        int expectedPriceMercedes = 5000000 - 20000;
        Assertions.assertEquals(expectedPriceMercedes, s1.getVoitures().get(4).getPrix(), "Le prix de la Mercedes après remise doit être de 4980000");
        // Vérifier le dernier prix (celui de la Mercedes)
        Assertions.assertEquals(expectedPriceMercedes, dernierPrix, "Le prix de la dernière voiture doit être de 4980000");
    }
    @Test
    public void testPrixIfNul() {
        Service s1 = new Service();
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, s1::prix, "La liste des voitures est vide");
        Assertions.assertEquals("La liste des voitures est vide", thrown.getMessage());
    }

    @Test
    public void testPrixIfInferieurA5() {
        Service s1 = new Service();
        s1.ajouter(new Voiture("Renault", 10000));
        int dernierPrix = s1.prix();
        Assertions.assertEquals(10000, dernierPrix, "Le prix de la voiture doit rester inchangé à 10000");
    }

}
