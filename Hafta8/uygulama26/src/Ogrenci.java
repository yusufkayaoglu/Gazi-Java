class Ogrenci {
    private String ad;
    private String soyad;
    private int[] notlar;

    public Ogrenci(String ad, String soyad, int[] notlar) {
        this.ad = ad;
        this.soyad = soyad;
        this.notlar = notlar;
    }

    public void bilgileriGoster() {
        System.out.print("Adı: " + ad + "\nSoyadı: " + soyad + "\nNotları: ");

        for (int i = 0; i < notlar.length; i++) {
            System.out.print(notlar[i]+" ");

        }
        System.out.println();

    }
}

