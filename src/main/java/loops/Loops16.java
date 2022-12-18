package loops;

public class Loops16 {
    public static void main(String[] args) {

    //    Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.

    String m = "Christmas";
    String sonuc = "";

        for (int i =0 ; i <m.length() ; i++) {
            String c = m.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
           sonuc = sonuc+c;
        }
        System.out.println(sonuc);




    }




}
