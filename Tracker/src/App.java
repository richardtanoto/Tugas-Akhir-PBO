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
                    initpembeli();
                }
                else if(chs == 7){
                    n=false;
                    Showdata.kassa1.tampil();
                    Showdata.show();
                }
                else if(chs == 8){
                    n=false;
                    initbill();
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

    public static void pembeli() {
        try {
            boolean a = true;
            while(a){
                System.out.print("Nama Pelanggan       : " );
                String n = inputdata.nextLine();
                if(n.length() >=3 ){
                    pelanggan.setNama(n);
                    a = false;
                }
                else if(n.length()<3){
                    System.out.println("Minimal 3 karakter !");
                }
                else{
                    System.out.println("Anda wajib menginput Nama!");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid !");
        }
        try {
            boolean d =true;
            while(d){    
                System.out.println("                Pilih Loyalty                    \n");
                System.out.println("Silver" + "\t\t\t" + "Gold"+ "\t\t\t" + "Platinum" + "\t\t\t" + "Not Member");
                System.out.print("Loyalty           :  ");
                String loyal = inputdata.nextLine();
                String loyalty = loyal.toLowerCase();
                if(loyalty.equals("silver") || loyalty.equals("gold") ||loyalty.equals("platinum")){
                    pelanggan.setMember(loyal);
                    System.out.println("Hello Member Sohee\n" + "Your member is " + loyalty + " right now...");
                    System.out.println("data : " +pelanggan.getMember());
                    d=false;
                }
                
                else if (loyalty.equals("not member")){
                    pelanggan.setMember(loyal);
                    System.out.println("Not a member... :)");
                    d=false;
                }
                else{
                    System.out.println("Pilih diantara loyalty!");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Data Tidak Valid !");
        }
    }
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
        System.out.println("7. Barang Beli");
        System.out.println("8. History");
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
