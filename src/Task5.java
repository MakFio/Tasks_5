//Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в
//любом порядке и / или количестве), что и первое слово, включая первое слово.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        sameVowelGroup(new String[]{"toe", "ocelot", "maniac"});// ["toe", "ocelot"]
        sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot", "animal"});// ["many"]
        sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"});// ["hoops", "bot", "bottom"]
    }

    static void sameVowelGroup(String[] a) {
        String[] vowels = new String[] {"a","e","i","o","u","y"};
        String word = a[0];
        StringBuilder wordvowels =  new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Arrays.asList(vowels).contains(String.valueOf(word.charAt(i))))
                wordvowels.append(String.valueOf(word.charAt(i)));
        }
        String[] vowels2 = wordvowels.toString().split("");
        for (int i = 0; i < a.length; i++) {
            word = a[i];
            int vowel_count = 0;
            int vowel2_count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (Arrays.asList(vowels).contains(String.valueOf(word.charAt(j)))) {
                    vowel_count++;
                    if (Arrays.asList(vowels2).contains(String.valueOf(word.charAt(j)))){
                        vowel2_count++;
                    }
                }
            }
            if (vowel_count==vowel2_count)
                System.out.print(word+" ");
        }
        System.out.println();
    }
}