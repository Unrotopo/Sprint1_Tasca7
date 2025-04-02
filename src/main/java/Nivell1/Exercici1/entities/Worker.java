package Nivell1.Exercici1.entities;

public abstract class Worker {

    private String name;
    private String surname;
    private double hourlySalary;

    protected Worker(String name, String surname, double hourlySalary) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (surname == null || surname.trim().isEmpty()){
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        if (hourlySalary <= 0){
            throw new IllegalArgumentException("Hourly salary cannot be negative");
        }
        this.name = name;
        this.surname = surname;
        this.hourlySalary = hourlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public abstract double calculateSalary(int monthlyWorkHours);

    @Override
    public String toString() {
        return "Worker [name=" + name + ", surname=" + surname + ", hourlySalary=" + hourlySalary + "]";
    }
}

