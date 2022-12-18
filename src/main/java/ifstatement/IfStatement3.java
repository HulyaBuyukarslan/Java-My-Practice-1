package ifstatement;

import java.util.Scanner;

public class IfStatement3 {

    public static void main(String[] args) {

 /*3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
    Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb. */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay numarasını giriniz");
        int ayNum = input.nextInt();

if(ayNum==1){
    System.out.println("Ocak");
} else if (ayNum==2) {
    System.out.println("Şubat");
} else if (ayNum==3) {
    System.out.println("Mart");
} else if (ayNum==4) {
    System.out.println("Nisan");
} else if (ayNum==5) {
    System.out.println("Mayis");
}else if (ayNum==6) {
    System.out.println("Haziran");
} else if (ayNum==7) {
    System.out.println("Temmuz");
}else if (ayNum==8) {
    System.out.println("Agustos");
}else if (ayNum==9) {
    System.out.println("Eylul");
}else if (ayNum==10) {
    System.out.println("Ekim");
}else if (ayNum==11) {
    System.out.println("Kasim");
}else if (ayNum==12) {
    System.out.println("Aralik");
}else {
    System.out.println("Gecerli bir ay numarasi giriniz");
}
}
    }