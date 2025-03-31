package Nivell2.Exercici1;

import Nivell2.Exercici1.entities.Clown;
import Nivell2.Exercici1.json.JsonSerializer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            Clown clown = new Clown("Triston", "Payaso Vagabundo");
            JsonSerializer.serialize(clown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
