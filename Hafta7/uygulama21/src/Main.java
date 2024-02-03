// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[]ogrenci1_notlar={10,20,30};
        Ogrenci ogrenci = new Ogrenci("Yusuf","Kayaoglu",ogrenci1_notlar);
        System.out.println("Ad:"+ogrenci.ad+" Soyad:"+ogrenci.soyad);
        ogrenci.ortHesapla(ogrenci1_notlar);
        int[]ogrenci2_notlar={30,20,30};
        Ogrenci ogrenci1 = new Ogrenci("Burak","Kayaoglu",ogrenci1_notlar);
        System.out.println("Ad:"+ogrenci1.ad+" Soyad:"+ogrenci1.soyad);
        ogrenci.ortHesapla(ogrenci2_notlar);



    }
}