package day_11forLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        //kullaniciddan bir char alip o karakterden sonra gelen 10 karakteri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char alinanKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print((char)(alinanKarakter+i) + " ");
            System.out.println("sdasd");
        }
//test


    }
}

