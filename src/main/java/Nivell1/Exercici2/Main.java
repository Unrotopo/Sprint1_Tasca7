package Nivell1.Exercici2;

import Nivell1.Exercici2.entities.*;

public class Main {
    public static void main(String[] args) {

        Worker officeWorker1 = new OfficeWorker("Lara", "Laringston", 21);
        Worker officeWorker2 = new OfficeWorker("Sofía", "Juarez", 28);
        Worker onlineWorker = new OnlineWorker("Paul", "Paulingston", 19);

        getPaidVacations(officeWorker1, 210);
        getPaidVacations(officeWorker2, 199);
        getPaidVacations(onlineWorker, 230);
    }

    @SuppressWarnings("deprecation")
    public static void getPaidVacations(Worker worker, int monthlyWorkHours) {
        worker.extraPaidVacations(monthlyWorkHours);
    }
}
