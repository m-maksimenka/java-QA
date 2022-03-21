// https://docs.google.com/document/d/1xBWRqX50sA3zeD1PtfXxiVNWrcRqRQn_JokI6-UmoWY/edit

public class HW_4_2_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
    }
}
