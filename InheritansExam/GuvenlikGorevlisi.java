package InheritansExam;

public class GuvenlikGorevlisi extends Memur{
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String mpNo, String ePosta, String departman, String mesai, String belge) {
        super(adSoyad, mpNo, ePosta, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    public void nobet(){
        System.out.println("Nöbet tutuldu.");
    }
}
