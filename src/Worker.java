public class Worker extends Employee{

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }
}
