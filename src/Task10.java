//Напишите функцию, которая принимает целое число n и возвращает "недопустимое", если
//n не является центрированным шестиугольным числом или его иллюстрацией в виде
//многострочной прямоугольной строки в противном случае.

public class Task10 {
    public static void main(String[] args) {
        hexLattice(1);
// o
        hexLattice(7);
//  o o
// o o o
//  o o
        hexLattice(19);
//   o o o
//  o o o o
// o o o o o
//  o o o o
//   o o o
        hexLattice(25);
// "Invalid"
    }

    public static void hexLattice(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i<n; i++) {
            sum+=i;
            count ++;
            if ((sum==(n-1)/6) && ((n-1)%6==0)) {
                for (int j = 0; j<count; j++){
                    System.out.println(" ".repeat( count-j ) + "o ".repeat( count + j ));
                }
                for (int j = count-2; j>=0; j--){
                    System.out.println(" ".repeat( count-j ) + "o ".repeat( count + j ));
                }
                System.out.println();
                break;
            } else if (sum>(n-1)/6) {
                System.out.println("Invalid");
                break;
            }
        }
    }
}