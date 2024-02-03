public class Ogrenci {
    String ad;
    String soyad;

    int[] notlar;

    public Ogrenci(String ad, String soyad, int[] notlar) {
        this.ad = ad;
        this.soyad = soyad;
        this.notlar = notlar;
    }

    public void ortHesapla(int[] notlar) {
        int toplam=0;

        for (int i = 0; i < notlar.length; i++) {

            toplam += notlar[i];
            System.out.println((i+1)+".not = "+notlar[i]);

        }
        System.out.printf("Ortalama:%.2f\n",(double)toplam/notlar.length);



    }
}