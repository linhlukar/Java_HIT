package Bai1;

import java.util.Scanner;

public class HCN {
    //thuộc tính
    private float chieuDai;
    private  float chieuRong;
    static Scanner sc = new Scanner(System.in);

    // Phương thức :

    public float DienTich()
    {
        return chieuDai * chieuRong;
    }
    public  float ChuVi()
    {
        return (chieuDai+ chieuRong) * 2;
    }
    //Cách 1: Nhập trong phương thức input và gọi vào trong hàm main.
    public void Nhap()
    {
        System.out.print("Nhập Chiều dài: ");
        chieuDai = sc.nextFloat();
        System.out.print("Nhập Chiều rộng: ");
        chieuRong = sc.nextFloat();
    }
    public void Xuat()
    {
        System.out.print("\nChiều dài = "+ chieuDai);
        System.out.print("\nChiều rộng = "+chieuRong);
        System.out.print("\nDiện tích HCN = "+ chieuDai+ " * "+chieuRong+" = "+DienTich());
        System.out.print("\nChu vi HCN = ("+chieuDai+" + "+chieuRong+") * 2 = "+ChuVi());
    }


    //Cách 2:  Sử dụng getter, setter để nhập trực tiếp trong hàm main.
    public float getChieuDai() {
        return chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    //So sánh HCN có diện tích lớn hơn thì in ra màn hình.

}
