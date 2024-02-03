public class Müşteri {
    private String ad;
    private String soyad;
    private String email;
    private String telefon;

    public Müşteri(String ad, String soyad, String email, String telefon) {

        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefon = telefon;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void bilgileri_göster() {
        System.out.println("İsim:  "+ad);
        System.out.println("İsim:  "+soyad);
        System.out.println("İsim:  "+email);
        System.out.println("İsim:  "+telefon);
    }


}
