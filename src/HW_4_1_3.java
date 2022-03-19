// https://docs.google.com/document/d/1tjK3txnDvD6rfm8CSbpQe4BUkfHSU7XpEY7uykSnN1U/edit

public class HW_4_1_3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}