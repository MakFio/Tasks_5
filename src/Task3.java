//Входная строка может быть завершена, если можно добавить дополнительные
//буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову.
//Кроме того, порядок букв во входной строке должен быть таким же, как и порядок
//букв в последнем слове.
//Создайте функцию, которая, учитывая входную строку, определяет, может ли слово быть
//завершено.

public class Task3 {
    public static void main(String[] args) {
        canComplete("butl", "beautifulb");// true
        canComplete("butlz", "beautiful");// false
        canComplete("tulb", "beautiful");// false
        canComplete("bbue", "bubble");// false
        canComplete("bbutl", "beautiful");// false
    }

    static void canComplete(String a, String b) {
        int pos = 0;
        StringBuilder ans = new StringBuilder();    //пустая строка, в которую мы будем записывать ответ
        for (int i = 0; i < b.length()-1; i++) {
            if (a.charAt(pos) == b.charAt(i)) {     //если символ pos строки a соответствует символу строки b, то
                ans.append(b.charAt(i));            //прибавляем его к строке ans
                pos++;
            }
        }
        System.out.println(ans.toString().equals(a));   //сравниваем pos с a
    }
}