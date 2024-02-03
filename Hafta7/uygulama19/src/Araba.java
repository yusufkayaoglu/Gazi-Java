public class Araba {
    public String marka;
    public String  model;
    public int uretimYili;


    public static int sayac;
    public Araba(String marka,String model,int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.uretimYili=uretimYili;
        sayac++;
    }
}
