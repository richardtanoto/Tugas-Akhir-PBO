import java.util.ArrayList;

public class Tstok extends Barang{
    ArrayList<Barang> barangs = new ArrayList<Barang>();
    
    void tambah(Barang b){
        barangs.add(b);
    }

    void menambahbarang(Barang b){
        System.out.println("        Menambah Barang         ");
        tambah(b);
        tampilkan();
        b.databrg();
        System.out.println("Data Berhasil Ditambahkan !!!");
    }

    void tampilkan(){
        System.out.println("No" + "\t\t" + "Kode Barang" + "\t\t\t" + "Nama Barang" + "\t\t" + "Jumlah Barang" + "\t\t\t" + "Harga Barang" + "\t" );
        int i = 1;
        for (Barang barang : barangs) {
            System.out.print(i);
            System.out.println(barang.databrg());
            i+=1;
        }
    }
}
