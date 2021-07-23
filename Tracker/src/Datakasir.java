import java.util.Scanner;
import java.util.InputMismatchException;

public class Datakasir {
    static Scanner inputdata = new Scanner(System.in);
    static Kasir kassa1 = new Kasir();
    static CekKasir cek = new CekKasir();

    public static void datakaryawan(){
        try {
            boolean n = true;
            while(n){
                System.out.print("ID Number         :  ");
                String id = inputdata.nextLine();
                if(id.length()>=5){
                    kassa1.setID(id);
                    n= false;
                }
                else if(id.length()<5){
                    System.out.println("ID Number minimal 5 karakter !");
                }
                else{
                    System.out.println("Invalid!");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Data Tidak Valid !");
        }
        try {
            boolean m = true;
            while(m){
                System.out.print("Nama              :  ");
                String nama = inputdata.nextLine();
                if(nama.length()>=3){
                    kassa1.setNama(nama);
                    m = false;
                }
                else if(nama.length()<3){
                    System.out.println("Karakter pada nama minimal 3 !");
                }
            }
            
        } catch (Exception e) {
            System.out.println("Inputan Data Tidak Valid !");
        }
        try {
            boolean q =true;
            while(q){
                System.out.print("Jenis Kelamin     :  ");
                String jenk = inputdata.nextLine();
                String jenis = jenk.toLowerCase();
                if( jenis.equals("wanita") ||jenis.equals("pria")){
                    kassa1.setJeniskelamin(jenis);
                    q = false;
                }
                else {
                    System.out.println("Anda harus mengisi antara Pria/Wanita !");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Data Tidak Valid !");
        }
        boolean a = true;
        do {
            try {
               
                System.out.print("No Telpon         :  ");
                int notel = inputdata.nextInt();
                int l = String.valueOf(notel).length();
                if(l >= 10){
                    System.out.println("Karakter maksimal 8 ! " + "karaktermu : " + l + "!");
                }
                 else if(l < 8){
                    System.out.println("Karakter harus 8 digit !");
                }
                else if(l >= 8){
                    kassa1.setNotelp(notel);
                    a = false;
                }
                else {
                    System.out.println("Error!");
                }
            } catch (InputMismatchException ime ) {
                System.out.println("Inputan Data Tidak Valid ! \n  Anda harus input Integer!" );
                inputdata.nextLine();
            }
            
        } while (a);

        inputdata.nextLine();

        try {
            boolean r = true;
            while(r){
                System.out.print("Alamat            :  ");
                String alamat = inputdata.nextLine();
                if(alamat.length()>=5){
                    kassa1.setAlamat(alamat);
                    r = false;
                }
                else if(alamat.length()<5){
                    System.out.println("Minimal 5 karakter untuk alamat !");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Data Tidak Valid !");
        }
        boolean p = true;
        do { 
            try {
                System.out.print("Jumlah Jam Kerja   :  ");
                int jamkerja = inputdata.nextInt();
                int j = String.valueOf(jamkerja).length();
                if(jamkerja == 0 || jamkerja <0){
                    System.out.println("Jam harus lebih besar dari 0!");
                }
                else if(jamkerja > 0 && jamkerja <= 24){
                    kassa1.setJamkerja(jamkerja);; 
                    p = false;
                    cek.cekkasir1(kassa1);
                }
                else if(jamkerja > 24){
                    System.out.println("Maksimal 24 jam !");
                }
                else if(String.valueOf(jamkerja).length() > 0 ){
                    System.out.println("Anda harus mengisi lebih besar dari " + jamkerja + " !!");
                }
                    
                else if(j == '\n' || j == '\"' || j == '\''){
                    System.out.println("Tidak Valid!");
                }   
                else {
                    System.out.println("Error!");
                }
            } catch (InputMismatchException cek) {
                System.out.println("Inputan Data Tidak Valid ! \n Anda Harus menginput Integer ^^ ");
                inputdata.nextLine();
            } 
        } while (p);
    }
}