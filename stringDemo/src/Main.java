public class Main {
    public static void main(String[] args) {
        //Common string variable
        String mesaj = "Merhabalar herkese!";

        //First lesson's notes
/*      char[] karakterler = new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("rh"));*/

        //Second lesson's notes
        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(0,10));
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
    }
}