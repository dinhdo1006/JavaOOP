import java.util.Scanner;
public class Student{
public static void main(String[] args){}
    public String name,msv;
    public float DiemMonA;
    public float DiemMonB;
    public float DiemMonC;
void nhapThongTin(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap vao ho va ten sinh vien:");
 name = scanner.nextLine();
    System.out.println("Nhap vao ma sinh vien:");
    msv = scanner.nextLine();
    System.out.println("Nhap mon A");
     DiemMonA =scanner.nextFloat();
     System.out.println("Nhap mon B");
     DiemMonB =scanner.nextFloat();
     System.out.println("Nhap mon C");
     DiemMonC =scanner.nextFloat();
}
    void xuatThongTin(){
        System.out.println("Ho va Ten" + name);
        System.out.println("Ma sinh vien" + msv);
    }
void DiemTong(){
    float DiemTong=(DiemMonA+DiemMonB+DiemMonC)/3;
    System.out.println("DiemTong:");

}
}


