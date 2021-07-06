import java.util.Scanner;

public class App {
    static Scanner inputdata = new Scanner(System.in);
    static Barang barang = new Barang();
    static Kasir kassa1 = new Kasir();
    static Pelanggan pelanggan = new Pelanggan();
    static Tstok stok = new Tstok();
    static Penjualan penjual = new Penjualan(kassa1, barang, pelanggan);
    static CekKasir cek = new CekKasir();
    static CekPembeli cekPembeli = new CekPembeli();

    static Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
    static Kasir kassa2 = new Kasir("KS0097", "Yerin");
    static Pelanggan pelanggan1 = new Pelanggan("PL0012","Yuna", "Gold");
    static Penjualan penjual1 = new Penjualan(kassa2, barang1, pelanggan1);
    public static void main(String[] args) throws Exception {

        // cekkaryawan();
        
        initkaryawan();
        System.out.println("===============================");
        initpembeli();
        System.out.println("===============================");
        initbarang();
        System.out.println("===============================");
        // char ans = 'n';
        System.out.println("            Isi data karyawan           ");
        datakaryawan();
        System.out.println(kassa1.tampilkansemuadata());
        System.out.println("-----------------------------------");
        System.out.println("            Isi data barang           ");
        datab();
        System.out.println("-----------------------------------");
        System.out.println("            Isi Data Pembeli            ");
        datapembeli();
        System.out.println("-----------------------------------");
        

       
        System.out.println(barang.getNamabarang() + " = " + barang.getHarga());
        
        System.out.print("Jumlah beli     : ");
        int jumlahbarang = inputdata.nextInt();
        
        
        int beli = penjual.setBarangbeli(jumlahbarang);
        int totalharga = barang.getHarga() * beli;
        int dsk = pelanggan.diskon();
        int dis = totalharga - dsk;
        System.out.println("Total harga     : " + totalharga);
        System.out.println("Total Bayar     : " + dis);
        System.out.println("---------- Welcome To Sohee Store ----------");
        System.out.println(penjual.toString());


        System.out.println("-------------------------------------------");
        System.out.println(penjual.tampilsisa());
        // System.out.println("-------------------------------------------");
        // penjual.setBarang(barang);
        // penjual.setKasir(kassa1);
        // penjual.setPelanggan(pelanggan);
    }
        
        // System.out.println(penjual.toString());
        // System.out.println(tampilkansisa());


     
    //     do{
    //         menu();
    //         int chs = inputdata.nextInt();
    //         if (chs ==1){
    //             datakaryawan();
    //             kassa1.tampilkansemuadata();
    //         }
    //         else if(chs==2){
    //             datab();
    //         }
    //         else if(chs==3){
    //             datapembeli();
    //         }

    //     }while(ans == 'y' || ans == 'Y');

    // }


    public static void menu(){
        System.out.println(" ----------- Welcome To SOHEE Store ----------- ");
        System.out.println("                   MENU UTAMA                   ");
        System.out.println("------------------------------------------------");
        System.out.println("1. Tambah Data Karyawan");
        System.out.println("2. Tambah Data Barang");
        System.out.println("3. Tambah Data Pelanggan");
        System.out.println("4. Cek Data Karyawan");
        System.out.println("5. Cek Data Barang");
        System.out.println("6. Cek Data Pelanggan");
        System.out.println("7. Isi Data....");
        System.out.println("0. Exit");
    }

    // public static int update(){
    //     int sisa = barang1.getJumlahbarang()-penjual1.getBarangbeli();
    //     return sisa;
    // }

    //  public static String tampilkansisa(){
    //     return 
    //         "Kode Barang          = " + barang1.getKodebarang() + "\n" +
    //         "Nama Barang          = " + barang1.getNamabarang() + "\n" +
    //         "Jumlah Barang        = " + update() +"\n" 
    //         ;
    // }


    public static void show() {
        Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
        Barang barang2 = new Barang("KB002", "Lightstick", 110, 130000);
        Barang barang3 = new Barang("KB003", "Poster", 100, 35000);
        System.out.println("pilih barang yang ingin dibeli :");
        System.out.println("1. Photocard");
        System.out.println("2. Lightstick");
        System.out.println("3. Poster");
        System.out.print("Pilih ? ");
        int c = inputdata.nextInt();
    
        if(c==1){
            System.out.println("Harga Barang    : " + barang1.getHarga());
            System.out.print("Jumlah beli     : ");
            int jumlahbarang = inputdata.nextInt();
            int beli = penjual.setBarangbeli(jumlahbarang);
            int totalharga = barang1.getHarga() * beli;
            int dsk = pelanggan.diskon();
            int dis = totalharga - dsk;
            System.out.println("Total harga     : " + totalharga);
            System.out.println("Total Bayar     : " + dis);
    
        }
        else if (c==2){
            System.out.println("Harga Barang    : " + barang2.getHarga());
            System.out.print("Jumlah beli     : ");
            int jumlahbarang = inputdata.nextInt();
            int beli = penjual.setBarangbeli(jumlahbarang);
            int totalharga = barang2.getHarga() * beli;
            int dsk = pelanggan.diskon();
            int dis = totalharga - dsk;
            System.out.println("Total harga     : " + totalharga);
            System.out.println("Total Bayar     : " + dis);
        }
        else if(c==3){
            System.out.println("Harga Barang    : " + barang3.getHarga());
            System.out.print("Jumlah beli     : ");
            int jumlahbarang = inputdata.nextInt();
            int beli = penjual.setBarangbeli(jumlahbarang);
            int totalharga = barang3.getHarga() * beli;
            int dsk = pelanggan.diskon();
            int dis = totalharga - dsk;
            System.out.println("Total harga     : " + totalharga);
            System.out.println("Total Bayar     : " + dis); 
        }
    }


    static void initbarang(){
        Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
        Barang barang2 = new Barang("KB002", "Lightstick", 110, 130000);
        Barang barang3 = new Barang("KB003", "  Poster  ", 100, 35000);
        stok.tambah(barang1);
        stok.tambah(barang2);
        stok.tambah(barang3);
        stok.tampilkan();
    }
    
    public static void datab() {
        inputdata.nextLine();
        System.out.print("Kode Barang       : " );
        String kodebarang = inputdata.nextLine();
        System.out.print("Nama Barang       : " );
        String namabarang = inputdata.nextLine();
        System.out.print("Jumlah Barang     : " );
        int jumlahbarang = inputdata.nextInt();
        System.out.print("Harga Barang      : " );
        int hargabarang = inputdata.nextInt();
        barang.setKodebarang(kodebarang);
        barang.setNamabarang(namabarang);
        barang.setJumlahbarang(jumlahbarang);
        barang.setHarga(hargabarang);
        stok.menambahbarang(barang);
    }

    public static void datakaryawan(){
        System.out.print("ID Number         :  ");
        String id = inputdata.nextLine();
        System.out.print("Nama              :  ");
        String nama = inputdata.nextLine();
        System.out.print("Jenis Kelamin     :  ");
        String jenk = inputdata.nextLine();
        System.out.print("No Telpon         :  ");
        int notel = inputdata.nextInt();
        inputdata.nextLine();
        System.out.print("Alamat            :  ");
        String alamat = inputdata.nextLine();
        System.out.print("Jumlah jam        :  ");
        int jam = inputdata.nextInt();
        
        kassa1.setID(id);
        kassa1.setNama(nama);
        kassa1.setJeniskelamin(jenk);
        kassa1.setNotelp(notel);
        kassa1.setAlamat(alamat);
        kassa1.setJamkerja(jam);  
        
    }

    public static void initkaryawan(){
        Kasir kassa3 = new Kasir("KS001", "Eunbi", "Wanita", 30051997, "Orchid", 5 , 125000 );
        Kasir kassa4 = new Kasir("KS002", "Yeri", "Wanita", 50319999, "Rose", 10 , 250000 );
        Kasir kassa5 = new Kasir("KS003", "Jay", "Pria", 20042002, "Lily", 11 , 275000 );
        cek.cekkasir(kassa3);
        cek.cekkasir(kassa4);
        cek.cekkasir(kassa5);
        cek.tampilkan();

    }

    public static void datapembeli() {
        inputdata.nextLine();
        System.out.print("ID Number         :  ");
        String id = inputdata.nextLine();
        System.out.print("Nama              :  ");
        String nama = inputdata.nextLine();
        System.out.print("Jenis Kelamin     :  ");
        String jenk = inputdata.nextLine();
        System.out.print("No Telpon         :  ");
        int notel = inputdata.nextInt();
        inputdata.nextLine();
        System.out.print("Alamat            :  ");
        String alamat = inputdata.nextLine();
        System.out.println("Silver" +"\t\t+\t" + "Gold"+"\t\t+\t" + "Platinum");
        System.out.print("Loyalty           :  ");
        String loyal = inputdata.nextLine();

        pelanggan.setID(id);
        pelanggan.setNama(nama);
        pelanggan.setJeniskelamin(jenk);
        pelanggan.setNotelp(notel);
        pelanggan.setAlamat(alamat);
        pelanggan.setMember(loyal);

        // System.out.println("---------------------------------------");
        System.out.println(pelanggan.tampil());
    }

    public static void initpembeli(){
        Pelanggan pelanggan2 = new Pelanggan("CT009", "Kim", "Pria", 30121995, "Busan", "Platinum");
        Pelanggan pelanggan3 = new Pelanggan("CT010", "Choi", "Pria", 51202000, "Almond", "Gold");
        Pelanggan pelanggan4 = new Pelanggan("CT011", "Na", "Pria", 13082000, "Tukki", "Silver");
        cekPembeli.cekcustomer(pelanggan2);
        cekPembeli.cekcustomer(pelanggan3);
        cekPembeli.cekcustomer(pelanggan4);
        cekPembeli.tampilkan();
    }
}
