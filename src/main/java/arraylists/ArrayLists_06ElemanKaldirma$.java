package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_06ElemanKaldirma$ {
    public static void main(String[] args) {

//        6) Listede 15 veya 13 varsa, bu elemanları kaldırınız.
//        Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)



        // 1.Yol:
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(54);


        if(!sayilar.contains(15) && !sayilar.contains(13)) {
            System.out.println("Liste 13 ve 15 icermiyor");

        }else {
            for (int i = 0; i < sayilar.size(); i++) {
                if (sayilar.get(i) == 15) {
                    int idx1 = sayilar.indexOf(15);
                    sayilar.remove(idx1);

                    i--;


                }
                if (sayilar.get(i) == 13) {
                    int idx2 = sayilar.indexOf(13);
                    sayilar.remove(idx2);
                    i++;

                }
            }

        }System.out.println(sayilar);

// 2.yol:
            List<Integer> list = new ArrayList<>();
            list.add(13);
            list.add(7);
            list.add(15);
            list.add(13);
            list.add(15);

     //       System.out.println(list);   // [13, 7, 15, 13, 15]

            List<Integer> removeList = new ArrayList<>();

            for (Integer w : list) {
                if (w == 13 || w == 15) {
                    removeList.add(w);
                }
            }

            list.removeAll(removeList);

            System.out.println(list);


        }




    }
