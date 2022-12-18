package loops;

public class Loops19 {
    public static void main(String[] args) {

//        Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
//        String s = "Java is a strongly typed, object-oriented programming language.";


        String str = "Java is a strongly typed, object-oriented programming language.";

    str = str.replaceAll("\\s","").replaceAll("\\p{Punct}","");
        System.out.println(str.length());






    }





}
