package InheritansExam;

public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyad, String mpNo, String ePosta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, mpNo, ePosta, bolum, unvan, ofisSaati);
    }
    public void lablaraGir(){
        System.out.println("Lab dersine giriş yapıldı.");
    }
    public void derseGir(){
        System.out.println("Derse giriş yapıldı.");
    }
}
