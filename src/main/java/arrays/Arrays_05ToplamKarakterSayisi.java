package arrays;

public class Arrays_05ToplamKarakterSayisi {

    public static void main(String[] args) {

//        5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
//        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String isimler [] = { "Kemal", "Jonathan", "Mark", "Angie", "Veli" };

        int toplam = 0;

        for (String  w : isimler){

        toplam = toplam+w.length();

       }
       System.out.println(toplam);


            }
        }
