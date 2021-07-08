import java.util.ArrayList;

public class Penjualan {
    Kasir kasir;
    Barang barang;
    Pelanggan pelanggan;
    int barangbeli;

    public Penjualan(Kasir kassa1, ArrayList<Barang> barang2, Pelanggan pelanggan2) {
    }
    

    public Penjualan(Kasir kasir, Barang barang, Pelanggan pelanggan) {
        this.kasir = kasir;
        this.barang = barang;
        this.pelanggan = pelanggan;
    }


    public Kasir getKasir() {
        return this.kasir;
    }

    public void setKasir(Kasir kasir) {
        this.kasir = kasir;
    }

    public Barang getBarang() {
        return this.barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Pelanggan getPelanggan() {
        return this.pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public int getBarangbeli() {
        return this.barangbeli;
    }

    public int setBarangbeli(int barangbeli) {
        return this.barangbeli = barangbeli;
    }
    
    public int total(){
        int total = getBarangbeli()*barang.getHarga();
        return total;
    }
    public int bayar(){
        int bayar = total() - pelanggan.diskon();
        return bayar;
    }
    @Override
    public String toString() {
        return 
            "ID Number          =  " + kasir.getID() + "\n" +
            "Kasir              =  " + kasir.getNama() + "\n" +
            "Nama pelanggan     =  " + pelanggan.getNama() + "\n" +
            "Member pelanggan   =  " + pelanggan.getMember() + "\n" +
            "Barang             =  " + barang.getNamabarang() + "\n" +
            "Jumlah Barang      =  " + getBarangbeli() + "\n" +
            "Total harga        =  " + total() + "\n"+
            "Total bayar        =  " + bayar() + "\n"
            ;
    }

    
    public int update(){
        int sisa = barang.getJumlahbarang() - getBarangbeli();
        return sisa;
    }    

    public String tampilsisa(){
        return 
        "Kode Barang        : " + barang.getKodebarang() + "\n"+
        "Nama Barang        : " + barang.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update() + "\n"
        ;
    }

}

