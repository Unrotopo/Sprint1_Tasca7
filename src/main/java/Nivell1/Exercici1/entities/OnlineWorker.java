package Nivell1.Exercici1.entities;

public class OnlineWorker extends Worker {

    static final double INTERNET_CONNECTION_PRICE = 34.90;

    public OnlineWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int monthlyWorkHours) {
        if (monthlyWorkHours < 1){
            throw new IllegalArgumentException("Monthly salary cannot be negative");
        }
        return (monthlyWorkHours * getHourlySalary()) + INTERNET_CONNECTION_PRICE;
    }
}
