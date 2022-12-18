package loops;

public class Loops20 {
    public static void main(String[] args) {
//
//            Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//


 /*       int sayi = 6;
        for (int i = 1; i < sayi + 1; i++) {
            for (int k = sayi; k > i - 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }                                           */



        int sayi=6;
        String s = "";
        for(int i=1; i<= sayi; i++){
            for(int k= sayi; k>=i; k--){
                s = s + "* ";
            }
            System.out.println(s);
            s = "";
        }






    }

}












