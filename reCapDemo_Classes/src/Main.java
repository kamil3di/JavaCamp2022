public class Main {
    public static void main(String[] args) {
        int sayi1 = 30;
        int sayi2 = 15;

        DortIslem dortIslem = new DortIslem();

        int sayiTopla = dortIslem.Topla(sayi1, sayi2);
        System.out.println(sayi1 + " ile " + sayi2 + " toplami = " + sayiTopla);

        int sayiCikar = dortIslem.Cikar(sayi1, sayi2);
        System.out.println(sayi1 + " ile " + sayi2 + " farki = " + sayiCikar);

        int sayiBol = dortIslem.Bol(sayi1, sayi2);
        System.out.println(sayi1 + " ile " + sayi2 + " bolumu = " + sayiBol);

        int sayiCarp = dortIslem.Carp(sayi1, sayi2);
        System.out.println(sayi1 + " ile " + sayi2 + " carpimi = " + sayiCarp);
    }
}