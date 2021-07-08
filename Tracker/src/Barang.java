public class Barang{
        String kodebarang;
        String namabarang;
        int jumlahbarang;
        int harga;
    

    public Barang() {
    }

    public Barang(String kodebarang, String namabarang, int jumlahbarang, int harga) {
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;
        this.jumlahbarang = jumlahbarang;
        this.harga = harga;
    }
    

    public String getKodebarang(){
        return this.kodebarang;
    }
    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNamabarang() {
        return this.namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getJumlahbarang() {
        return this.jumlahbarang;
    }

    public void setJumlahbarang(int jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return 
            "Kode Barang            = " + getKodebarang() + "\n" +
            "Nama Barang            = " + getNamabarang() + "\n" +
            "Jumlah Barang          = " + getJumlahbarang() + " /pcs"+"\n" +
            "Harga Barang           = " + getHarga() + "\n" 
            ;
    }

    public String databrg(){
        return
        "\t\t" + getKodebarang() + "\t\t\t\t" + getNamabarang() + "\t\t\t" + getJumlahbarang() + "\t\t\t" + getHarga() + "\t" 
        ;
    }

}