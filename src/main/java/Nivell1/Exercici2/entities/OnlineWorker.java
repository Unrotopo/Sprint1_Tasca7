package Nivell1.Exercici2.entities;

public class OnlineWorker extends Worker {

    static final double INTERNET_CONNECTION_PRICE = 34.90;

    public OnlineWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int monthlyWorkHours) {
        return (monthlyWorkHours * hourlySalary) + INTERNET_CONNECTION_PRICE;
    }

    @Override
    public void extraPaidVacations(int monthlyWorkHours) {
        System.out.println(this.surname + ", " + this.name + " get no extra paid vacations. Paid vacations: " + this.paidVacations);
    }
}
