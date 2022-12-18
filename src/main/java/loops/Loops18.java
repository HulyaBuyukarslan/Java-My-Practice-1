package loops;

public class Loops18 {

    public static void main(String[] args) {
    //    Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
    //    Örneğin; Hello ==> Heo

String kelime = "Hello";

        for (int i = 0; i < kelime.length(); i++) {
          char ch = kelime.charAt(i);

          if(kelime.indexOf(ch)==kelime.lastIndexOf(ch))
                System.out.print(ch);
        }


 /*       String s = "Hello";
        for(int i=0; i<s.length();i++){
            String c = s.substring(i,i+1);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
            }
        }                                           */



    }


}
