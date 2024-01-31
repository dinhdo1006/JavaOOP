import java.util.Scanner;
public class slide30chuong2 {
    public static void main(String[] args) {
        int n, soDu, Tong = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong bat ki:");
        n = sc.nextInt();
        while(n > 0) {
            soDu= n % 10;
            n = n / 10;
            Tong = Tong + soDu;
           
        }
        
        System.out.println(" Tong cac chu so la : "  +  Tong);
        
    }
}