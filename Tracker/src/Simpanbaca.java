import java.io.*;
import java.util.ArrayList;
// disini terdapat write dan read data dari class manager 
// data akan disimpan dalam Read.txt

class Simpanbaca{
    public static void writen(ArrayList<Manager> manager){
        String tempat ="Users/Richard/Documents/GitHub/Tugas-Akhir-PBO/Tracker/Read.txt";
        String data = "";
        FileWriter fout=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Nama Anda ? ");
            data = br.readLine();
            fout = new FileWriter(tempat);
           for (Manager manager2 : manager) {
               data += manager2.tampilkansemuadata();
           }
        }catch(FileNotFoundException e) {
            System.out.println(tempat + " tidak dapat memuat file !!!"); 
        }catch(IOException ime) {
            System.out.println("Invalid!!! : " + ime);

        }finally { 
            if(fout!=null) {
                try{
                    fout.write(data);
                    fout.close();
                }catch(IOException ime) {
                    System.out.println("Invalid!!! : " + ime);
                }
            }
        }

        byte d; 
        FileInputStream fin=null; 

        try { 
            fin = new FileInputStream(tempat); 
            do { 

                d = (byte)fin.read(); 
                System.out.print((char)d);  

            }while(d != -1); 

        }catch(FileNotFoundException e) {
            System.out.println(tempat + " tidak ditemukan."); 
        }catch(IOException ime) {
            System.out.println("Invalid!!! : " + ime);
        }
        finally {
                if(fin!=null){
                    try{
                        fin.close();
                    }catch(IOException ime) { 
                        System.out.println("Invalid!!! : " + ime); 
                    } 
                } 
        } 
    }
}