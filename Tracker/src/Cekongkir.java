// menambah fitur pada menu 
// mengecek berapa besar ongkir jika dikirim menggunakan jasa dari Sohee Store

import java.util.Scanner;
public class Cekongkir {
    static int berat;
    static double jarak;
    static Scanner inputdata = new Scanner(System.in);

    public static void hargaongkir(){

    }

    public static void menu(){
        System.out.println("Cek Ongkir Pengiriman");
        System.out.print("Masukkan berat Barang/jumlah barang   : ");
        berat = inputdata.nextInt();
        System.out.print("Masukkan Tujuan Pengiriman(km)        : ");
        jarak = inputdata.nextDouble();
    }

    // jumlah barang * 1000 per barang 
    // jarak * 5000 per kilometer
    double ongkir(double berat , double jarak){
        int d = 5000;
        int e = 1000;
        double c = (berat*e) + (jarak * d);
        return c;   
    }



    @Override
    public String toString() {
        return 
        "Ongkir anda dikenakan biaya " +
        "Jumlah barang      : " + berat + "/pcs" + "\n" +
        "Jarak Tujuan       : " + jarak + "/km"  + "\n" +
        "Total Ongkir       : " + (int)ongkir(berat, jarak) + "\n"
        ;
    }

}
