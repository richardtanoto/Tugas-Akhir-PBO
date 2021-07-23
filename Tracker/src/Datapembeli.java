import java.util.InputMismatchException;
import java.util.Scanner;
public class Datapembeli {
    static Scanner inputdata = new Scanner(System.in);
    static Pelanggan pelanggan = new Pelanggan();
    static CekPembeli cekPembeli = new CekPembeli();

    public static void datapembeli() {
        try {
            boolean a = true;
            while(a){
                System.out.print("ID Number         :  ");
                String id = inputdata.nextLine();
                if(id.length()>=5){
                    pelanggan.setID(id);
                    a = false;
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
            boolean b = true;
            while(b){
                System.out.print("Nama              :  ");
                String nama = inputdata.nextLine();
                if(nama.length()>=3){
                    pelanggan.setNama(nama);
                    b = false;
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
                    pelanggan.setJeniskelamin(jenis);
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
                    pelanggan.setNotelp(notel);
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
                inputdata.nextLine();
                System.out.print("Alamat            :  ");
                String alamat = inputdata.nextLine();
                if(alamat.length()>=5){
                    pelanggan.setAlamat(alamat);
                    r = false;
                }
                else if(alamat.length()<5){
                    System.out.println("Minimal 5 karakter untuk alamat !");
                }
            }
        } catch (Exception e) {
            System.out.println("Inputan Data Tidak Valid !");
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
        cekPembeli.cekcustomer1(pelanggan);
    }

}