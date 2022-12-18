package arrays;

public class Arrays_04SonHarfiBilinenKelimeninBasHarfiBulma {
    public static void main(String[] args) {
//        4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
//        alınız.
//                Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM


        String isimler[] = { "Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String girdi ="";

        for (String w : isimler){

            if(w.endsWith("n") || w.endsWith("k")){

                girdi = girdi + w.substring(0,1);

            }

        }
        System.out.println(girdi);


    }



}
