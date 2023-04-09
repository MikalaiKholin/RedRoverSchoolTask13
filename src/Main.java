import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Director("Mike", 60, 20).getSalary());
        System.out.println(new Manager("Ihar", 60, 20).getSalary());
        System.out.println(new Manager("Anna", 60, 0).getSalary());
        System.out.println(new Worker("Andrey", 60).getSalary());

        Month[][] quater = MonthUtils.getQuarter();

        for (Month [] m : quater) {
            System.out.println(Arrays.toString(m));
        }

        Month[][] halfYear = MonthUtils.getHalfYear();

        for (Month [] m : halfYear) {
            System.out.println(Arrays.toString(m));
        }

        System.out.println(Arrays.toString(MonthUtils.getYear()));
    }
}