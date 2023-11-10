package InheritansExam;

public class Asistan extends Akademisyen{
    private String ofisSaati;
    public Asistan(String adSoyad, String mpNo, String ePosta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, mpNo, ePosta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(" Öğrencilere quiz yapıldı.");
    }
}
