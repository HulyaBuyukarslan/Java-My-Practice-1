package ifstatement;

import java.util.Scanner;

public class IfStatement1 {
    public static void main(String[] args) {


     /*   1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı" */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ay ismi giriniz");
        String ay = input.next();


        boolean kisAylari  =    ay.equalsIgnoreCase("Aralik") ||
                                ay.equalsIgnoreCase("Ocak") ||
                                ay.equalsIgnoreCase("Subat");
        boolean ilkBaharAylari =ay.equalsIgnoreCase("Mart") ||
                                ay.equalsIgnoreCase("Nisan") ||
                                ay.equalsIgnoreCase("Mayis");
        boolean yazAylari =     ay.equalsIgnoreCase("Haziran") ||
                                ay.equalsIgnoreCase("Temmuz") ||
                                ay.equalsIgnoreCase("Agustos");
        boolean sonBaharAylari =ay.equalsIgnoreCase("Eylül") ||
                                ay.equalsIgnoreCase("Ekim") ||
                                ay.equalsIgnoreCase("Kasim");

       if (kisAylari) {
           System.out.println("Kış");
       } else if(ilkBaharAylari){
           System.out.println("İlkbahar");
       }else if (yazAylari){
           System.out.println("Yaz");
       }else if (sonBaharAylari){
           System.out.println("Sonbahar");
       }else {
           System.out.println ("Gecersiz ay adi");
       }

    }
}





