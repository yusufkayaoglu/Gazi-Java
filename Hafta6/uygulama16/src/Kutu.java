public class Kutu {
    public int uzunluk;
    public int genişlik;
    public int yükseklik;
    public Kutu(int uzunluk,int yükseklik,int genişlik){
        this.yükseklik=yükseklik;
        this.genişlik=genişlik;
        this.uzunluk=uzunluk;
    }
    public void hacim_yazdır(){
        int hacim = (yükseklik*genişlik*yükseklik);
        System.out.println("Hacim "+hacim);
    }
}
