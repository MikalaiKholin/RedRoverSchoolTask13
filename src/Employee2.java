
public final class Employee2 extends BaseEmployee{
    public Employee2(String name, int age, Gender gender, double baseSalary) {
        super(name, age, gender, baseSalary);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month m : monthArray) {
            salary += m.getNumbersOfWorkingDays() * getBaseSalary();
        }
        return salary;
    }
}
