package Nivell1.Exercici2.entities;

public class OfficeWorker extends Worker {

    static double gasoline = 60.0;

    public OfficeWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int monthlyWorkHours) {
        return (getHourlySalary() * monthlyWorkHours) + gasoline;
    }
}
