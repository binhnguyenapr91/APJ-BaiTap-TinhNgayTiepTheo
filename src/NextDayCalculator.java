public class NextDayCalculator {

    public static final int[] MONTHS_HAVE_31_DAY = new int[]{1, 3, 5, 7, 8, 10};
    public static final int[] MONTHS_HAVE_30_DAY = new int[]{4, 6, 9, 11};
    public static final int DAYS_IN_FEB_NON_LEAP_YEAR = 28;
    public static final int DAYS_IN_FEB_LEAP_YEAR = 29;
    public static final int DAY_IN_NORMAL_MONTH = 30;
    public static final int DAYS_IN_ADDITION_MONTH = 31;
    public static final int FEBRUARY = 2;
    public static final int DECEMBER = 12;
    public static final int DD_MM_YYYY = 3;
    public static final int INCREASE_UNIT = 1;

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
        for (int month : MONTHS_HAVE_31_DAY) {
            if (month == inputMonth) {
                return DAYS_IN_ADDITION_MONTH;
            }
        }
        for (int month : MONTHS_HAVE_30_DAY) {
            if (month == inputMonth) {
                return DAY_IN_NORMAL_MONTH;
            }
        }
        return DAYS_IN_FEB_NON_LEAP_YEAR;
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
        int[] result = new int[DD_MM_YYYY];
        if (day == DAYS_IN_ADDITION_MONTH && daysInMonth(month) == DAYS_IN_ADDITION_MONTH) {
            increaseMonth(year, result, INCREASE_UNIT, month + INCREASE_UNIT);
        } else if (day == DAY_IN_NORMAL_MONTH && NextDayCalculator.daysInMonth(month) == DAY_IN_NORMAL_MONTH) {
            increaseMonth(year, result, INCREASE_UNIT, month + INCREASE_UNIT);
        } else if (day == DAYS_IN_FEB_NON_LEAP_YEAR && month == FEBRUARY && checkLeapYear(year) == false) {
            increaseMonth(year, result, INCREASE_UNIT, month + INCREASE_UNIT);
        } else if (day == DAYS_IN_FEB_LEAP_YEAR && month == FEBRUARY && checkLeapYear(year) == true) {
            increaseMonth(year, result, INCREASE_UNIT, month + INCREASE_UNIT);
        } else if (day == DAYS_IN_ADDITION_MONTH && month == DECEMBER) {
            increaseYear(result, INCREASE_UNIT, INCREASE_UNIT, year + INCREASE_UNIT);
        } else {
            increaseDay(month, year, result, day + INCREASE_UNIT);
        }
        return result;
    }
}
