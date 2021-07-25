// menambah fitur pada menu 
// mengecek berapa besar ongkir jika dikirim menggunakan jasa dari Sohee Store

import java.util.InputMismatchException;
import java.util.Scanner;
public class Cekongkir {
    static int berat;
    static double jarak;
    static Scanner inputdata = new Scanner(System.in);

    public static void hargaongkir(){

    }

    public static void menu(){
        boolean a = true;
        do {
            System.out.println("Cek Ongkir Pengiriman");
            try {
                System.out.print("Masukkan berat Barang/jumlah barang   : ");
                berat = inputdata.nextInt();
                if(berat == 0 || berat <0){
                    System.out.println("Jumlah Barang harus lebih besar dari 0!");
                }
                else if(berat > 0 && berat <= 500){
                    a = false;
                }
                else if(berat > 500){
                    System.out.println("Maksimal 500 barang !");
                }
            } catch (InputMismatchException ime ) {
                System.out.println("Inputan Data Tidak Valid ! \n  Anda harus input Integer!" );
                inputdata.nextLine();
            }
        } while (a);
        boolean n = true;
        do {
            try {
                System.out.print("Masukkan Tujuan Pengiriman(km)        : ");
                jarak = inputdata.nextDouble();
                if(jarak == 0 || jarak <0){
                    System.out.println("Jarak harus lebih besar dari 0!");
                }
                else if(jarak > 0 && jarak <= 1000000){
                    n = false;
                }
                else if(jarak > 1000000){
                    System.out.println("Maksimal 1000000 km !");
                }
                
            } catch (InputMismatchException ime ) {
                System.out.println("Inputan Data Tidak Valid ! \n  Anda harus input Integer!" );
                inputdata.nextLine();
            }
            
        } while (n);
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
