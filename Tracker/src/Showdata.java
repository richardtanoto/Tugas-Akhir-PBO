import java.util.InputMismatchException;
import java.util.Scanner;

public class Showdata  {
    static Scanner inputdata = new Scanner(System.in);
    static Barang barang = new Barang();
    static Kasir kassa1 = new Kasir("KS001", "Eunbi");
    static Pelanggan pelanggan = new Pelanggan();
    static Tstok stok = new Tstok();
    static Penjualan penjual = new Penjualan(kassa1, barang, pelanggan);
    static CekKasir cek = new CekKasir();
    static CekPembeli cekPembeli = new CekPembeli();
    static Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
    static Barang barang2 = new Barang("KB002", "Lightstick", 110, 130000);
    static Barang barang3 = new Barang("KB003", "Poster", 100, 35000);

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
                    System.out.println("data : " +pelanggan.getDiskon());
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
        cekPembeli.cekcustomer(pelanggan);
    }
    public static void show() {
        pembeli();
        
        stok.tambah(barang1);
        stok.tambah(barang2);
        stok.tambah(barang3);
        System.out.println("Insert Nama Pelaggan : ");
     
        System.out.println("pilih barang yang ingin dibeli :");
        System.out.println("1. Photocard");
        System.out.println("2. Lightstick");
        System.out.println("3. Poster");
        System.out.println("4. New Arrival!" );
        System.out.print("Pilih ? ");
        int c = inputdata.nextInt();
        
        if(c==1){
            Boolean fr = true;
            try {
                System.out.println("Harga Barang    : " + barang1.getHarga());
                while(fr){
                    System.out.print("Jumlah beli     : ");
                    int beli = inputdata.nextInt();
                    if(beli == 0 || beli < 0){
                        System.out.println("Jumlah Beli Tidak Boleh Kosong !");
                    }
                    else if(beli <= barang1.jumlahbarang){
                        int totalharga = barang1.getHarga() * beli;
                        System.out.println("Total harga     : " + totalharga);  
                        int dsk = pelanggan.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total Bayar     : " + dis);
                        penjual.setBarangbeli(beli);
                        fr = false;

                        Boolean byr = true;
                        while(byr){
                            System.out.print("Bayar             : ");
                            Long b = inputdata.nextLong();
                            if(b<dis){
                                System.out.println("Nominal anda tidak cukup!");
                            }
                            else if(b>dis){
                                int balik = (int)(b- dis);
                                System.out.println("Uang Kembalian      : " + balik);
                                bill1();
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(tampilsisab1());
                                        System.out.println("        Terima Kasih...        ");
                                        ans= false;
                                    }
                                    else if(a.equals("n")){
                                        System.out.println("        Terima Kasih...        "); 
                                        System.exit(0);                  
                                    }
                                    else{
                                        System.out.println("Isi dengan [Y/N]!");
                                    }
                                }
                            }
                            else if(b==dis){
                                System.out.println("Uang Kembalian      : 0 " );
                                bill1();
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(tampilsisab1());
                                        System.out.println("        Terima Kasih...        ");
                                        ans= false;
                                    }
                                    else if(a.equals("n")){
                                        System.out.println("        Terima Kasih...        "); 
                                        System.exit(0);                  
                                    }
                                    else{
                                        System.out.println("Isi dengan [Y/N]!");
                                    }
                                }
                            }
                            else if(b < 0){
                                System.out.println("Invalid !");
                            }
                            else{
                                System.err.println("Mohon input dalam bentuk integer !");
                            }
                        }
                    }
                    else if(beli>barang1.jumlahbarang){
                        System.out.println("Stok melebihi batas!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Valid !");
            }
        }
        else if (c==2){
            Boolean fr = true;
            try {
                System.out.println("Harga Barang    : " + barang2.getHarga());
                while(fr){
                    System.out.print("Jumlah beli     : ");
                    int beli = inputdata.nextInt();
                    if(beli == 0 || beli < 0){
                        System.out.println("Jumlah Beli Tidak Boleh Kosong !");
                    }
                    else if(beli <= barang2.jumlahbarang){
                        int totalharga = barang2.getHarga() * beli;
                        int dsk = pelanggan.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total harga     : " + totalharga);
                        System.out.println("Total Bayar     : " + dis);
                        penjual.setBarangbeli(beli);
                        fr = false;
                        Boolean byr = true;
                        while(byr){
                            System.out.print("Bayar             : ");
                            Long b = inputdata.nextLong();
                            if(b<dis){
                                System.out.println("Nominal anda tidak cukup!");
                            }
                            else if(b>dis){
                                int balik = (int)(b- dis);
                                System.out.println("Uang Kembalian      : " + balik);
                                System.out.println(penjual.toString());
                                System.out.println(penjual.tampilsisa());
                                System.out.println("        Terima Kasih...        "); 
                                byr = false;                             
                            }
                            else if(b==dis){
                                System.out.println("Uang Kembalian      : 0 " );
                                System.out.println(penjual.toString());
                                System.out.println(penjual.tampilsisa());
                                System.out.println("        Terima Kasih...        ");
                                byr = false;
                            }
                            else if(b < 0){
                                System.out.println("Invalid !");
                            }
                            else{
                                System.err.println("Mohon input dalam bentuk integer !");
                            }
                        }
                    }
                    else if(beli>barang2.jumlahbarang){
                        System.out.println("Stok melebihi batas!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Valid !");
            }
        }
        else if(c==3){
            Boolean fr = true;
            try {
                System.out.println("Harga Barang    : " + barang3.getHarga());
                while(fr){
                    System.out.print("Jumlah beli     : ");
                    int beli = inputdata.nextInt();
                    if(beli == 0 || beli < 0){
                        System.out.println("Jumlah Beli Tidak Boleh Kosong !");
                    }
                    else if(beli <= barang3.jumlahbarang){
                        int totalharga = barang.getHarga() * beli;
                        int dsk = pelanggan.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total harga     : " + totalharga);
                        System.out.println("Total Bayar     : " + dis);
                        penjual.setBarangbeli(beli);
                        fr = false;
                        Boolean byr = true;
                        while(byr){
                            System.out.print("Bayar             : ");
                            Long b = inputdata.nextLong();
                            if(b<dis){
                                System.out.println("Nominal anda tidak cukup!");
                            }
                            else if(b>dis){
                                int balik = (int)(b- dis);
                                System.out.println("Uang Kembalian      : " + balik);
                                System.out.println(penjual.toString());
                                System.out.println(penjual.tampilsisa());
                                System.out.println("        Terima Kasih...        "); 
                                byr = false;                             
                            }
                            else if(b==dis){
                                System.out.println("Uang Kembalian      : 0 " );
                                System.out.println(penjual.toString());
                                System.out.println(penjual.tampilsisa());
                                System.out.println("        Terima Kasih...        ");
                                byr = false;
                            }
                            else if(b < 0){
                                System.out.println("Invalid !");
                            }
                            else{
                                System.err.println("Mohon input dalam bentuk integer !");
                            }
                        }
                    }
                    else if(beli>barang3.jumlahbarang){
                        System.out.println("Stok melebihi batas!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Valid !");
            }
        }
        else if(c==4){
            inputdata.nextLine();
            datab();
            Boolean fr = true;
            try {
                System.out.println("Harga Barang    : " + barang.getHarga());
                while(fr){
                    System.out.print("Jumlah beli     : ");
                    int beli = inputdata.nextInt();
                    if(beli == 0 || beli < 0){
                        System.out.println("Jumlah Beli Tidak Boleh Kosong !");
                    }
                    else if(beli <= barang.jumlahbarang){
                        int totalharga = barang.getHarga() * beli;
                        int dsk = pelanggan.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total harga     : " + totalharga);
                        System.out.println("Total Bayar     : " + dis);
                        penjual.setBarangbeli(beli);
                        fr = false;
                        Boolean byr = true;
                        while(byr){
                            System.out.print("Bayar             : ");
                            Long b = inputdata.nextLong();
                            if(b<dis){
                                System.out.println("Nominal anda tidak cukup!");
                            }
                            else if(b>dis){
                                int balik = (int)(b- dis);
                                System.out.println("Uang Kembalian      : " + balik);
                                System.out.println(penjual.toString());
                                System.out.println(penjual.tampilsisa());
                                System.out.println("        Terima Kasih...        "); 
                                byr = false;                             
                            }
                            else if(b==dis){
                                System.out.println("Uang Kembalian      : 0 " );
                                System.out.println(penjual.toString());
                                System.out.println(penjual.tampilsisa());
                                System.out.println("        Terima Kasih...        ");
                                byr = false;
                            }
                            else if(b < 0){
                                System.out.println("Invalid !");
                            }
                            else{
                                System.err.println("Mohon input dalam bentuk integer !");
                            }
                        }
                    }
                    else if(beli>barang.jumlahbarang){
                        System.out.println("Stok melebihi batas!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Valid !");
            }
        }
    }

    public static void datab() {
        try {
            boolean y = true;
            while(y){
                System.out.print("Kode Barang       : " );
                String kodebarang = inputdata.nextLine();
                if(kodebarang.length() >=5 ){
                    barang.setKodebarang(kodebarang);
                    y = false; 
                }
                else if(kodebarang.length()<5){
                    System.out.println("Karakter harus lebih dari  " + kodebarang.length() + " karakter");
                    System.out.println("Minimal 5 karakter !");
                }
                else{
                    System.out.println("Anda wajib menginput Kode Barang!");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid !");
        }
        
        try {
            boolean n = true;
            while(n){
                System.out.print("Nama Barang       : " );
                String namabarang = inputdata.nextLine();
                if(namabarang.length() >=3 ){
                    barang.setNamabarang(namabarang); 
                    n = false;
                }
                else if(namabarang.length()<3){
                    System.out.println("Karakter harus lebih dari  " +namabarang.length() + " karakter");
                    System.out.println("Minimal 3 karakter !");
                }
                else{
                    System.out.println("Anda wajib menginput Nama Barang!");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid !");
        }
        try {
            boolean m = true;
            while(m){
                System.out.print("Jumlah Barang     : " );
                int jumlahbarang = inputdata.nextInt();
                if(jumlahbarang< 0){
                    System.out.println("Jumlah Barang tidak boleh dibawah 0 !");
                }
                else if(jumlahbarang == 0){
                    System.out.println("Jumlah tidak boleh 0 !");
                }
                else if(jumlahbarang > 0){
                    barang.setJumlahbarang(jumlahbarang);
                    m = false;
                } 
            }
        } catch (InputMismatchException e) {
            System.out.println("Jumlah harus dalam bentuk integer!");
        }
        try {
            boolean b = true;
            while(b){
                System.out.print("Harga Barang      : " );
                int hargabarang = inputdata.nextInt();
                if(hargabarang<0){
                    System.out.println("Harga Barang harus diatas 0 !");
                }
                else if(hargabarang<5000){
                    System.out.println("Harga Barang harus diatas " + hargabarang + " rupiah !");
                    System.out.println("Minimal 5000 rupiah");
                }
                else if (hargabarang >= 5000){
                    barang.setHarga(hargabarang);
                    b=false;
                }
                else{
                    System.out.println("Kesalahan input!");
                }
            }
        
        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid !");
        }
        
        stok.menambahbarang(barang);
    }

    public static int update1(){
        int sisa = barang1.getJumlahbarang() - penjual.getBarangbeli();
        return sisa;
    }    

    public static String tampilsisab1(){
        return 
        "Kode Barang        : " + barang1.getKodebarang() + "\n"+
        "Nama Barang        : " + barang1.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update1() + "\n"
        ;
    }

    public static void bill1(){
        System.out.println(penjual.toString1());
        System.out.println("Barang             =  " + barang1.getNamabarang() + "\n" );
        System.out.println("Jumlah Barang      =  " + penjual.getBarangbeli() + "\n");
    }
    
    public static int update2(){
        int sisa = barang2.getJumlahbarang() - penjual.getBarangbeli();
        return sisa;
    }    
    
    public static String tampilsisab2(){
        return 
        "Kode Barang        : " + barang2.getKodebarang() + "\n"+
        "Nama Barang        : " + barang2.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update2() + "\n"
        ;
    }
    public static void bill2(){
        System.out.println(penjual.toString1());
        System.out.println("Barang             =  " + barang2.getNamabarang() + "\n" );
        System.out.println("Jumlah Barang      =  " + penjual.getBarangbeli() + "\n");
    }
    
    public static int update3(){
        int sisa = barang3.getJumlahbarang() - penjual.getBarangbeli();
        return sisa;
    }    

    public static String tampilsisab3(){
        return 
        "Kode Barang        : " + barang3.getKodebarang() + "\n"+
        "Nama Barang        : " + barang3.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update3() + "\n"
        ;
    }
    public static void bill3(){
        System.out.println(penjual.toString1());
        System.out.println("Barang             =  " + barang3.getNamabarang() + "\n" );
        System.out.println("Jumlah Barang      =  " + penjual.getBarangbeli() + "\n");
    }
    
}
