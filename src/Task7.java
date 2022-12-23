//Напишите функцию, которая принимает положительное целое число от 0 до 999
//включительно и возвращает строковое представление этого целого числа,
//написанное на английском языке.

public class Task7 {
    public static void main(String[] args) {
        numToEng(0);// "zero"
        numToEng(18);// "eighteen"
        numToEng(20);// "twenty"
        numToEng(118);// "one hundred eighteen"
        numToEng(210);// "two hundred ten"
        numToEng(126);// "one hundred twenty six"
        numToEng(909);// "nine hundred nine"
        numToRus(0);// "ноль"
        numToRus(18);// "восемнадцать"
        numToRus(20);// "двадцать"
        numToRus(118);// "сто восемнадцать"
        numToRus(210);// "двести десять"
        numToRus(126);// "сто двадцать шесть"
        numToRus(909);// "девятьсот  девять"
    }

    static void numToEng(int a) {
        String[] numbs1 = new String[] {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] numbs0 = new String[] {"","one", "two", "three", "four", "fife", "six", "seven", "eight", "nine"};
        String[] numbs2 = new String[] {"","","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (a==0)
            System.out.println("zero");
        if (a==10)
            System.out.println("ten");
        if (a>10 && a<20)
            System.out.println(numbs1[a-11]);
        if (a>19 && a<100)
            System.out.println(numbs2[a/10] + " " + numbs0[a%10]);
        if (a>99 && a<1000) {
            if (a%100>10 && a%100<20) {
                System.out.println(numbs0[a / 100] + " hundred " + numbs1[a % 100 - 11]);
            } else if (a%100 == 10) {
                System.out.println(numbs0[a / 100] + " hundred ten");
            } else {
                System.out.println(numbs0[a / 100] + " hundred " + numbs2[(a/10)%10] + " " + numbs0[a%10]);
            }
        }
    }

    static void numToRus(int a) {
        String[] numbs1 = new String[] {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] numbs0 = new String[] {"","один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] numbs2 = new String[] {"","","двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] numbs3 = new String[] {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        if (a==0)
            System.out.println("ноль");
        if (a==10)
            System.out.println("десять");
        if (a>10 && a<20)
            System.out.println(numbs1[a-11]);
        if (a>19 && a<100)
            System.out.println(numbs2[a/10] + " " + numbs0[a%10]);
        if (a>99 && a<1000) {
            if (a%100>10 && a%100<20) {
                System.out.println(numbs3[a / 100 - 1] + " " + numbs1[a % 100 - 11]);
            } else if (a%100 == 10) {
                System.out.println(numbs3[a / 100 - 1] + " десять");
            } else {
                System.out.println(numbs3[a / 100 - 1] + " " + numbs2[(a/10)%10] + " " + numbs0[a%10]);
            }
        }
    }
}