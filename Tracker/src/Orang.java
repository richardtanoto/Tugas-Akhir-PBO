public class Orang {
    String ID;
    String nama;
    String jeniskelamin;
    int notelp;
    String alamat;


    public Orang() {
    }


    public Orang(String ID, String nama, String jeniskelamin, int notelp, String alamat) {
        this.ID = ID;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.alamat = alamat;
    }


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return this.jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public int getNotelp() {
        return this.notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}