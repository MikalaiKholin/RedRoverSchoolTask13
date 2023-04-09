public abstract class BaseEmployee {
    private String name;
    private int age;
    private Gender gender;
    private double baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BaseEmployee(String name, int age, Gender gender, double baseSalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary(Month[] monthArray);
}
