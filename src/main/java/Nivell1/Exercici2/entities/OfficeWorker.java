package Nivell1.Exercici2.entities;

public class OfficeWorker extends Worker {

    static double gasoline = 60.0;

    public OfficeWorker(String name, String surname, double hourlySalary) {
        super(name, surname, hourlySalary);
    }

    @Override
    public double calculateSalary(int monthlyWorkHours) {
        return (hourlySalary * monthlyWorkHours) + gasoline;
    }

    @Override
    public void extraPaidVacations(int monthlyWorkHours) {
        if (monthlyWorkHours >= 200) {
            paidVacations += 2;
            System.out.println("Paid vacations for " + this.surname + ", " + this.name + ": " + paidVacations);
        } else {
            System.out.println("There is no extra paid vacation days for " + this.surname + ", " + this.name + ". Paid vacations: " + this.paidVacations);
        }
    }
}
