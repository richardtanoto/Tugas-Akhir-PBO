// pada pembelian barang sudah dimodifikasi dengan init data pelanggan
// jadi nama atau id number pelanggan yang mempunyai member tidak usah diinput lagi 
// hanya perlu mencari datanya saja dan untuk non member baru menginput data
// class beli,beli1,beli2,beli3 adalah class yang sama yang berbeda hanyalah getnama dan getmember
// dikarenakan data disimpan dalam init maka aksesnya harus satu per satu

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
   

    public static void menupilih(){
        memberornot();
    }

    public static void memberornot() {
        System.out.println("Member atau Non Member");
        System.out.println("1. Member");
        System.out.println("2. Non Member");
        boolean a =true;
        do {
            try {
                System.out.print("Pilih : ");
                int p = inputdata.nextInt();
                if(p < 1 || p>=3){
                    System.out.println("Pilihan anda tidak valid [1/2]!");
                }
                else if(p==2){
                    a=false;
                    pembeli();
                    Beli.show2();
                }
                else if(p ==1 ){
                    a=false;
                    Caripelanggan.pilih1();
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Jumlah harus dalam bentuk integer!");
                inputdata.nextLine();
            }
        } while (a);
    }

    public static void pembeli() {
        try {
            boolean a = true;
            inputdata.nextLine();
            while(a){
                System.out.print("Nama Pelanggan       : " );
                String n = inputdata.nextLine();
                if(n.length() >=3 ){
                    pelanggan.setNama(n);
                    String loyal = "Not Member";
                    pelanggan.setMember(loyal);
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
       
        cekPembeli.cekcustomer(pelanggan);
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

        boolean m = true;
        do {
            try {
                
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
            } catch (InputMismatchException e) {
                System.out.println("Jumlah harus dalam bentuk integer!");
                inputdata.nextLine();
            }
        } while (m);

        boolean b = true;
        do {
            try {
                
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
            }catch (InputMismatchException cek) {
                System.out.println("Inputan Harga Tidak Valid ! \n Anda Harus menginput Integer ^^ ");
                inputdata.nextLine();
            } 
            
        } while (b);
        
    stok.menambahbarang(barang);
    }
}