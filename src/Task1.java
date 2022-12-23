//Создайте две функции, которые принимают строку и массив и возвращают
//закодированное или декодированное сообщение.
//Первая буква строки или первый элемент массива представляет собой символьный код
//этой буквы. Следующие элементы-это различия между символами: например, A +3 --> C
//или z -1 --> y.

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        encrypt("Hello");// [72, 29, 7, 0, 3] - 72 111 118 118 121
        decrypt(new int[]{ 72, 29, 7, 0, 3 });//Hello
        decrypt(new int[]{ 72, 33, -73, 84, -12, -3, 13, -13, -68 });// "Hi there!"
        encrypt("Sunshine");// [83, 34, -7, 5, -11, 1, 5, -9]
    }

    static void encrypt(String s) {
        int code = (int) s.charAt(0);  //код 1го элемента
        int[] ans = new int[s.length()];   //создаем пустой массив
        ans[0] = code;
        for (int i = 1; i < s.length(); i++) {
            code = (int) s.charAt(i-1);
            int code2 = (int) s.charAt(i);   //код iго элемента
            ans[i] = code2 - code;  //разница кодов
        }
        System.out.println(Arrays.toString(ans));
    }

    static void decrypt(int[] a) {
        char letter = (char) a[0];  //1й элемент
        StringBuilder ans = new StringBuilder();
        ans.append(String.valueOf(letter));
        for (int i = 1; i < a.length; i++) {
            char letter2 = (char) (a[i]+a[i-1]);    //суммируем 2 соседних элемента
            a[i] = a[i]+a[i-1];
            ans.append(String.valueOf(letter2));    //добавляем символ в массив
        }
        System.out.println(ans);
    }
}