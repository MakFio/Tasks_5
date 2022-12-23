//Напишите функцию, которая принимает строку и возвращает строку с правильным
//регистром для заголовков символов в серии "Игра престолов".
//Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь
//первый символ в верхнем регистре, а остальные-в Нижнем.

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        correctTitle("jOn SnoW, kINg IN thE noRth.");// "Jon Snow, King in the North."
        correctTitle("sansa stark, lady of winterfell.");// "Sansa Stark, Lady of Winterfell."
        correctTitle("TYRION-LANNISTER, HAND OF THE QUEEN.");// "Tyrion-Lannister, Hand of the Queen."
    }

    static void correctTitle(String s) {
        s = s.toLowerCase();
        String[] wrds = new String[] { "and", "the", "of", "in"};
        String[] a = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            String word = a[i];
            if (word.contains("-")){
                String[] b = word.split("-");
                String b1 = b[0];
                String b2 = b[1];
                ans.append(String.valueOf(b1.charAt(0)).toUpperCase()+b1.substring(1)+"-"+String.valueOf(b2.charAt(0)).toUpperCase()+b2.substring(1, b2.length())+" ");
            } else if (Character.isLetter(word.charAt(0)) && (Arrays.asList(wrds).contains(word))==false) {
                ans.append(String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1)+" ");
            } else {
                ans.append(word+" ");
            }
        }
        System.out.println(ans);
    }
}