import java.util.ArrayList;
import java.util.List;

interface KitapIslemleri {
    void oduncAl(String kullaniciAdi);
    void iadeEt();
    void kitapAra(String kitapAdi);
}
interface KullaniciIslemleri {
    void kullaniciEkle(Uye uye);
    void kullaniciSil(String kullaniciAdi);
    void kullaniciGuncelle(Uye uye);
    void kullaniciGetir();
}
abstract class Kisi {
    private String ad;
    private String soyad;

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Kisi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }
}
class Yazar extends Kisi {
    public Yazar(String ad, String soyad) {
        super(ad, soyad);
    }

}
class Kitap implements KitapIslemleri {
    private String kitapAdi;
    private Yazar yazar;
    private boolean oduncDurumu;
    public Kitap(String kitapAdi, Yazar yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.oduncDurumu = false;
    }
    @Override
    public void oduncAl(String kullaniciAdi) {
        if (!oduncDurumu) {
            System.out.println(yazar.getAd()+" "+yazar.getSoyad()+"'ın "+kitapAdi + " kitabı " + kullaniciAdi + " tarafından ödünç alındı.");
            oduncDurumu = true;
        } else {
            System.out.println("Bu kitap şu anda ödünç alınmış durumda.");
        }
    }
    @Override
    public void iadeEt() {
        if (oduncDurumu) {
            System.out.println(kitapAdi + " kitabı iade edildi.");
            oduncDurumu = false;
        } else {
            System.out.println("Bu kitap zaten ödünç alınmamış durumda.");
        }
    }
    @Override
    public void kitapAra(String arananKitapAdi) {
        if (kitapAdi.toLowerCase().contains(arananKitapAdi.toLowerCase())) {
            System.out.println("Kitap bulundu: " + kitapAdi);
        } else {
            System.out.println("Kitap bulunamadı: " + arananKitapAdi);
        }
    }
}
class Uye extends Kisi {
    private String kullaniciAdi;
    public Uye(String ad, String soyad, String kullaniciAdi) {
        super(ad, soyad);
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
}
class KullaniciIslemleriImp implements KullaniciIslemleri {
    private List<Uye> uyeler = new ArrayList<>();
    @Override
    public void kullaniciEkle(Uye uye) {
        uyeler.add(uye);
        System.out.println(uye.getAd() + " kullanıcısı eklendi.");
    }
    @Override
    public void kullaniciSil(String kullaniciAdi) {
        for (Uye uye : uyeler) {
            if (uye.getKullaniciAdi().equals(kullaniciAdi)) {
                uyeler.remove(uye);
                System.out.println(uye.getAd() + " kullanıcısı silindi.");
                return;
            }
        }
        System.out.println("Kullanıcı bulunamadı: " + kullaniciAdi);
    }
    @Override
    public void kullaniciGuncelle(Uye updatedUser) {
        for (Uye uye : uyeler) {
            if (uye.getKullaniciAdi().equals(updatedUser.getKullaniciAdi())) {
                uye.setAd(updatedUser.getAd());
                uye.setSoyad(updatedUser.getSoyad());
                uye.setKullaniciAdi(updatedUser.getKullaniciAdi());
                System.out.println(uye.getAd() + " kullanıcısı güncellendi.");
                return;
            }
        }
        System.out.println("Kullanıcı bulunamadı: " + updatedUser.getKullaniciAdi());
    }
    @Override
    public void kullaniciGetir() {
        System.out.println("Mevcut Kullanıcılar: ");
        for (Uye uye : uyeler) {
            System.out.println(uye.getAd() + " - " + uye.getKullaniciAdi());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Yazar yazar1 = new Yazar("Yasar", "Kemal");
        Kitap kitap1 = new Kitap("Ince Memed", yazar1);
        Yazar yazar2 = new Yazar("Ahmet", "Ümit");
        Kitap kitap2 = new Kitap("Beyoglu Rapsodisi", yazar2);
        Uye uye1 = new Uye("Yusuf", "Kayaoglu", "yusuf_kayaoglu");
        KitapIslemleri kitapIslemleri = kitap1;
        kitapIslemleri.oduncAl(uye1.getKullaniciAdi());
        kitapIslemleri.iadeEt();
        kitapIslemleri.kitapAra("Ince Memed");
        KitapIslemleri kitapIslemleri2 = kitap2;
        kitapIslemleri2.oduncAl(uye1.getKullaniciAdi());
        KullaniciIslemleri kullaniciIslemleri = new KullaniciIslemleriImp();
        Uye uye2 = new Uye("Ali", "Kayaoglu", "ali_kayaoglu");
        kullaniciIslemleri.kullaniciEkle(uye1);
        kullaniciIslemleri.kullaniciEkle(uye2);
        kullaniciIslemleri.kullaniciGetir();
        Uye updatedUser = new Uye("Yusuf", "Kayaoglu", "yusuf_kayaoglu_updated");
        kullaniciIslemleri.kullaniciGuncelle(updatedUser);
        kullaniciIslemleri.kullaniciGetir();
        kullaniciIslemleri.kullaniciSil(uye1.getKullaniciAdi());
        kullaniciIslemleri.kullaniciGetir();




    }
}
