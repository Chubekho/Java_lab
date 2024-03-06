package Java.Practice_1;

public interface Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        s1.output();
        s1.changeName();
        System.out.println("Nhap sinh vien thu 2: ");
        Student s2 = new Student();
        s2.input();
        
        String greaterGPA = s1.get_GPA() > s2.get_GPA() ? s1.get_name() : s1.get_name();
        System.out.println("hoc sinh co diem trung binh lon hon: " + greaterGPA);
    }
}
