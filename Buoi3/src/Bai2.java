import java.util.Locale;
import java.util.Scanner;

public class Bai2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a;
        System.out.print("Nhập chuỗi: ");
        a = scanner.nextLine();
        System.out.println("Chuỗi: " + a);

        //Xóa khoảng trống thừa:
        a = a.replaceAll("\\s+", " ");
        System.out.println("Chuỗi sau khi xóa khoảng trống: " + a);

        //Viết hoa chữ cái đầu mỗi từ, các chữ cái sau viết thường
        String[] tmp = a.split(" ");
        a = "";
        for (int i = 0; i < tmp.length; i++)
        {
            String s1 = tmp[i].substring(0, 1).toUpperCase();
            a += s1 + tmp[i].substring(1) + " ";

        }
        System.out.println("Chuỗi khi viết hoa chữ cái đầu: " + a);

        System.out.print("Xóa các số có trong chuỗi: ");
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)>='0' && a.charAt(i)<='9'){
                a = a.replace(String.valueOf(a.charAt(i)), " ");
                i--;
            }
        }
        System.out.println(a);

            //Xóa hết các số có trong chuỗi


        }

}
