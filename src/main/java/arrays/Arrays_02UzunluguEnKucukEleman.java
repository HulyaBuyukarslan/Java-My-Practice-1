package arrays;

import java.util.Arrays;

public class Arrays_02UzunluguEnKucukEleman {
    public static void main(String[] args) {

//        2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
//        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

       String kelimeler [] ={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
      int enKisa = kelimeler[0].length();

           for(String w : kelimeler){
               enKisa = Math.min(enKisa,w.length());

           }for (String w : kelimeler){
               if ( enKisa==w.length()){
                   System.out.print(w +"  ");
               }
        }










    }


}







