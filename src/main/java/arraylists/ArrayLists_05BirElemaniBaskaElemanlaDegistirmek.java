package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_05BirElemaniBaskaElemanlaDegistirmek {

    public static void main(String[] args) {

//        5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
//        Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer> numaralar = new ArrayList<>();
        numaralar.add(12);
        numaralar.add(15);
        numaralar.add(34);
        numaralar.add(15);
        numaralar.add(43);
    //    System.out.println(numaralar);   //   [12, 15, 34, 15, 43]


        if(numaralar.contains(15)){
           for (Integer w : numaralar){
            if(w==15){

             int index = numaralar.indexOf(15);

                numaralar.set(index,51);
            }
        }
           System.out.println(numaralar);

        }else {
           System.out.println("15 elemani yoktur");
       }






    }









}
