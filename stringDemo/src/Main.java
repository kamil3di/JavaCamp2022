import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Merhabalar herkese!";

        char[] karakterler = new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("rh"));
    }
}