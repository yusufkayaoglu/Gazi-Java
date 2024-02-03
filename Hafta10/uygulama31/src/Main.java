import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
class Dateinfo{
    private int year,mounth,day,hour,minute;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMounth() {
        return mounth;
    }
    public void setMounth(int mounth) {
        this.mounth = mounth;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public Dateinfo(int year, int mounth, int day, int hour, int minute){
        this.year = year;
        this.mounth = mounth;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }
    public String tarihString() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, mounth - 1);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);

        Date tarih = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        return sdf.format(tarih);
    }
    public String tarihString(String format) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, mounth - 1);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);

        Date tarih = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(tarih);
    }
}
public class Main {
    public static void main(String[] args) {
        Dateinfo dateinfo = new Dateinfo(2023,12,11,11,30);

        System.out.println("Tarih ve Saat: " + dateinfo.tarihString());
        System.out.println("Tarih : " + dateinfo.tarihString("dd/MM/yyyy"));
        System.out.println("Tarih : " + dateinfo.tarihString("MMMM dd, yyyy HH:mm"));

    }
}
