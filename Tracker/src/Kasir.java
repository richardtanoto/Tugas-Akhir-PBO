public class Kasir extends Orang {
    int gaji = 25000;
    int jamkerja;
    static int i = 1;
    public Kasir() {
    }


    public Kasir(String ID , String nama ) {
        this.ID = ID;
        this.nama = nama;
    }

    public Kasir(String ID , String nama , String jeniskelamin , int notelp ,String alamat , int jamkerja , int gaji){
        this.ID = ID;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.alamat = alamat;
        this.jamkerja = jamkerja;
        this.gaji = gaji;
    }

    public int getGaji() {
        return this.gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getJamkerja() {
        return this.jamkerja;
    }

    public void setJamkerja(int jamkerja) {
        this.jamkerja = jamkerja;
    }

    public String tampil() {
        return 
        "ID Number          = " + getID() + "\n" +
        "Nama               = " + getNama() + "\n" 
        ;
    }

    public String tampilkansemuadata(){
        return 
            "ID Number          = " + getID() + "\n" +
            "Nama               = " + getNama() + "\n" +
            "Jenis Kelamin      = " + getJeniskelamin() + "\n" +
            "No Telpon          = " + getNotelp() + "\n" +
            "Alamat             = " + getAlamat() + "\n" +
            "Jumlah jam kerja   = " + getJamkerja() + "\n" +
            "Gaji               = " + getJamkerja()*getGaji()+ "\n"
            ;
    }
    
    public String dataka(){
        return
        "\t\t" + getID() + "\t\t\t" + getNama() + "\t\t" + getJeniskelamin() + "\t\t\t" + getNotelp() + "\t" +
        getAlamat() + "\t\t" +getJamkerja() + "\t\t\t\t" + getJamkerja()*getGaji();
    }
   
}
