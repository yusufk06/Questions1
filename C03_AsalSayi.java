package day_11forLoop;

public class C03_AsalSayi {
    public static void main(String[] args) {
        //input olarak verilen bir tamsayinin asal sayi olup olmadigini yazdirin

        int input=19;
        String sonuc= "Sayi asal";

        for (int i = 2; i <input ; i++) {
            if (input%i==0){
                sonuc="sayi asal degil";
                break;
                // Java, bir loop un icersinde kod "break"
                // goruurse o loopu2 bitirir


            }
        }
        System.out.println(sonuc);
    }
}
