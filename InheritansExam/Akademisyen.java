package InheritansExam;

public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;
    public Akademisyen(String adSoyad,String mpNo,String ePosta,String bolum,String unvan){
        super(adSoyad,mpNo,ePosta);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad()+" derse giriş yaptı.");
    }
}
