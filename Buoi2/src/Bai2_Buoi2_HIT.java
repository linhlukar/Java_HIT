import java.util.Scanner;

public class Bai2_Buoi2_HIT {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        System.out.print("c = ");
        c = scanner.nextFloat();

        if( (a+b>c) || (a+c>b) || (b+c>a)) {
            if ((a != b) && (b != c) && (c != a)) {
                System.out.println("Đây là tam giác thường");
            } else if ((a == b) && (b == c)) {
                System.out.printf(" Đây là tam giác đều");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Đây là tam giác cân ");
            } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println("Đây là tam giác vuông");
            } else if (((a * 2 + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) && ((a == b) || (b == c) || (a == c))) {
                System.out.println("Đây là tam giác vuông cân");
            }
        } else{
            System.out.println("Đây k phại là tam giác");
        }

    }
}
