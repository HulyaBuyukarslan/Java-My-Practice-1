package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_03CiftSayilarinCarpimi {
    public static void main(String[] args) {

     //   3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(-3);
        sayilar.add(-2);
        sayilar.add(5);

        int carpim = 1;

        for(Integer w : sayilar){
            if(w%2!=0){
              continue;
            }else if(w%2 ==0){
                carpim*=w;
            }
        }
        System.out.println(carpim);










    }

}
