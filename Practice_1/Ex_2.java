package Java.Practice_1;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap mssv: ");
        int MSV = in.nextInt();

        in.nextLine();
        System.out.print("Nhap ten: ");
        String ho_ten = in.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = in.nextInt();

        System.out.print("Nhap nam sinh: ");
        int nam_sinh = in.nextInt();


        System.out.println("MSSV: " + MSV);
        System.out.println("Ho ten: " + ho_ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + nam_sinh);
        in.close();
    }
    
}
