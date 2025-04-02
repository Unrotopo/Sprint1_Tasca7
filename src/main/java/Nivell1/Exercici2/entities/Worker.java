package Nivell1.Exercici2.entities;

public abstract class Worker {

    private String name;
    private String surname;
    private double hourlySalary;
    protected int paidVacations = 30;

    protected Worker(String name, String surname, double hourlySalary) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty");
        }
        if (hourlySalary < 0) {
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

    /*
    @deprecated
    The company no longer offers extra paid vacations for all employees, they temporarily keep this policy
    for office workers to lure online workers into the office.
     */
    @Deprecated
    public void extraPaidVacations(int monthlyWorkHours) {
        if (monthlyWorkHours < 0) {
            throw new IllegalArgumentException("Monthly salary cannot be negative");
        }
        if (monthlyWorkHours >= 200) {
            this.paidVacations += 2;
            System.out.println("Paid vacations for " + this.getSurname() + ", " + this.getName() + ": " + this.paidVacations + " days.");
        } else {
            System.out.println("There is no extra paid vacation days for " + this.getSurname() + ", " + this.getName() + ". Paid vacations: " + this.paidVacations + " days.");
        }
    }
}

