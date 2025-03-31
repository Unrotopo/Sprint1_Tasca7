package Nivell3.Exercici1;

import Nivell3.Exercici1.entities.Clown;
import Nivell3.Exercici1.json.JsonSerializer;

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
