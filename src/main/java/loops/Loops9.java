package loops;

public class Loops9 {
    public static void main(String[] args) {


//        String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
//       Örneğin;
//       'Ali Can?' ==>l * i * a * n *

        String str = "Ali Can";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.print(str.charAt(i)+"*");
            }

            }
        }
    }
