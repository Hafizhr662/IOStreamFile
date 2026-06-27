package bagian3.kontak;

public class Kontak {
    private String nama; 
    private String nomor;
    //  Tambah atribut email
    private String email; 

    // Constructor yang disesuaikan untuk menerima parameter email
    public Kontak(String nama, String nomor, String email) { // [cite: 610]
        this.nama = nama; 
        this.nomor = nomor; 
        this.email = email;
    } // [cite: 611]

    public String getNama() {
        return nama; 
    } 

    public String getNomor() {
        return nomor; 
    }
    
    public String getEmail() {
        return email;
    }

    // Menyesuaikan penyimpanan data ke baris teks menjadi 3 bagian
    public String keBaris() { 
        return nama + ";" + nomor + ";" + email; 
    } 

    // Menyesuaikan tampilan informasi kontak
    public String info() { 
        return nama + " | " + nomor + " | " + email; 
    }
}