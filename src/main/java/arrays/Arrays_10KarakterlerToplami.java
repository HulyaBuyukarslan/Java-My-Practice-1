package arrays;

public class Arrays_10KarakterlerToplami {
    public static void main(String[] args) {

//        10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.


        String[] str = new String[]{"alabama", "pick", "sos", "sets", "pex"};
       int toplam = 0;

        for (String  w : str){

        toplam = toplam+ w.length();

        }
        System.out.println(toplam);



    }
}


