package Nivell1.Exercici2.entities;

public abstract class Worker {

    String name;
    String surname;
    double hourlySalary;
    int paidVacations = 30;

    protected Worker(String name, String surname, double hourlySalary) {
        this.name = name;
        this.surname = surname;
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
        if (monthlyWorkHours >= 200) {
            paidVacations += 2;
        }
    }
}

