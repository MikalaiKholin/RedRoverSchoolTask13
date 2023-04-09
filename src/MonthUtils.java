public class MonthUtils {

    public static class MonthNested {
        private final String name;
        private final int numbersOfDays;
        private final int numbersOfWorkingDays;

        private MonthNested(String name, int numbersOfDays, int numbersOfWorkingDays) {
            this.name = name;
            this.numbersOfDays = numbersOfDays;
            this.numbersOfWorkingDays = numbersOfWorkingDays;
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
    public final static Month [] months = {new Month("January", 31, 24),
            new Month("February", 28, 24),
            new Month("March", 31,25),
            new Month("April", 30,23),
            new Month("May", 31, 24),
            new Month("June", 30, 25),
            new Month("July", 31, 25),
            new Month("August", 31,23),
            new Month("September", 30,25),
            new Month("October", 31,23),
            new Month("November", 30,24),
            new Month("December", 31,25)};

    public static Month[][] getQuarter() {
        Month [][] quater = new Month[4][3];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++) quater[i][j] = months[i + j];
        }
        return quater;
    }

    public static Month[][] getHalfYear() {
        Month [][] halfYear = new Month[2][6];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++) halfYear[i][j] = months[i + j];
        }
        return halfYear;
    }

    public static Month[] getYear(){
        return months;
    }
}
