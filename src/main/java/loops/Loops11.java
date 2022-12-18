package loops;

public class Loops11 {
    public static void main(String[] args) {

     //   Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

String str = "Mark";
String ters = "";

        for (int i = str.length()-1; i > -1 ; i--) {
            char ch = str.charAt(i);
            ters = ters + ch;

        }
        System.out.print(ters);


    }




}
