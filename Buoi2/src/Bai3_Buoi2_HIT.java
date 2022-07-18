import java.util.Scanner;

public class Bai3_Buoi2_HIT {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        n = scanner.nextInt();
        int sum = 1 + n;
        for (int i = 2; i < n; i++ )
        {
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các ước của "+ n +" = "+sum);
    }
}
