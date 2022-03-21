// https://docs.google.com/document/d/1xBWRqX50sA3zeD1PtfXxiVNWrcRqRQn_JokI6-UmoWY/edit

import java.util.Locale;

public class HW_4_2_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        int index = s.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s.indexOf("рит", index + 1);
        }
    }
}