package ifstatement;

public class IfStatement6 {
    public static void main(String[] args) {


/*
8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.

    a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla
    olamaz" yazmalıdır.
    b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
            c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden
    farklı karakterler içeremez" yazmalıdır.
     Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
        küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
        yazmalıdır. */

        String kisaltma = "m325Ad";
        boolean kural1 = kisaltma.length() > 2;
        boolean kural2 = kisaltma.replaceAll("[^a-z]", "").length() != 0;
        boolean kural3 = kisaltma.replaceAll("[^A-Za-z]", "").length() != 0;

        if (kural1) {
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        } else if (kural2){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
        } else if (kural3) {
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
        }else {
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz" +
                    "Eyalet kısaltmaları küçük harf içeremez" +
                    "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
        }

        }

    }
