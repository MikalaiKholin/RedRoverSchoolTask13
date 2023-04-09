public final class Director extends Worker {

    private int numberOfSubordinates;

    private final double ratio = 1 / 100d * 9;

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(){
        if (getNumberOfSubordinates() == 0) return super.getSalary();
        return ratio * getNumberOfSubordinates() * super.getSalary();
    }


}
