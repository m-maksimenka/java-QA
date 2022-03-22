// https://docs.google.com/document/d/1xBWRqX50sA3zeD1PtfXxiVNWrcRqRQn_JokI6-UmoWY/edit

public class HW_4_2_4 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
