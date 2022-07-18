import java.util.Scanner;

public class BVN_Buoi2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhâp bài số ");
        n = scanner.nextInt();
        switch (n)
        {
            case 1:
            {
                int ngay, thang;
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

            case 2:
            {
                float a, b, c;
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

            case 3:
            {
                int a;
                System.out.print("n = ");
                a = scanner.nextInt();
                int sum = 1 + a;
                for (int i = 2; i < a; i++ )
                {
                    if (a % i == 0){
                        sum += i;
                    }
                }
                System.out.println("Tổng các ước của "+ a +" = "+sum);
            }

        }
    }
}
