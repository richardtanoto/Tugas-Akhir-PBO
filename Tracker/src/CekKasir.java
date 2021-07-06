import java.util.ArrayList;
public class CekKasir extends Kasir{
    ArrayList<Kasir> kassa = new ArrayList<Kasir>();

    void cekkasir(Kasir k){
        kassa.add(k);
    }    


    public void tampilkan(){
        System.out.println("No" + "\t\t" + "ID NUMBER" + "\t\t" + "Nama" + "\t\t" + "Jenis Kelamin" + "\t\t" + "No.Telp" + "\t\t" +
        "Alamat" + "\t\t" + "Jumlah jam kerja" + "\t\t" + "Gaji");
        int i = 1;
        for (Kasir kasir : kassa) {
            System.out.print(i);
            System.out.println(kasir.dataka());
            i+=1;
        }       
    }
    
    

    
}
