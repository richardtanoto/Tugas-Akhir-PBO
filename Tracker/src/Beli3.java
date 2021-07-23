// mengakses data pelanggan ke4 dari init data
import java.util.InputMismatchException;
import java.util.Scanner;

public class Beli3 {
    
    static Scanner inputdata = new Scanner(System.in);
    static Barang barang = new Barang();
    static Kasir kassa1 = new Kasir("KS001", "Eunbi");
    static Tstok stok = new Tstok();
    static CekKasir cek = new CekKasir();
    static CekPembeli cekPembeli = new CekPembeli();
    static Barang barang1 = new Barang("KB001", "Photocard", 120,30000);
    static Barang barang2 = new Barang("KB002", "Lightstick", 110, 130000);
    static Barang barang3 = new Barang("KB003", "Poster", 100, 35000);
    
    static Pelanggan pelanggan4 = new Pelanggan("CT011", "na", "Pria", 13082000, "Tukki", "Silver",1500);
    static Penjualan penjual4 = new Penjualan(kassa1, barang, pelanggan4);
    static int d;

    // PELANGGAN 4 == NA

    public static void menupilih(){

    }


    public static void show4() {  
        stok.tambah(barang1);
        stok.tambah(barang2);
        stok.tambah(barang3);
    
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
                        int dsk = pelanggan4.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total Bayar     : " + dis);
                        penjual4.setBarangbeli(beli);
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
                                        System.out.println(tampilsisab12());
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
                                        System.out.println(tampilsisab12());
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
                        System.out.println("Total harga     : " + totalharga);  
                        int dsk = pelanggan4.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total Bayar     : " + dis);
                        penjual4.setBarangbeli(beli);
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
                                bill2();
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(tampilsisab22());
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
                                bill2();
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(tampilsisab22());
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
                        int totalharga = barang3.getHarga() * beli;
                        System.out.println("Total harga     : " + totalharga);  
                        int dsk = pelanggan4.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total Bayar     : " + dis);
                        penjual4.setBarangbeli(beli);
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
                                bill3();
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(tampilsisab33());
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
                                bill3();
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(tampilsisab33());
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
            Showdata.datab();
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
                        int dsk = pelanggan4.getDiskon();
                        int dis = totalharga - dsk;
                        System.out.println("Total harga     : " + totalharga);
                        System.out.println("Total Bayar     : " + dis);
                        penjual4.setBarangbeli(beli);
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
                                System.out.println(penjual4.toString());
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(penjual4.tampilsisa());
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
                                System.out.println(penjual4.toString());
                                inputdata.nextLine();
                                byr = false;
                                Boolean ans = true;
                                while(ans){
                                    System.out.print("Liat sisa stok [Y/N} ?  ");
                                    String j = inputdata.nextLine();
                                    String a = j.toLowerCase();
                                    if(a.equals("y")){
                                        System.out.println(penjual4.tampilsisa());
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
                    else if(beli>barang.jumlahbarang){
                        System.out.println("Stok melebihi batas!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Inputan Tidak Valid !");
            }
        }
    }



    public static int update12(){
        int sisa = barang1.getJumlahbarang() - penjual4.getBarangbeli();
        return sisa;
    }    

    public static String tampilsisab12(){
        return 
        "Kode Barang        : " + barang1.getKodebarang() + "\n"+
        "Nama Barang        : " + barang1.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update12() + "\n"
        ;
    }

    public static void bill1(){
        System.out.println(penjual4.toString1());
        System.out.println("Barang             =  " + barang1.getNamabarang() + "\n" );
        System.out.println("Jumlah Barang      =  " + penjual4.getBarangbeli() + "\n");
    }
    

    public static int update23(){
        int sisa = barang2.getJumlahbarang() - penjual4.getBarangbeli();
        return sisa;
    }    
    
    public static String tampilsisab22(){
        return 
        "Kode Barang        : " + barang2.getKodebarang() + "\n"+
        "Nama Barang        : " + barang2.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update23() + "\n"
        ;
    }

    public static void bill2(){
        System.out.println(penjual4.toString1());
        System.out.println("Barang             =  " + barang2.getNamabarang() + "\n" );
        System.out.println("Jumlah Barang      =  " + penjual4.getBarangbeli() + "\n");
    }
    
    public static int update33(){
        int sisa = barang3.getJumlahbarang() - penjual4.getBarangbeli();
        return sisa;
    }    

    public static String tampilsisab33(){
        return 
        "Kode Barang        : " + barang3.getKodebarang() + "\n"+
        "Nama Barang        : " + barang3.getNamabarang() + "\n" +
        "Jumlah Barang      : " + update33() + "\n"
        ;
    }
    public static void bill3(){
        System.out.println(penjual4.toString1());
        System.out.println("Barang             =  " + barang3.getNamabarang() + "\n" );
        System.out.println("Jumlah Barang      =  " + penjual4.getBarangbeli() + "\n");
    }
}

