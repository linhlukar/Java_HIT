package Bai4;

import java.util.Scanner;

public class mainEMPLOYEE {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        EMPLOYEE[] ds = new EMPLOYEE[3];
//        EMPLOYEE a = new EMPLOYEE();
//        a.Nhap();
//        a.Xuat();
        for(int i=0; i < ds.length; i++)
        {
            ds[i] = new EMPLOYEE();
            ds[i].Nhap();
        }
        System.out.println("Thông tin");
        System.out.printf("%-15s %-15s %-10s %-15s %-10s %n",
                "Mã Nhân viên", "Họ tên", "Tuổi", "Số ngày công", "Lương" );
        for( EMPLOYEE a: ds)
        {
            a.Xuat();
        }
    }
}
