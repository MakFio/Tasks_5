//Создайте функцию, которая принимает число в качестве аргумента и возвращает
//true, если это число является действительным номером кредитной карты, а в
//противном случае-false.


public class Task6 {
    public static void main(String[] args) {
        validateCard(1234567890123456L);// false
        validateCard(1234567890123452L);// true
    }

    static void validateCard(long a) {
        int check = (int) (a%10); //последняя цифра
        String card = "0"+a;
        card = card.substring(0, card.length()-1);
        int sum = 0;
        int ans = 0;
        for (int i = card.length()-1; i >=0 ; i-=2) {
            sum = 2 * Integer.parseInt(String.valueOf(card.charAt(i))); //каждый нечетный элемент умножаем на 2
            if (sum>9)
                sum = sum%10 + sum/10;
            ans += sum + Integer.parseInt(String.valueOf(card.charAt(i-1)));    //прибавляем элементы к ans
        }
        System.out.println((10-ans%10)==check); //сравниваем результат с последней цифрой
    }
}