public final class Manager2 extends BaseEmployee{
    private int numberOfSubordinates;

    public Manager2(String name, int age, Gender gender, double baseSalary, int numberOfSubordinates) {
        super(name, age, gender, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month m : monthArray) {
            salary += m.getNumbersOfWorkingDays() * getBaseSalary();
        }
        return salary + salary * 0.01 * getNumberOfSubordinates();
    }
}
