public class Sipariş {
    private int siparişId;
    private String ürünAdı;
    private int miktar;
    private double birimFiyat;

    public Sipariş(int siparişId, String ürünAdı, int miktar, double birimFiyat) {

        this.siparişId = siparişId;
        this.ürünAdı = ürünAdı;
        this.miktar = miktar;
        this.toplamFiyat = toplamFiyat;
    }
    public int getSiparişId() {
        return siparişId;
    }
    public void setSiparişId(int siparişId) {
        this.siparişId = siparişId;
    }
    public String getÜrünAdı() {
        return ürünAdı;
    }
    public void setÜrünAdı(String ürünAdı) {
        this.ürünAdı = ürünAdı;
    }
    public int getMiktar() {
        return miktar;
    }
    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }
    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }
    public double hesaplaToplamFiyat(setBirim) {



    }
}
