package loops;

public class Loops3 {
    public static void main(String[] args) {
//        Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
//        aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

   String str = "madam";
   String pal = "";
   for(int i= str.length()-1; i>-1; i--){
       char ch = str.charAt(i);
       pal = pal + ch;
   }
        if (str.equals(pal)) {

            System.out.println("Palindromdur");

        }else{
            System.out.println("Palindrom degildir");
        }


    }



}
 /*          String s = "runnur";
            String r = "";
        for(Integer i=s.length()-1; i>-1; i--){
        String c = s.substring(i,i+1);
        r = r + c;
        }
        if(s.equals(r)){
        System.out.println(s + " palindromdur");
        }else{
        System.out.println(s + " palindrom degildir");
        }
        2. Yol:
        String s = "runnur";
        String r = "";
        Integer i=s.length()-1;
        while(i>-1){
        String c = s.substring(i,i+1);
        r = r + c;
        i--;
        }
        if(s.equals(r)){
        System.out.println(s + " palindromdur");
        }else{
        System.out.println(s + " palindrom degildir");
        }
        3. Yol:
        String s = "runnur";
        String r = "";
        Integer i=s.length()-1;
        do{
        String c = s.substring(i,i+1);
        r = r + c;
        i--;
        }while(i>-1);
        if(s.equals(r)){
        System.out.println(s + " palindromdur");
        }else{
        System.out.println(s + " palindrom degildir");
        }




  */