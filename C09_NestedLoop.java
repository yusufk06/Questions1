package day_11forLoop;

public class C09_NestedLoop {
    public static void main(String[] args) {

        //input olarak verilen kenar uzunluklarina gore asagidaki sekli cizdirin
        int kisaKenar=5;
        int uzunKenar=8;
        /*
         * * * * * * * * // bir satiri nasil yazdir. inner loop ile belirliyorz
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
        Satirda yaptigimz islemi kaca kere tekrar edecegimizi ise outer loop belirliyro
         */
        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");
            }
            System.out.println("");//satir ile islemimiz bittiginde alt satira gecmesi icin
        }
        }
    }

