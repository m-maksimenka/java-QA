// https://docs.google.com/document/d/1xBWRqX50sA3zeD1PtfXxiVNWrcRqRQn_JokI6-UmoWY/edit

public class HW_4_2_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }
}
