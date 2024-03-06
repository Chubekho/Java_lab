package Java.Practice_1;

import java.util.Random;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int m = in.nextInt();
        System.out.print("Nhap so cot: ");
        int n = in.nextInt();

        Random random = new Random();

        int[][]myArr = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                myArr[i][j] = random.nextInt(51);
            }
        }

        for(int[] i : myArr)
        {
            for(int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }



        in.close();
    }
    
}
