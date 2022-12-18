package loops;

import java.sql.SQLOutput;

public class Loops15 {
    public static void main(String[] args) {

        // Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.

char ch = 'C';
String sonuc = " ";

do{
    sonuc = sonuc + ch;

   ch--;

}while(ch>='A');
        System.out.print(sonuc + " ");


    }
}
