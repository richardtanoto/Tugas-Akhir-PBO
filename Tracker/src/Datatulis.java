import java.io.*;
import java.util.ArrayList;
// disini terdapat write dan read data dari class kurir 
// data akan disimpan dalam Fileread.txt

class Datatulis{
    public static void writen(ArrayList<Cleaningservis> cleaningservis){
        String tempat ="/Users/Andrean/Documents/Java/Final/Tugas-Akhir-PBO/Tracker/Data.txt";
        String data = "";
        FileWriter fout=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Nama Anda ? ");
            data = br.readLine();
            fout = new FileWriter(tempat);
           for (Cleaningservis cleaningservis2 : cleaningservis) {
               data += cleaningservis2.tampilkansemuadata();
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