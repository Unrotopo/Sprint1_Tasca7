package Nivell1.Exercici1.entities;

public class OfficeWorker extends Worker {

    static final double GASOLINE = 60.0;

    public OfficeWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int monthlyWorkHours) {
        if (monthlyWorkHours < 1){
            throw new IllegalArgumentException("Monthly salary cannot be negative");
        }
        return (getHourlySalary() * monthlyWorkHours) + GASOLINE;
    }
}
