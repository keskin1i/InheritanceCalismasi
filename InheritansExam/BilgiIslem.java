package InheritansExam;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String adSoyad, String mpNo, String ePosta, String departman, String mesai, String gorev) {
        super(adSoyad, mpNo, ePosta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public  void networkKurulum(){
        System.out.println("Ağ kurulumları yağıldı.");
    }
}
