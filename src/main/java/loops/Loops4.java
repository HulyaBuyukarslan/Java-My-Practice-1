package loops;

public class Loops4 {
    public static void main(String[] args) {

        //    Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //    Örnek; 223878 ´ 37

        int sayi = 223878;
        String str = String.valueOf(sayi);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.print(ch + " ");


            }

        }
    }
}







