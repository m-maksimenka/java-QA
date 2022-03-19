// https://docs.google.com/document/d/1tjK3txnDvD6rfm8CSbpQe4BUkfHSU7XpEY7uykSnN1U/edit

public class HW_4_1_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avgValue = 1.0 * sum / array.length;
        System.out.println(avgValue);
    }
}
