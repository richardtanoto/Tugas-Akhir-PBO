public class Pelanggan extends Orang {
    String member;
    static int dk;
    static int i = 1;
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

    public int diskon(){
        if(member == "silver" || member == "Silver"){
            dk = 1500;
        }
        else if (member == "gold" || member == "Gold"){
            dk = 2500;
        }
        else if(member == "platinum" || member == "Platinum"){
            dk = 4000;
        }
        else if(member == "not member" || member == "Not Member"){
            dk = 0;
        }
        return dk;
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

