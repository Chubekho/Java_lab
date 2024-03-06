package Java.Practice_1;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] myArr = new int[size];
        for(int i = 0; i < size; i++)
        {
            myArr[i] = in.nextInt();
        }

        int max = myArr[0];
        for(int i = 1; i < size; i++)
        {
            max = Math.max(max, myArr[i]);
        }
        System.out.println("Phan tu lon nhat trong mang: " + max);

        in.close();
    }
    
}
