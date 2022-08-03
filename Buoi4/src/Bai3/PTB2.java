package Bai3;

import java.util.Scanner;

public class PTB2 {
    private double a, b, c;
    static Scanner sc = new Scanner(System.in);

    public void Nhap()
    {
        System.out.print("a = ");
        a = sc.nextDouble();
        System.out.print("b = ");
        b = sc.nextDouble();
        System.out.print("c = ");
        c = sc.nextDouble();
    }
//
//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }
//
//    public void setC(double c) {
//        this.c = c;
//    }
    public void Xuat()
    {
        System.out.println("Phương trình bậc 2 dạng: "+a+"*x^2 + "+b+"*x + "+c+" = 0");
    }


    public void TinhNghiem()
    {
        if (a == 0)
        {
            if(b != 0)
            {
                System.out.print("Đây là phương trình bậc 1 có nghiệm x = "+ (-c/b));
            }
            else
            {
                System.out.print("Phương trình vô nghiệm");
            }
        }
        else
        {

            double delta = b * b - 4 * a * c;
//            double x1 = (-b + Math.sqrt(delta))/(2*a);
//            double x2 = (-b - Math.sqrt(delta))/(2*a);

            if (delta > 0)
            {
                System.out.println("Phương trình có 2 nghiệm ");
                System.out.printf("x1 = %.2f%n", (-b + Math.sqrt(delta))/(2*a));
                System.out.printf("x2 = %.2f%n", (-b - Math.sqrt(delta))/(2*a));
            }
            else if ( delta == 0)
            {
                System.out.printf("Phương trình có 1 nghiệm x = %.2f%n", (-b/(2*a)));
            }
            else
                System.out.println("Phương trình vô nghiệm");
        }
    }
    public static void main(String[] args) {
        PTB2 k = new PTB2();
        k.Nhap();
        k.Xuat();
        k.TinhNghiem();
    }

}
