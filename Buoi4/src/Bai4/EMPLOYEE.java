package Bai4;

import java.util.Scanner;

public class EMPLOYEE
{
    private String id, name;
    private int age, workingDays;
    private double salary;

    //khai báo hằng số
    private static double PRICE = 50;
    static Scanner sc = new Scanner(System.in);

//Các phương thức:
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public EMPLOYEE(String id, String name, int age, int workingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    public EMPLOYEE() {}
    public double getSalary() {
        return salary = workingDays * PRICE;
    }


    public void Nhap()
    {
        System.out.print("Nhập Mã nhân viên: ");
        id = sc.nextLine();
        System.out.print("Nhập Họ tên Nv : ");
        name = sc.nextLine();
        do {
            System.out.print("Nhập tuổi");
            age = Integer.parseInt(sc.nextLine());
        } while ( age <= 0 );
        do {
            System.out.print("Nhập số ngày công: ");
            workingDays = Integer.parseInt(sc.nextLine());
        }while (workingDays <= 0);
    }
    public  void Xuat()
    {
         System.out.printf("%-15s %-15s %-10d %-15d %-10f%n",
                            id, name, age, workingDays, getSalary() );
    }


}
