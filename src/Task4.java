//Создайте функцию, которая принимает числа в качестве аргументов, складывает их
//вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной
//всего в 1 цифру.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        sumDigProd(new int[]{16, 28});// 6
        sumDigProd(new int[]{0});// 0
        sumDigProd(new int[]{1, 2, 3, 4, 5, 6});// 2
    }

    static void sumDigProd(int[] a) {
        int sum = Arrays.stream(a).sum();   //суммируем элементы массива
        while (sum>10) {  //число проходит через цикл, пока оно больше 10
            int mult = 1;  //переменная, равная произведению цифр числа
            while (sum!=0) {
                mult *= (sum % 10); //умножаем mult на последнюю цифру числа
                sum/= 10;   //отсекаем последнюю цифру
            }
            sum = mult;  //к sum приравниваем произведение
        }
        System.out.println(sum);
    }
}