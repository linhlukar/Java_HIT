package Bai2;

import java.util.Scanner;

public class NhanVien
{
    private static int maNV = 1;
    private String  tenNV, diaChi, boPhan ;
    private int tuoi;
    static Scanner sc = new Scanner(System.in);

    public static int getMaNV()
    {
        return maNV++;
    }

    public void Nhap()
    {
        System.out.print(" Nhập tuổi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print(" Nhập tên nhân viên: ");
        tenNV = sc.nextLine();
        System.out.print(" Nhập địa chỉ nhân viên: ");
        diaChi = sc.nextLine();
        System.out.print(" Bộ phận làm việc: ");
        boPhan = sc.nextLine();
    }
    public void Xuat()
    {
        System.out.printf("%-15d %-15s %-10d %-20s %-15s %n",
                maNV++, tenNV, tuoi, diaChi, boPhan);

    }

    public static void main(String[] args)
    {

        NhanVien[] ds = new NhanVien[5];
        for (int i =0; i<ds.length; i++)
        {
            ds[i] = new NhanVien();
            ds[i].Nhap();
        }

        System.out.printf("%-15s %-15s %-10s %-20s %-15s %n",
                "Mã Nhân Viên", "tenNV", "Tuổi", "Địa chỉ", "Bộ Phận");
        for(NhanVien a : ds)
            a.Xuat();
    }


}
