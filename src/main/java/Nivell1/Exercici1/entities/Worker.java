package Nivell1.Exercici1.entities;

public abstract class Worker {

    String name;
    String surname;
    double hourlySalary;

    protected Worker(String name, String surname, double hourlySalary) {
        this.name = name;
        this.surname = surname;
        this.hourlySalary = hourlySalary;
    }

    public abstract double calculateSalary(int monthlyWorkHours);
}

