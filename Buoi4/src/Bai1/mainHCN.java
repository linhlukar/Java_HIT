package Bai1;

import java.util.Scanner;

public class mainHCN {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        HCN a = new HCN();
        a.Nhap();

        HCN b = new HCN();
        System.out.print("\nChiều dài: ");
        b.setChieuDai(sc.nextFloat());
        System.out.print("Chiều rộng: ");
        b.setChieuRong(sc.nextFloat());


        System.out.print("\n Thông tin HCN a: ");
        a.Xuat();
        System.out.print("\nThông tin HCN b: ");
        b.Xuat();
        System.out.println();
        SoSanhS(a, b);
    }
    public static void SoSanhS(HCN a, HCN b)
    {
        if(a.DienTich() > b.DienTich())
        {
            System.out.print("=> Hình Chữ Nhật a có diện tích lớn hơn HCN b ");
        }
        else
            System.out.print("=> HCN b có diện tích lớn hơn HCN a");
    }
}
