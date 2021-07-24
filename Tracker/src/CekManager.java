// menambahkan dan mencetak data
import java.util.ArrayList;
public class CekManager extends Manager{
ArrayList<Manager> manager = new ArrayList<Manager>();

    void cekManager(Manager m){
        manager.add(m);
    }    
    void cekmanager1(Manager m){
        manager.add(m);
        System.out.println("Data Berhasil Ditambahkan!");
        System.out.println(m.tampilkansemuadata());
    }    


    public void tampilkan(){
        System.out.println("No" + "\t\t" + "ID NUMBER" + "\t\t" + "Nama" + "\t\t" + "Jenis Kelamin" + "\t\t" + "No.Telp" + "\t\t" +
        "Alamat" + "\t\t" + "Jumlah jam kerja" + "\t\t" + "Gaji");
        int i = 1;
        for (Manager manager : manager) {
            System.out.print(i);
            System.out.println(manager.dataka());
            i+=1;
        }   
    }     
      
}