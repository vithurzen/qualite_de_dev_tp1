package vithurzen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import vithurzen.Service;
import vithurzen.Voiture;

public class ServiceTest {
    public static void testService() {

        Service service = new Service();
        Voiture voiture1;
        voiture1 = new Voiture("polo", 25000);
        service.ajouter(voiture1);
        Voiture voiture2;
        voiture2 = new Voiture("golf", 35000);
        service.ajouter(voiture2);
        Voiture voiture3;
        voiture3 = new Voiture("passat", 45000);
        service.ajouter(voiture3);
        Voiture voiture4;
        voiture4 = new Voiture("polo2", 55000);
        service.ajouter(voiture4);
        Voiture voiture5;
        voiture5 = new Voiture("golf2", 650000);
        service.ajouter(voiture5);
        service.prix();

    };


    public static void main(String[] args){

        testService();

    }

}
