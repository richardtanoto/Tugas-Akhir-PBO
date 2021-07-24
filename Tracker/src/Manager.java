public class Manager extends Orang{
    int jmkerja;
    int gaji = 5000;
    static int a = 2500000;
    public Manager() {
    }

    public Manager(String nama , int notelp) {
        this.nama = nama;
        this.notelp = notelp;
    }

    public Manager(String ID , String nama , String jeniskelamin , int notelp ,String alamat , int jmkerja , int gaji){
        this.ID = ID;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.alamat = alamat;
        this.jmkerja = jmkerja;
        this.gaji = gaji;
    }
    
    public int getjmkerja() {
        return this.jmkerja;
    }

    public void setjmkerja(int jmkerja) {
        this.jmkerja = jmkerja;
    }

    public int getGaji() {
        return this.gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public String tampil() {
        return 
        "ID Number          = " + getID() + "\n" +
        "Nama               = " + getNama() + "\n" 
        ;
    }

    public String tampilkansemuadata(){
        return 
            "\n" +
            "ID Number          = " + getID() + "\n" +
            "Nama               = " + getNama() + "\n" +
            "Jenis Kelamin      = " + getJeniskelamin() + "\n" +
            "No Telpon          = " + getNotelp() + "\n" +
            "Alamat             = " + getAlamat() + "\n" +
            "Jumlah jam kerja   = " + getjmkerja() + "\n" +
            "Gaji               = " + totalgaji(getjmkerja()*getGaji() , 2500000)+ "\n"
            ;
    }

    // method menghitung total gaji yang diinput pada datamanager
    // manager mendapat uang tambahan ketika lembur 
    // jadi 1 jam diberi 5000 
    // gaji tetap manager = Rp 2.500.000
    // jadi tinggi gaji tergantung berapa jam manager bekerja 
    int totalgaji(int g , int a) {
        g = getjmkerja()*getGaji();
        int total = g+a;
        return total;
        
    }

    // untuk cetak init jika menggunakan method total gaji value akan double
    int akhir(){
        int b = 3000*getjmkerja();
        int c = b+getGaji();
        return c;
    }

    public String dataka(){
        return
        "\t\t" + getID() + "\t\t\t" + getNama() + "\t\t" + getJeniskelamin() + "\t\t\t" + getNotelp() + "\t" +
        getAlamat() + "\t\t" +getjmkerja() + "\t\t\t\t" + akhir();
    }
}
