import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1_Buoi2_HIT {
    public static void main(String[] args) {
        int ngay, thang;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập ngày sinh: ");
        ngay = scanner.nextInt();
        System.out.print("Nhập tháng sinh: ");
        thang = scanner.nextInt();
        if (ngay >= 20 && ngay <=31 && thang == 1 || ngay >=1 && ngay <=18 && thang == 2)
            System.out.println(ngay+"/"+thang+": Thuộc cung Bảo Bình");
        if (ngay >= 19 && ngay <=29 && thang == 2 || ngay >=1 && ngay <=20 && thang == 3)
            System.out.println(ngay+"/"+thang+": Thuộc cung Song Ngư");
        if (ngay >= 21 && ngay <=31 && thang == 3 || ngay >=1 && ngay <=20 && thang == 4)
            System.out.println(ngay+"/"+thang+": Thuộc cung Bạch Dương");
        if (ngay >= 21 && ngay <=30 && thang == 4 || ngay >=1 && ngay <=20 && thang == 5)
            System.out.println(ngay+"/"+thang+": Thuộc cung Kim Ngưu");
        if (ngay >= 21 && ngay <=31 && thang == 5 || ngay >=1 && ngay <=21 && thang == 6)
            System.out.println(ngay+"/"+thang+": Thuộc cung Song Tử");
        if (ngay >= 22 && ngay <=30 && thang == 6 || ngay >=1 && ngay <=22 && thang == 7)
            System.out.println(ngay+"/"+thang+": Thuộc cung Cự Giải");
        if (ngay >= 23 && ngay <=31 && thang == 7 || ngay >=1 && ngay <=22 && thang == 8)
            System.out.println(ngay+"/"+thang+": Thuộc cung Sư Tử");
        if (ngay >= 23 && ngay <=31 && thang == 8 || ngay >=1 && ngay <=22 && thang == 9)
            System.out.println(ngay+"/"+thang+": Thuộc cung Xử Nữ");
        if (ngay >= 23 && ngay <=30 && thang == 9 || ngay >=1 && ngay <=23 && thang == 10)
            System.out.println(ngay+"/"+thang+": Thuộc cung Thiên Bình");
        if (ngay >= 24 && ngay <=31 && thang == 10 || ngay >=1 && ngay <=22 && thang == 11)
            System.out.println(ngay+"/"+thang+": Thuộc cung Bọ Cạp");
        if (ngay >= 23 && ngay <=30 && thang == 11 || ngay >=1 && ngay <=21 && thang == 12)
            System.out.println(ngay+"/"+thang+": Thuộc cung Nhân Mã");
        if (ngay >= 22 && ngay <=31 && thang == 12 || ngay >=1 && ngay <=19 && thang == 1)
            System.out.println(ngay+"/"+thang+": Thuộc cung Ma Kết");

    }
}
