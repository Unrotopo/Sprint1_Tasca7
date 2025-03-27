package Nivell1.Exercici1;

import Nivell1.Exercici1.entities.OfficeWorker;
import Nivell1.Exercici1.entities.OnlineWorker;

public class Main {
    public static void main(String[] args) {

        OfficeWorker worker1 = new OfficeWorker("Johny", "Mnemonic", 19);
        OnlineWorker worker2 = new OnlineWorker("Jane", "Doe", 19);

        System.out.println(worker1.calculateSalary(190));
        System.out.println(worker2.calculateSalary(190));
    }
}
