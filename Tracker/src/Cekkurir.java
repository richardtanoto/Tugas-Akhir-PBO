// menambahkan dan mencetak data kurir 
import java.util.ArrayList;
public class Cekkurir extends Kurir{
ArrayList<Kurir> kurir = new ArrayList<Kurir>();

    void cekkurir(Kurir k){
        kurir.add(k);
    }    
    void cekkurir1(Kurir k){
        kurir.add(k);
        System.out.println("Data Berhasil Ditambahkan!");
        System.out.println(k.tampilkansemuadata());
    }    


    public void tampilkan(){
        System.out.println("No" + "\t\t" + "ID NUMBER" + "\t\t" + "Nama" + "\t\t" + "Jenis Kelamin" + "\t\t" + "No.Telp" + "\t\t" +
        "Alamat" + "\t\t" + "Jumlah pesanan" + "\t\t" + "Gaji");
        int i = 1;
        for (Kurir kurir : kurir) {
            System.out.print(i);
            System.out.println(kurir.dataka());
            i+=1;
        }   
    }     
      
}