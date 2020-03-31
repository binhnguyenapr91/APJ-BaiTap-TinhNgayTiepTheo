import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Next day of 1.1.2018")
    void showNext112018() {
        int[] input = new int[3];
        input[0] = 1;
        input[1] = 1;
        input[2] = 2018;

        int[] expected = new int[3];
        expected[0] = 2;
        expected[1] = 1;
        expected[2] = 2018;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }

    @Test
    @DisplayName("Next day of 31.1.2018")
    void showNext3112018() {
        int[] input = new int[3];
        input[0] = 31;
        input[1] = 1;
        input[2] = 2018;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 2018;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }

    @Test
    @DisplayName("Next day of 30.4.2018")

    void showNext3042018() {
        int[] input = new int[3];
        input[0] = 30;
        input[1] = 4;
        input[2] = 2018;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 5;
        expected[2] = 2018;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }
    @Test
    @DisplayName("Next day of 28.2.2018")
    void showNext2822018() {
        int[] input = new int[3];
        input[0] = 28;
        input[1] = 2;
        input[2] = 2018;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 3;
        expected[2] = 2018;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }

    @Test
    @DisplayName("Next day of 29.2.2020")
    void showNext292020() {
        int[] input = new int[3];
        input[0] = 29;
        input[1] = 2;
        input[2] = 2020;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 3;
        expected[2] = 2020;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }
    @Test
    @DisplayName("Next day of 29.2.2016")
    void showNext2922016() {
        int[] input = new int[3];
        input[0] = 29;
        input[1] = 2;
        input[2] = 2016;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 3;
        expected[2] = 2016;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }
    @Test
    @DisplayName("Next day of 31.12.2018")
    void showNext31122018() {
        int[] input = new int[3];
        input[0] = 31;
        input[1] = 12;
        input[2] = 2018;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 1;
        expected[2] = 2019;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }

    @Test
    @DisplayName("Next day of 31.3.2018")
    void showNext3132018() {
        int[] input = new int[3];
        input[0] = 31;
        input[1] = 3;
        input[2] = 2018;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 4;
        expected[2] = 2018;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }

    @Test
    @DisplayName("Next day of 30.6.2018")
    void showNext3062020() {
        int[] input = new int[3];
        input[0] = 30;
        input[1] = 6;
        input[2] = 2020;

        int[] expected = new int[3];
        expected[0] = 1;
        expected[1] = 7;
        expected[2] = 2020;

        int[] realDay = NextDayCalculator.showNextDay(input[0],input[1],input[2]);
        assertArrayEquals(expected,realDay);
    }
}