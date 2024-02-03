
public class Main {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Yusuf", "Kayaoglu", new int[]{80, 85, 90});
        Ogrenci ogrenci2 = new Ogrenci("Zehra", "Kayaoglu", new int[]{75, 88, 92});
        Ogrenci ogrenci3 = new Ogrenci("Ercan", "Kayaoglu", new int[]{95, 90, 85});


        Ogrenci[] ogrenciler = {ogrenci1, ogrenci2, ogrenci3};

        tumOgrenciBilgileri(ogrenciler);
    }

    public static void tumOgrenciBilgileri(Ogrenci[] ogrenciDizisi) {
        for (int i = 0; i < ogrenciDizisi.length; i++) {
            ogrenciDizisi[i].bilgileriGoster();
        }
    }

    }
