//Создайте функцию, которая принимает имя шахматной фигуры, ее положение и
//целевую позицию. Функция должна возвращать true, если фигура может двигаться
//к цели, и false, если она не может этого сделать.

public class Task2 {
    public static void main(String[] args) {
        canMove("Rook", "A8", "H8");// true     -ладья
        canMove("Bishop", "A7", "G1");// true   -слон
        canMove("Queen", "C4", "D6");// false   -королева
        canMove("Pawn", "C4", "D5");// true     -пешка
        canMove("King", "E6", "F5");// true     -король
        canMove("Knight", "C3", "D5");// true   -конь
        canMove("Knight", "C3", "E5");// false
    }

    static void canMove(String fig, String start, String end) {
        int ans = 0;

        if ( (fig.equals("Rook") || fig.equals("Queen")) && ( (start.charAt(0) == end.charAt(0)) || (start.charAt(1) == end.charAt(1)) ))
            ans = 1;
        if ( (fig.equals("Bishop") || fig.equals("Queen")) && ( Math.abs(start.charAt(0) - end.charAt(0)) == Math.abs(start.charAt(1) - end.charAt(1)) ) )
            ans = 1;
        if ( (fig.equals("Pawn")) && (Math.abs(start.charAt(0)-end.charAt(0))==1) && (end.charAt(1)-start.charAt(1)==1))
            ans = 1;
        if ( (fig.equals("King")) && (Math.abs(start.charAt(0)-end.charAt(0))==1) && (Math.abs(start.charAt(1)-end.charAt(1))==1))
            ans = 1;
        if ( (fig.equals("Knight")) && (Math.abs(start.charAt(0)-end.charAt(0))==1) && (Math.abs(start.charAt(1)-end.charAt(1))==2))
            ans = 1;

        System.out.println(ans == 1);
    }
}