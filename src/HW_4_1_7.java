// https://docs.google.com/document/d/1tjK3txnDvD6rfm8CSbpQe4BUkfHSU7XpEY7uykSnN1U/edit

public class HW_4_1_7 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + array[i].length;
        }
        System.out.println(count);
    }
}
