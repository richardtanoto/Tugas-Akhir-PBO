// menambahkan dan mencetak data
import java.util.ArrayList;
public class Cekcleaningservis extends Cleaningservis{
ArrayList<Cleaningservis> cleaningservis = new ArrayList<Cleaningservis>();

    void cekcleaningservis(Cleaningservis k){
        cleaningservis.add(k);
    }    
    void cekcleaningservis1(Cleaningservis k){
        cleaningservis.add(k);
        System.out.println("Data Berhasil Ditambahkan!");
        System.out.println(k.tampilkansemuadata());
    }    


    public void tampilkan(){
        System.out.println("No" + "\t\t" + "ID NUMBER" + "\t\t" + "Nama" + "\t\t" + "Jenis Kelamin" + "\t\t" + "No.Telp" + "\t\t" +
        "Alamat" + "\t\t" + "Jumlah shift" + "\t\t" + "Gaji");
        int i = 1;
        for (Cleaningservis cleaningservis : cleaningservis) {
            System.out.print(i);
            System.out.println(cleaningservis.dataka());
            i+=1;
        }   
    }     
      
}