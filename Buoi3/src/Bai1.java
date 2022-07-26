
import java.util.Scanner;

public class Bai1 {

    //Hàm nhập
    public static int[] Nhap(){
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 1);
        int[]a = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("a["+i+"]=");
            a[i] = scanner.nextInt();
        }
        return a;
    }

    //Hàm xuất:
    public static void Xuat(int a[])
    {
        System.out.print("Mảng: ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(" "+ a[i]);
        }
    }
    //Trung bình cộng
    public static float TBC(int a[])
    {
        float sum=0, d=0;
        for (int i=0; i <a.length; i++)
        {
            if(i % 2 == 0 && a[i] % 2 != 0)
            {
                sum += a[i];
                d++;
            }
        }
        return sum/d;
    }

    //Tìm vị trí các số nhỏ nhất trong mảng:
    public static void TimMin(int a[])
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
            if(a[i] < min)
            {
                min = a[i];
            }

        for(int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                System.out.print(i + " ");
            }
        }
    }

    //Kiểm tra mảng có số chính phương không? Nếu có hiển thị ra màn hình
    public static void  ktraSCP( int a[])
    {
        for(int i =0; i<a.length; i++)
        {
            int m = (int)Math.sqrt(a[i]);
            if(m*m == a[i])
            {
                System.out.print(a[i] + " ");
            }
        }

    }
    //Hiển thị các số nguyên tố có trong mảng lên màn hình
    public static boolean ktrSNT( int n)
    {
        if(n<2)
        {
            return false;
        }
        int t = (int)Math.sqrt(n);
        for(int i = 2; i <= t ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    //Sắp xếp mảng đã nhập theo thứ tự tăng dần
    public static void Sort (int a[])
    {
        for (int i=0; i<a.length; i++)
            for(int j = i+1; j<a.length; j++)
                if(a[i]> a[j])
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
        System.out.print("\nMảng sau khi sắp là : ");
                for(int i = 0; i< a.length; i++)
                    System.out.print( a[i]+ " ");
    }

    public static void main(String[] args) {
        int n;
        int []a = Nhap();
        Xuat(a);
        System.out.print("\nTBC các số lẻ ở vị trí chẵn = "+ TBC(a));
        System.out.print("\nVị trí số nhỏ nhất trong mảng: ");
        TimMin(a);
        System.out.print("Ktra số chính phương của mảng: ");
        ktraSCP(a);
        System.out.print("\nSố nguyên tố có trong mảng: ");
        for(int i = 0; i < a.length; i++)
        {
            if(ktrSNT(a[i]))
            {
                System.out.print(a[i] + " ");
            }
        }
        Sort(a);
    }
}