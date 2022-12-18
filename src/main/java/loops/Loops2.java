package loops;

public class Loops2 {
    public static void main(String[] args) {
    //    Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
   //          Örneğin; accessories ´ ces
        String kelime = "accessories";
        for(int i = 0; i<kelime.length(); i++){
            char harf = kelime.charAt(i);
            if (kelime.indexOf(harf) != kelime.lastIndexOf(harf)) {

                System.out.print(harf);
            }
        }
    }
}



/*      1. Yol:
        String s = "accessories";
        String d = "";
        for(Integer i=0; i<s.length(); i++){
        String c = s.substring(i,i+1);
        if(s.indexOf(c)!=s.lastIndexOf(c)){
        if(!d.contains(c)){
        d = d + c;
        }
        }
        }
        System.out.println(d);


        2. Yol:
        String s = "accessories";
        String d = "";
        Integer i=0;
        while(i<s.length()){
        String c = s.substring(i,i+1);
        if(s.indexOf(c)!=s.lastIndexOf(c)){
        if(!d.contains(c)){
        d = d + c;
        }
        }
        i++;
        }
        System.out.println(d);


        3. Yol:

        String s = "accessories";
        String d = "";
        Integer i=0;
        do{
        String c = s.substring(i,i+1);
        if(s.indexOf(c)!=s.lastIndexOf(c)){
        if(!d.contains(c)){
        d = d + c;
        }
        }
        i++;
        }while(i<s.length());
        System.out.println(d);


                                                */
