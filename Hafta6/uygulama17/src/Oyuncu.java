public class Oyuncu {
    public String isim;
    public int seviye;
    public int puan;
    public Oyuncu(String isim, int seviye, int puan) {
        this.isim = isim;
        this.seviye = seviye;
        this.puan = puan;
    }
    public void bilgileri_göster(){
        System.out.println("Oyuncunun isimi : "+isim);
        System.out.println("Oyuncunun seviyesi : "+seviye);
        System.out.println("Oyuncunun puanı : "+puan);
    }
}
