package day_11forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        // kullancidan baslangic ve bitis degeri olarak pozitigf sayilar alin
        //sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin
        //bitis degeri baslangic degerinden kucukse uyari yazdirip islemi sonlandirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen baslangv e bitis degerilri icin 2 poizitif tamsyi gir");


        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        if (bitis<baslangic){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        }else {
            int toplam=0;
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i; // tum sayilari sirasi ile toplama ekledik
            }
            System.out.println(baslangic + "ile"+ bitis + "arasindaki sayilarin toplami :"+ toplam);
        }
    }
}
