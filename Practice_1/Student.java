package Java.Practice_1;

import java.util.Scanner;

public class Student {
    private String name;
    private int Id;
    private float GPA;

    Scanner in = new Scanner(System.in);

    void set_name(String name)
    {
        this.name = name;
    }

    String get_name()
    {
        return this.name;
    }

    void set_Id(int Id)
    {
        this.Id = Id;
    }

    int get_Id()
    {
        return this.Id;
    }

    void set_GPA(float GPA)
    {
        this.GPA = GPA;
    }

    float get_GPA()
    {
        return this.GPA;
    }

    void input()
    {
        System.out.print("Nhap MSSV: ");
        int _id = in.nextInt();
        this.set_Id(_id);
        in.nextLine();

        System.out.print("Nhap ho ten SV: ");
        String _name = in.nextLine();
        this.set_name(_name);

        System.out.print("Nhap diem TB: ");
        float _GPA = in.nextFloat();
        this.set_GPA(_GPA);
        in.nextLine();

    }

    void output()
    {
        System.out.println("MSSV: " + this.get_Id());
        System.out.println("Ho ten SV: " + this.get_name());
        System.out.println("Diem trung binh: " + this.get_GPA());
        System.out.println("===========================================");
    }

    String rank(float GPA)
    {
        if(this.get_GPA() >= 8.0)
        {
            return "Gioi";
        }
        else if (this.get_GPA() < 8.0 && this.get_GPA() >= 6.5) {
            return "Kha";
        }
        else if(this.get_GPA() < 6.5 && this.get_GPA() >= 5.0)
        {
            return "Trung binh";
        }
        else  return "Yeu";
    }

    void changeName()
    {
        System.out.println("Nhap ten moi cua SV: ");
        String _name = in.nextLine();
        this.name = _name;
    }
    
}
