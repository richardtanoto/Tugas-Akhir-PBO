// mengecek apakah ada nama pelanggan yang ingin dicari tanpa harus mencari data di init jika terdapat banyak data
// dapat digunakan ketika pelanggan ingin membeli barang dari store jadi tanpa harus menginput ulang membernya
// sudah dengan mudah bisa mengakses loyaltynya
// dapat dicari berdasarkan nama ataupun ID number
import java.util.InputMismatchException;
import java.util.Scanner;
public class Caripelanggan extends Pelanggan{

    static Scanner inputdata = new Scanner(System.in);
    static Pelanggan pelanggan = new Pelanggan();
    static CekPembeli cekPembeli = new CekPembeli();
    static int d;

    public Caripelanggan() {
    }

    public static void carinama(){
        Pelanggan pelanggan2 = new Pelanggan("CT009", "kim", "Pria", 30121995, "Busan", "Platinum",4000);
        Pelanggan pelanggan3 = new Pelanggan("CT010", "choi", "Pria", 51202000, "Almond", "Gold",2500);
        Pelanggan pelanggan4 = new Pelanggan("CT011", "na", "Pria", 13082000, "Tukki", "Silver",1500);
        
        System.out.print("Masukan nama pelanggan : ");
        String carin = inputdata.nextLine();
        String n = carin.toLowerCase();
        
        if(n.equals(pelanggan2.getNama())){
            cekPembeli.cekcustomer(pelanggan2);
            System.out.println("Hello "+ n + "  Selamat Datang ^^  ");
            System.out.println(pelanggan2.tampil());
            
        }
        else if(n.equals(pelanggan3.getNama())){
            cekPembeli.cekcustomer(pelanggan3);
            System.out.println("Hello "+ n + "  Selamat Datang ^^  ");
            System.out.println(pelanggan3.tampil());
        }
        else if(n.equals(pelanggan4.getNama())){
            cekPembeli.cekcustomer(pelanggan4);
            System.out.println("Hello "+ n + "  Selamat Datang ^^  ");
            System.out.println(pelanggan4.tampil());
        }
        else if( n!= pelanggan2.getNama() || n!= pelanggan3.getNama() || n!= pelanggan4.getNama()) {
            System.out.println("Data Nama tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
            Datapembeli.datapembeli();
            
        }
    }
    public static void carinamad(){
        Pelanggan pelanggan2 = new Pelanggan("CT009", "kim", "Pria", 30121995, "Busan", "Platinum",4000);
        Pelanggan pelanggan3 = new Pelanggan("CT010", "choi", "Pria", 51202000, "Almond", "Gold",2500);
        Pelanggan pelanggan4 = new Pelanggan("CT011", "na", "Pria", 13082000, "Tukki", "Silver",1500);
        
        System.out.print("Masukan nama pelanggan : ");
        String carin = inputdata.nextLine();
        String n = carin.toLowerCase();
        
        if(n.equals(pelanggan2.getNama())){
            cekPembeli.cekcustomer(pelanggan2);
            System.out.println("Hello "+ n + "  Selamat Datang ^^  ");
            System.out.println( " Member kamu : " +  pelanggan2.getMember());
            d = pelanggan2.getDiskon();
            System.out.println("Diskon : "+d);
            Beli.show2();
        }
        else if(n.equals(pelanggan3.getNama())){
            cekPembeli.cekcustomer(pelanggan3);
            System.out.println("Hello "+ n + "  Selamat Datang ^^  ");
            System.out.println( " Member kamu : " +  pelanggan3.getMember());
            d = pelanggan3.getDiskon();
            System.out.println("Diskon : "+d);
            Beli2.show3();
        }
        else if(n.equals(pelanggan4.getNama())){
            cekPembeli.cekcustomer(pelanggan4);
            System.out.println("Hello "+ n + "  Selamat Datang ^^  ");
            System.out.println( " Member kamu : " +  pelanggan4.getMember());
            d = pelanggan4.getDiskon();
            System.out.println("Diskon : "+d);
            Beli3.show4();
        }
        else if( n!= pelanggan2.getNama() || n!= pelanggan3.getNama() || n!= pelanggan4.getNama()) {
            System.out.println("Data Nama tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
            Showdata.pembeli();
            Beli1.show1();
        }
    }

    public static void cariid(){
        Pelanggan pelanggan2 = new Pelanggan("CT009", "kim", "Pria", 30121995, "Busan", "Platinum");
        Pelanggan pelanggan3 = new Pelanggan("CT010", "choi", "Pria", 51202000, "Almond", "Gold");
        Pelanggan pelanggan4 = new Pelanggan("CT011", "na", "Pria", 13082000, "Tukki", "Silver");
        
        System.out.print("Masukan ID pelanggan : ");
        String carin = inputdata.nextLine();
        String n = carin.toUpperCase();
        
        if(n.equals(pelanggan2.getID())){
            System.out.println("Helloo "+ pelanggan2.getNama() + "  Selamat Datang ^^  ");
            System.out.println(pelanggan2.tampil());
        }
        else if(n.equals(pelanggan3.getID())){
            System.out.println("Helloo "+ pelanggan3.getNama() + "  Selamat Datang ^^  ");
            System.out.println(pelanggan3.tampil());
        }
        else if(n.equals(pelanggan4.getID())){
            System.out.println("Helloo "+ pelanggan4.getNama() + "  Selamat Datang ^^  ");
            System.out.println(pelanggan2.tampil());
        }
        else if( n!= pelanggan2.getID() || n!= pelanggan3.getID() || n!= pelanggan4.getID()) {
            System.out.println("Data ID tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
            Datapembeli.datapembeli();
        }
    }

    public static void cariidD(){
        Pelanggan pelanggan2 = new Pelanggan("CT009", "kim", "Pria", 30121995, "Busan", "Platinum");
        Pelanggan pelanggan3 = new Pelanggan("CT010", "choi", "Pria", 51202000, "Almond", "Gold");
        Pelanggan pelanggan4 = new Pelanggan("CT011", "na", "Pria", 13082000, "Tukki", "Silver");
        
        System.out.print("Masukan ID pelanggan : ");
        String carin = inputdata.nextLine();
        String n = carin.toUpperCase();
        
        if(n.equals(pelanggan2.getID())){
            System.out.println("Helloo "+ pelanggan2.getNama() + "  Selamat Datang ^^  ");
            System.out.println( " Member kamu : " +  pelanggan2.getMember());
            d = pelanggan2.getDiskon();
            System.out.println("Diskon : "+d);
            Beli.show2();
        }
        else if(n.equals(pelanggan3.getID())){
            System.out.println("Helloo "+ pelanggan3.getNama() + "  Selamat Datang ^^  ");
            System.out.println( " Member kamu : " +  pelanggan3.getMember());
            d = pelanggan3.getDiskon();
            System.out.println("Diskon : "+d);
            Beli2.show3();
        }
        else if(n.equals(pelanggan4.getID())){
            System.out.println("Helloo "+ pelanggan4.getNama() + "  Selamat Datang ^^  ");
            System.out.println( " Member kamu : " +  pelanggan4.getMember());
            d = pelanggan4.getDiskon();
            System.out.println("Diskon : "+d);
            Beli3.show4();
        }
        else if( n!= pelanggan2.getID() || n!= pelanggan3.getID() || n!= pelanggan4.getID()) {
            System.out.println("Data ID tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
            Showdata.pembeli();
            Beli1.show1();
        }
    }

    public static void pilih(){
        System.out.println("Cari data : ");
        System.out.println("1. Cari nama");
        System.out.println("2. Cari ID");
        boolean a =true;
        inputdata.nextLine();
        do {
            try {
                System.out.print("Pilih : ");
                int c = inputdata.nextInt();
                if(c==1){
                    a=false;
                    carinama();
                }
                else if(c==2){
                    a =false;
                    cariid();
                }
                else{
                   System.out.println("Pilih antara 1/2 !");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Jumlah harus dalam bentuk integer!");
                inputdata.nextLine();
            }
        } while (a);
    }

    public static void pilih1(){
        System.out.println("Cari data : ");
        System.out.println("1. Cari nama");
        System.out.println("2. Cari ID");
        boolean b=true;
        do {
            try {
                System.out.print("Pilih : ");
                int c = inputdata.nextInt();
                inputdata.nextLine();
                if(c==1){
                    carinamad();
                }
                else if(c==2){
                    cariidD();
                }
                else {
                   System.out.println("Pilih antara 1/2 !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Jumlah harus dalam bentuk integer!");
                inputdata.nextLine();
            }
            
        } while (b);
    }

   
}
