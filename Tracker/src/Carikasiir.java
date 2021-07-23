// mengecek apakah ada nama kasir yang ingin dicari tanpa harus mencari data di init jika terdapat banyak data
// dapat dicari berdasarkan nama ataupun ID number
import java.util.Scanner;
public class Carikasiir extends Kasir {
    static Kasir kassa3 = new Kasir("KS001", "eunbi", "Wanita", 30051997, "Orchid", 5 , 25000 );
    static Kasir kassa4 = new Kasir("KS002", "yeri", "Wanita", 50319999, "Rose", 10 , 25000 );
    static Kasir kassa5 = new Kasir("KS003", "jay", "Pria", 20042002, "Lily", 11 , 25000 );
    static CekKasir cek = new CekKasir();
    static Scanner inputdata = new Scanner(System.in);


    public static void kasirk(){
        System.out.println("Input nama/ID ");
        System.out.println("1. Nama");
        System.out.println("2. ID Number");
        System.out.print("Pilih : ");
        int a = inputdata.nextInt();
        inputdata.nextLine();
        if(a==1){
            carinama();
        }
        else if(a==2){
            cariid();
        }
        else if(a<1 || a>2){
            System.out.println("Invalid!");
        }
    }


    public static void carinama(){
        System.out.print("Masukan nama Kasir : ");
        String carin = inputdata.nextLine();
        String n = carin.toLowerCase();
        
        if(n.equals(kassa3.getNama())){
            cek.cekkasir(kassa3);
            System.out.println("Hello "+ n + "  Selamat Berkerja ^^  ");
            System.out.println(kassa3.tampil());
            
        }
        else if(n.equals(kassa4.getNama())){
            cek.cekkasir(kassa4);
            System.out.println("Hello "+ n + "  Selamat Berkerja ^^  ");
            System.out.println(kassa4.tampil());
        }
        else if(n.equals(kassa5.getNama())){
            cek.cekkasir(kassa5);
            System.out.println("Hello "+ n + "  Selamat Berkerja ^^  ");
            System.out.println(kassa5.tampil());
        }
        else if( n!= kassa3.getNama() || n!= kassa4.getNama() || n!= kassa5.getNama()) {
            System.out.println("Data Nama tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
        }
    }

    public static void cariid(){
        System.out.print("Masukan ID pelanggan : ");
        String carin = inputdata.nextLine();
        String n = carin.toUpperCase();
        
        if(n.equals(kassa3.getID())){
            System.out.println("Helloo "+ kassa3.getNama() + "  Selamat Berkerja ^^  ");
            System.out.println(kassa3.tampil());
        }
        else if(n.equals(kassa4.getID())){
            System.out.println("Helloo "+ kassa4.getNama() + "  Selamat Datang ^^  ");
            System.out.println(kassa4.tampil());
        }
        else if(n.equals(kassa5.getID())){
            System.out.println("Helloo "+ kassa5.getNama() + "  Selamat Datang ^^  ");
            System.out.println(kassa5.tampil()
            );
        }
        else if( n!= kassa3.getID() || n!= kassa4.getID() || n!= kassa5.getID()) {
            System.out.println("Data ID tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
        }
    }



    public static void carinamaP(){
        System.out.print("Masukan nama Kasir : ");
        String carin = inputdata.nextLine();
        String n = carin.toLowerCase();
        
        if(n.equals(kassa3.getNama())){
            cek.cekkasir(kassa3);
            System.out.println("Data Berhasil Ditemukan!");
            System.out.println(kassa3.tampilkansemuadata());
            
        }
        else if(n.equals(kassa4.getNama())){
            cek.cekkasir(kassa4);
            System.out.println("Data Berhasil Ditemukan!");
            System.out.println(kassa4.tampilkansemuadata());
        }
        else if(n.equals(kassa5.getNama())){
            cek.cekkasir(kassa5);
            System.out.println("Data Berhasil Ditemukan!");
            System.out.println(kassa5.tampilkansemuadata());
        }
        else if( n!= kassa3.getNama() || n!= kassa4.getNama() || n!= kassa5.getNama()) {
            System.out.println("Data Nama tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
        }
    }

    public static void cariidP(){
        System.out.print("Masukan ID pelanggan : ");
        String carin = inputdata.nextLine();
        String n = carin.toLowerCase();
        
        if(n.equals(kassa3.getID())){
            System.out.println("Data Berhasil Ditemukan!");
            System.out.println(kassa3.tampilkansemuadata());
        }
        else if(n.equals(kassa4.getID())){
            System.out.println("Data Berhasil Ditemukan!");
            System.out.println(kassa4.tampilkansemuadata());
        }
        else if(n.equals(kassa5.getID())){
            System.out.println("Data Berhasil Ditemukan!");
            System.out.println(kassa5.tampilkansemuadata());
        }
        else if( n!= kassa3.getID() || n!= kassa4.getID() || n!= kassa5.getID()) {
            System.out.println("Data ID tidak ditemukan!");
            System.out.println("Entry Data baru ! ");
        }
    }

}
