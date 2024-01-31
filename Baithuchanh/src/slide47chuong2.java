import java.util.Scanner;
public class slide47chuong2 {
    public static void main(String[] args) {
        int n, sum =0;
        String strResult ="";
        Scanner sc= new Scanner(System.in);
        while(sum <= 100){
            System.out.print("Nhap vao so nguyen: ");
            n =sc.nextInt();
            sum = sum +n;
            strResult = strResult + n + " + ";
        }
        strResult = strResult.substring(0, strResult.length()-2);
        System.out.printf(strResult + "= "+ sum);
    }
}