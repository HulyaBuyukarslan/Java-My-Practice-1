package loops;

public class Loops21 {
    public static void main(String[] args) {

    //    Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
    //   Örnek:12133455 ´ 2+4=6

   /*     String str  = "12133455";

        int toplam = 0;

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.print(ch+" ");                   */






        int sayi = 12133455;
        String str = String.valueOf(sayi);
        int tekrarsizToplam = 0;
        for(int i=0; i<str.length(); i++){
            String c = str.substring(i,i+1);
            if(str.indexOf(c)==str.lastIndexOf(c)){
                tekrarsizToplam= tekrarsizToplam + Integer.valueOf(c);
            }
        }
        System.out.println(tekrarsizToplam);

            }

        }















