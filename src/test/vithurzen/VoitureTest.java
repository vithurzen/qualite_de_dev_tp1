package vithurzen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VoitureTest {

    @Test
    public static void testVoiture() {
        Voiture voiture = new Voiture("CyberTruck", 25000);

        assertEquals("marque: CyberTruck prix: 25000", voiture.toString());

    }
    public static void main(String[] args) {
        testVoiture();
    }
}
