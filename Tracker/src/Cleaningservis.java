public class Cleaningservis extends Orang{
    int shift;
    int gaji = 3000;
    static int a = 2500000;
    public Cleaningservis() {
    }


    public Cleaningservis(String nama , int notelp ) {
        this.nama = nama;
        this.notelp = notelp;
    }

    public Cleaningservis(String ID , String nama , String jeniskelamin , int notelp ,String alamat , int shift , int gaji){
        this.ID = ID;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.alamat = alamat;
        this.shift = shift;
        this.gaji = gaji;
    }
    
    public int getShift() {
        return this.shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
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
            "Jumlah Shift       = " + getShift() + "\n" +
            "Gaji               = " + totalgaji(getShift()*getGaji() , 2500000)+ "\n"
            ;
    }

    // CleaningServis mendapat uang tambahan ketika masuk 1 shift yaitu 3000 
    // gaji tetap adalah Rp 2.500.000
    // jadi tinggi gaji tergantung berapa shift
    int totalgaji(int g , int a) {
        g = getShift()*getGaji();
        int total = g+a;
        return total;
        
    }

    // untuk cetak init jika menggunakan method total gaji value akan double
    int akhir(){
        int b = 3000*getShift();
        int c = b+getGaji();
        return c;
    }

    public String dataka(){
        return
        "\t\t" + getID() + "\t\t\t" + getNama() + "\t\t" + getJeniskelamin() + "\t\t\t" + getNotelp() + "\t" +
        getAlamat() + "\t\t" +getShift() + "\t\t" + akhir();
    }
}