import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner inputdata = new Scanner(System.in);
    static Barang barang = new Barang();
    static Kasir kassa1 = new Kasir();
    static Pelanggan pelanggan = new Pelanggan();
    static Tstok stok = new Tstok();
    static Penjualan penjual = new Penjualan(kassa1, barang, pelanggan);
    static CekKasir cek = new CekKasir();
    static Cekkurir cekurir = new Cekkurir();
    static Ceksatpam cesatpam = new Ceksatpam();
    static CekPembeli cekPembeli = new CekPembeli();
    static Cekongkir ong = new Cekongkir();
    static ArrayList<Kurir> kurirb = new ArrayList<Kurir>();
    static ArrayList<Satpam> satpamb = new ArrayList<Satpam>();

    public static void main(String[] args) throws Exception {
        
        char ans ='n';
        do{
            boolean n = true;
            while(n){
                menu();
                
                int chs = inputdata.nextInt();
                if (chs ==1){
                    n=false;
                    Datakasir.datakaryawan();
                    initkaryawan();
                    break;
                }
                else if(chs==2){
                    n=false;
                    Showdata.datab();
                    initbarang();
                }
                else if(chs==3){
                    n=false;
                    Datapembeli.datapembeli();
                    initpembeli();
                }
                else if(chs == 4){
                    n=false;
                    initkaryawan();
                }
                else if(chs == 5){
                    n=false;
                    initbarang();
                }
                else if(chs == 6){
                    n=false;
                    Caripelanggan.pilih();
                    initpembeli();
                }
                else if(chs == 7){
                    n=false;
                    initkurirr();
                }
                else if(chs == 8){
                    n=false;
                    Showdata.kassa1.tampil();
                    Showdata.menupilih();
                }
                else if(chs ==9){
                    n=false;
                    initbill();

                }
                else if(chs == 10){
                    n=false;
                    initkurir();
                    Tulisdata.writen(kurirb);
                }
                else if(chs ==11){
                    n=false;
                    Cekongkir.menu();
                    System.out.println(ong.toString());
                }
                else if(chs ==12){
                    n=false;
                    urutkurirr();
                }
                else if(chs == 13){
                    n=false;
                    DataKurir.datakurir();
                }
                else if(chs == 14){
                    n=false;
                    initsatpamm();
                }
                else if(chs ==15){
                    n=false;
                    urutsatpamm();
                }
                else if(chs == 16){
                    n=false;
                    DataSatpam.datasatpam();
                }
                else if(chs == 20){
                    n=false;
                    initsatpam();
                    Readnwrite.writen(satpamb);
                }
                else if(chs ==0){
                    n=false;
                    System.exit(0);
                }
                else{
                    System.out.println("Anda harus pilih diantara [0-7] !");
                }
            } 

            System.out.print("Ulangi [y/n] ? ");
            inputdata.nextLine();
            String yn = inputdata.nextLine();
            ans = yn.charAt(0);

        }while(ans == 'y' || ans == 'Y');
       
    }

    public static void menu(){
        System.out.println(" ----------- Welcome To SOHEE Store ----------- ");
        System.out.println("                   MENU UTAMA                   ");
        System.out.println("------------------------------------------------");
        System.out.println("1. Tambah Data Karyawan");
        System.out.println("2. Tambah Data Barang");
        System.out.println("3. Tambah Data Pelanggan");
        System.out.println("4. Cari Data Karyawan");
        System.out.println("5. Cek Data Barang");
        System.out.println("6. Cari Data Pelanggan");
        System.out.println("7. Cek Data Kurir");
        System.out.println("8. Barang Beli");
        System.out.println("9. History");
        System.out.println("10. Read and Write (Data Kurir)");
        System.out.println("11. Cek Ongkir");
        System.out.println("12. Urut Kurir");
        System.out.println("13. Tambah Data Kurir");
        System.out.println("14. Cek Data Satpam");
        System.out.println("15. Urut Satpam");
        System.out.println("16. Tambah Data Satpam");
        System.out.println("20.  Read and Write (Data Satpam)");
        System.out.println("0. Exit");
        System.out.print("Pilih     : ");
    }


    static void initbarang(){
        Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
        Barang barang2 = new Barang("KB002", "Lightstick", 110, 130000);
        Barang barang3 = new Barang("KB003", "  Poster  ", 100, 35000);
        stok.tambah(barang1);
        stok.tambah(barang2);
        stok.tambah(barang3);
        stok.tambah(Showdata.barang);
        stok.tampilkan();
    }
    
    public static void initkaryawan(){
        Kasir kassa3 = new Kasir("KS001", "Eunbi", "Wanita", 30051997, "Orchid", 5 , 25000 );
        Kasir kassa4 = new Kasir("KS002", "Yeri", "Wanita", 50319999, "Rose", 10 , 25000 );
        Kasir kassa5 = new Kasir("KS003", "Jay", "Pria", 20042002, "Lily", 11 , 25000 );
        cek.cekkasir(kassa3);
        cek.cekkasir(kassa4);
        cek.cekkasir(kassa5);
        cek.cekkasir(Datakasir.kassa1);
        cek.tampilkan();
    }

    public static void initpembeli(){
        Pelanggan pelanggan2 = new Pelanggan("CT009", "Kim", "Pria", 30121995, "Busan", "Platinum");
        Pelanggan pelanggan3 = new Pelanggan("CT010", "Choi", "Pria", 51202000, "Almond", "Gold");
        Pelanggan pelanggan4 = new Pelanggan("CT011", "Na", "Pria", 13082000, "Tukki", "Silver");
        cekPembeli.cekcustomer(pelanggan2);
        cekPembeli.cekcustomer(pelanggan3);
        cekPembeli.cekcustomer(pelanggan4);
        cekPembeli.cekcustomer(Datapembeli.pelanggan);
        cekPembeli.tampilkan();

    }
    public static void initkurir(){
        Kurir kurir1 = new Kurir("KR001","Zacky","pria",12093487, "Flower",120,2500000);
        Kurir kurir2 = new Kurir("KR002","Soobin","pria",56473829, "Memoria",150,2500000);
        Kurir kurir3 = new Kurir("KR003","Minho","pria",12093487, "Crossroad",90,2500000);
        Kurir kurir4 = new Kurir("KR004","Jackson","pria",12093487, "GlassBead",90,2500000);
        kurirb.add(kurir1);
        kurirb.add(kurir2);
        kurirb.add(kurir3);
        kurirb.add(kurir4);
        // untuk meread and write 
    }

    // menambahkan init data kurir mirip dengan init-init sebelumnya
    public static void initkurirr(){
        Kurir kurir1 = new Kurir("KR001","Zacky","pria",12093487, " Flower ",120,2500000);
        Kurir kurir2 = new Kurir("KR002","Soobin","pria",56473829," Memoria ",150,2500000);
        Kurir kurir3 = new Kurir("KR003","Minho","pria",12093487, "Crossroad",100,2500000);
        Kurir kurir4 = new Kurir("KR004","Jackson","pria",12093487,"GlassBead",190,2500000);
        cekurir.cekkurir(kurir1);
        cekurir.cekkurir(kurir2);
        cekurir.cekkurir(kurir3);
        cekurir.cekkurir(kurir4);
        cekurir.cekkurir(DataKurir.kurir);
        cekurir.tampilkan();
    }

    public static void urutkurirr() {
        Kurir kurir1 = new Kurir("KR001","Zacky","pria",12093487, "Flower",120,2860000);
        Kurir kurir2 = new Kurir("KR002","Soobin","pria",56473829, "Memoria",150,2950000);
        Kurir kurir3 = new Kurir("KR003","Minho","pria",12093487, "Crossroad",100,2800000);
        Kurir kurir4 = new Kurir("KR004","Jackson","pria",12093487, "GlassBead",90,2770000);
        
        //pengurutan data secara ascending berdasarkan nama kurir (a-z) dengan bubble sorting 
        String[] n = {kurir1.getNama(),kurir2.getNama(),kurir3.getNama(),kurir4.getNama()};
        String p;
        int z = 1;
        // mengerprint data awal sebelum diurutkan dengan pemanfaatan for
        System.out.println("Data Sebelum Diurutkan ");
        for(int i=0; i<n.length ; i++){
            System.out.println(z +". "+ n[i]);
            z += 1;
        }
        // data diurutkan dengan perulangan 
        for(int i=0; i<n.length-1; i++){
            for(int j=i; j<n.length ; j++){
                // disini terjadi pertukaran tempat dengan pemanfaatan compare
                if(n[i].compareTo(n[j])>0){
                    p = n[i];
                    n[i] = n[j];
                    n[j] = p;
                }
            }
        }
        // data berhasil diurutkan
        System.out.println("Data Setelah Diurutkan ");
        int a =1;
        for(int i =0; i<n.length; i++){
            System.out.println(a +". "+ n[i]);
            a += 1;
        }
    }
    public static void initsatpam(){
        Satpam satpam1 = new Satpam("SP001","Agus","pria",62765474, "Highbury ",120,2500000);
        Satpam satpam2 = new Satpam("SP002","Rudi","pria",62545777, "Victoria ",150,2500000);
        Satpam satpam3 = new Satpam("SP003","Kursi","pria",62666777,"Glazers  ",100,2500000);
        Satpam satpam4 = new Satpam("SP004","Jacky","pria",62088087,"Starry   ",200,2500000);
        satpamb.add(satpam1);
        satpamb.add(satpam2);
        satpamb.add(satpam3);
        satpamb.add(satpam4);
        // untuk meread and write 
    }

    // menambahkan init data satpam mirip dengan init-init sebelumnya
    public static void initsatpamm(){
        Satpam satpam1 = new Satpam("SP001","Agus","pria",62765474, "Highbury ",120,2500000);
        Satpam satpam2 = new Satpam("SP002","Rudi","pria",62545777, "Victoria ",150,2500000);
        Satpam satpam3 = new Satpam("SP003","Kursi","pria",62666777,"Glazers  ",100,2500000);
        Satpam satpam4 = new Satpam("SP004","Jacky","pria",62088087,"Starry   ",120,2500000);
        cesatpam.ceksatpam(satpam1);
        cesatpam.ceksatpam(satpam2);
        cesatpam.ceksatpam(satpam3);
        cesatpam.ceksatpam(satpam4);
        cesatpam.ceksatpam(DataSatpam.satpam);
        cesatpam.tampilkan();
    }

    public static void urutsatpamm() {
        Satpam satpam1 = new Satpam("SP001","Agus","pria",62765474, "Highbury ", 120 ,2860000);
        Satpam satpam2 = new Satpam("SP002","Rudi","pria",62545777, "Victoria ", 150 ,2950000);
        Satpam satpam3 = new Satpam("SP003","Kursi","pria",62666777,"Glazers  ", 100 ,2800000);
        Satpam satpam4 = new Satpam("SP004","Jacky","pria",62088087,"Starry   ", 120 ,2860000);
        
        //pengurutan data secara ascending berdasarkan nama satpam (a-z) dengan bubble sorting 
        String[] n = {satpam1.getNama(),satpam2.getNama(),satpam3.getNama(),satpam4.getNama()};
        String p;
        int z = 1;
        // print data awal sebelum diurutkan dengan pemanfaatan for
        System.out.println("Data Sebelum Diurutkan ");
        for(int i=0; i<n.length ; i++){
            System.out.println(z +". "+ n[i]);
            z += 1;
        }
        // data diurutkan dengan perulangan 
        for(int i=0; i<n.length-1; i++){
            for(int j=i; j<n.length ; j++){
                // disini terjadi pertukarandengan compare
                if(n[i].compareTo(n[j])>0){
                    p = n[i];
                    n[i] = n[j];
                    n[j] = p;
                }
            }
        }
        // data berhasil diurutkan
        System.out.println("Data Setelah Diurutkan ");
        int a =1;
        for(int i =0; i<n.length; i++){
            System.out.println(a +". "+ n[i]);
            a += 1;
        }
    }

    public static void initbill(){
        Kasir kassa6 = new  Kasir("KS001", "Eunbi");
        Pelanggan pelanggan2 = new Pelanggan("CT009", "Kim", "Platinum");
        Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
        Penjualan penjualan1 = new Penjualan(kassa6, barang1, pelanggan2);
        penjualan1.setBarangbeli(3);

        System.out.println(penjualan1.toString());
        System.out.println(penjualan1.tampilsisa());
    }

}
