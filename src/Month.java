public final class Month {
    private final String name;
    private final int numbersOfDays;
    private final int numbersOfWorkingDays;

    public Month(String name, int numbersOfDays, int numbersOfWorkingDays) {
        this.name = name;
        this.numbersOfDays = numbersOfDays;
        this.numbersOfWorkingDays = numbersOfWorkingDays;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", numbersOfDays=" + numbersOfDays +
                ", numbersOfWorkingDays=" + numbersOfWorkingDays +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfDays() {
        return numbersOfDays;
    }

    public int getNumbersOfWorkingDays() {
        return numbersOfWorkingDays;
    }
}
