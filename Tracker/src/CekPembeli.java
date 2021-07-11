import java.util.ArrayList;
public class CekPembeli extends Pelanggan {
    ArrayList<Pelanggan> customer = new ArrayList<Pelanggan>();

    
    void cekcustomer(Pelanggan p){
        customer.add(p);
    }    
    
    void cekcustomer1(Pelanggan p){
        customer.add(p);
        System.out.println("Data Berhasil Ditambahkan!");
        System.out.println(p.tampil());
    }    

    public void tampilkan(){
        System.out.println("No" + "\t\t" + "ID NUMBER" + "\t\t" + "Nama" + "\t\t" + "Jenis Kelamin" + "\t\t" + "No.Telp" + "\t\t" +
        "Alamat" + "\t\t" + "Member");
        int i = 1;
        for (Pelanggan customer1 : customer) {
           System.out.print(i);
           System.out.println(customer1.datacust());
           i+=1;
        }      
    }
}
