import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang A : ");
        int soPhanTu = input.nextInt();
        int[] phantuMang = new int[soPhanTu];
        for(int i = 0;i < phantuMang.length;i++) {
            System.out.print("Nhap phan tu thu "+(i+1)+" cua mang : ");
            phantuMang[i] = input.nextInt();
        }
        System.out.println();
        System.out.print("Mang truoc khi sap xep la : ");
        for(int i = 0;i < phantuMang.length; i++) {
            System.out.print(phantuMang[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<phantuMang.length;i++) {
            for(int j = i + 1 ; j < phantuMang.length;j++) {
                if(phantuMang[i] > phantuMang[j]) {
                    int temp = phantuMang[i];
                    phantuMang[i] = phantuMang[j];
                    phantuMang[j] = temp;
                }
            }
        }
    }
}