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

    @Override
    public void extraPaidVacations(int monthlyWorkHours) {
        if (monthlyWorkHours >= 200) {
            this.paidVacations += 2;
            System.out.println("Paid vacations for " + this.getSurname() + ", " + this.getName() + ": " + this.paidVacations + " days.");
        } else {
            System.out.println("There is no extra paid vacation days for " + this.getSurname() + ", " + this.getName() + ". Paid vacations: " + this.paidVacations + " days.");
        }
    }
}
