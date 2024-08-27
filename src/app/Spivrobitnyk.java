package app;

public class Spivrobitnyk {

    private String pib;
    private String posada;
    private String email;
    private String telefon;
    private int vik;

    public Spivrobitnyk(String pib, String posada, String email, String telefon, int vik) {
        this.pib = pib;
        this.posada = posada;
        this.email = email;
        this.telefon = telefon;
        this.vik = vik;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }
}


