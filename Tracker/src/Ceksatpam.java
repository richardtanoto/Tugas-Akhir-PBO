// menambahkan dan mencetak data
import java.util.ArrayList;
public class Ceksatpam extends Satpam{
ArrayList<Satpam> satpam = new ArrayList<Satpam>();

    void ceksatpam(Satpam k){
        satpam.add(k);
    }    
    void ceksatpam1(Satpam k){
        satpam.add(k);
        System.out.println("Data Berhasil Ditambahkan!");
        System.out.println(k.tampilkansemuadata());
    }    


    public void tampilkan(){
        System.out.println("No" + "\t\t" + "ID NUMBER" + "\t\t" + "Nama" + "\t\t" + "Jenis Kelamin" + "\t\t" + "No.Telp" + "\t\t" +
        "Alamat" + "\t\t" + "Jumlah shift" + "\t\t" + "Gaji");
        int i = 1;
        for (Satpam satpam : satpam) {
            System.out.print(i);
            System.out.println(satpam.dataka());
            i+=1;
        }   
    }     
      
}