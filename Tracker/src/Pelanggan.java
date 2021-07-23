public class Pelanggan extends Orang {
    String member;
    static int dk;
    static int i = 1;
    int diskon;
    public Pelanggan() {
    }

    public Pelanggan(String ID, String nama, String jeniskelamin, int notelp, String alamat,String member){
        this.ID = ID;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.alamat = alamat;
        this.member = member;
    }
    
    public Pelanggan(String ID, String nama, String jeniskelamin, int notelp, String alamat,String member,int diskon){
        this.ID = ID;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.alamat = alamat;
        this.member = member;
        this.diskon = diskon;
    }
    
    public Pelanggan(String ID , String nama , String member ){
        this.ID = ID;
        this.nama = nama;
        this.member = member;
    }

    public String getMember() {
        return this.member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getDiskon(){
        if(member.equals("silver")){
            return 1500;
        }
        else if (member.equals("gold")){
            return 2500;
        }
        else if(member.equals("platinum")){
            return 4000;
        }
        else if(member == "not member" || member == "Not Member"){
            return 0;
        }
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public String tampil() {
        return 
        "ID Number          = " + getID() + "\n" +
        "Nama               = " + getNama() + "\n" +
        "Jenis Kelamin      = " + getJeniskelamin() + "\n" +
        "No Telpon          = " + getNotelp() + "\n" +
        "Alamat             = " + getAlamat() + "\n"+
        "Loyalty            = " + getMember() + "\n" ;
    }

    public String datacust(){
        return
        "\t\t" + getID() + "\t\t\t" + getNama() + "\t\t" + getJeniskelamin() + "\t\t\t" + getNotelp() + "\t" +
        getAlamat() + "\t\t" +getMember();
    }
}