package InheritansExam;

public class Calisan {
    private String adSoyad;
    private String mpNo;
    private String ePosta;

    public Calisan(String adSoyad, String mpNo, String ePosta) {
        this.adSoyad = adSoyad;
        this.mpNo = mpNo;
        this.ePosta = ePosta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " üniversiteye giriş yaptı.");
    }

    public void cikis() {
        System.out.println(this.adSoyad + " üniversiteden çıkış yaptı.");
    }

    public void yemekhane() {
        System.out.println(this.adSoyad + " yemekhaneye giriş yaptı.");
    }
}
