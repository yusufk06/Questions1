package day_11forLoop;

public class C07_TerseCevirme {
    public static void main(String[] args) {


        //kullanicidan bir String isteyin ve Stringi tersine cevirip kaydedin

        String str= "Java ogrenmek icin cok calismak lazim";
        String terstenStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            terstenStr+=str.substring(i,i+1);

        }
        System.out.println("Girilen cumlenin tersten yazilisi :" + terstenStr);
    }
}
