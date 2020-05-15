package Model;

public class Matakuliah {
    int IdMatakuliah;
    String namaMatakuliah;
    String singkatanMatakuliah;
    String namaDosen;
    String kontakDosen;
    boolean aktif;

    public Matakuliah(int idMatakuliah, String namaMatakuliah, String singkatanMatakuliah, String namaDosen, String kontakDosen, boolean aktif) {
        this.IdMatakuliah = idMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.singkatanMatakuliah = singkatanMatakuliah;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    public int getIdMatakuliah() {
        return idMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public String getSingkatanMatakuliah() {
        return singkatanMatakuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setIdMatakuliah(int idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public void setSingkatanMatakuliah(String singkatanMatakuliah) {
        this.singkatanMatakuliah = singkatanMatakuliah;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
