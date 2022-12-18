package arrays;

import java.util.Arrays;

public class Arrays_08IlkveSonKarakterleriAyniOlma {
    public static void main(String[] args) {


//        8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

        String str [] = {"alabama", "pick", "sos", "sets", "pex"};
        String arr []= new String[str.length];
       int index = 0;

        for (int i = 0; i <str.length ; i++) {
           String ilkHarf =str[i].substring(0,1);
           String sonHarf = str[i].substring(str[i].length()-1);
           if(ilkHarf.equalsIgnoreCase(sonHarf)){
              arr[index] = str[i];

                index++;
               System.out.print(str[i] +"  ");
           }

        }
        System.out.println(Arrays.toString(arr));
    }



        }









