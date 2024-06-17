package vithurzen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VoitureTest {

    @Test
    public void testVoiture() {
        Voiture voiture = new Voiture("CyberTruck", 25000);

        assertEquals("marque: CyberTruck prix: 25000", voiture.toString());

        voiture.setMarque("Telsa");
        assertEquals("marque: Telsa prix: 25000", voiture.toString());

    }
}
