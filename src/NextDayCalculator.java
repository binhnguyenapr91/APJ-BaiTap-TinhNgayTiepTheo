public class NextDayCalculator {

    public static final int[] MONTHS_HAVE_31_DAY = new int[]{1, 3, 5, 7, 8, 10};
    public static final int[] MONTHS_HAVE_30_DAY = new int[]{4, 6, 9, 11};

    public static boolean checkLeapYear(int year) {
        boolean devideBy4 = year % 4 == 0;
        if (devideBy4) {
            boolean devideBy100 = year % 100 == 0;
            if (devideBy100) {
                boolean devideBy400 = year % 400 == 0;
                if (devideBy400) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int daysInMonth(int inputMonth) {
        for (int m : MONTHS_HAVE_31_DAY) {
            if (m == inputMonth) {
                return 31;
            }
        }
        for (int m : MONTHS_HAVE_30_DAY) {
            if (m == inputMonth) {
                return 30;
            }
        }
        return 1;
    }
    private static void increaseDay(int month, int year, int[] result, int i) {
        result[0] = i;
        result[1] = month;
        result[2] = year;
    }

    private static void increaseYear(int[] result, int i, int i2, int i3) {
        result[0] = i;
        result[1] = i2;
        result[2] = i3;
    }

    private static void increaseMonth(int year, int[] result, int i, int i2) {
        result[0] = i;
        result[1] = i2;
        result[2] = year;
    }

    public static int[] showNextDay(int day, int month, int year) {
        int[] result = new int[3];
        if (day == 31 && daysInMonth(month) == 31) {
            increaseMonth(year, result, 1, month + 1);
        } else if (day == 30 && NextDayCalculator.daysInMonth(month) == 30) {
            increaseMonth(year, result, 1, month + 1);
        } else if (day == 28 && month == 2 && checkLeapYear(year) == false) {
            increaseMonth(year, result, 1, month + 1);
        } else if (day == 29 && month == 2 && checkLeapYear(year) == true) {
            increaseMonth(year, result, 1, month + 1);
        } else if (day == 31 && month == 12) {
            increaseYear(result, 1, 1, year + 1);
        } else {
            increaseDay(month, year, result, day + 1);
        }

        return result;
    }
}
