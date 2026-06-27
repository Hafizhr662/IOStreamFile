package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args){
        //Membuat objek pengelola dan mengisinya dan ditambahkan parameter email
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak ("Andi", "0811111","andi23@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222","budi200@gmail.com")); 
        buku.tambahKontak(new Kontak("Citra", "0833333","citracit@gmail.com")); 
  
        buku.tampilkanSemua(); 
        buku.simpanKeBerkas(); 
        System.out.println();
         //  Cari Kontak
        System.out.println("--- Pengujian Cari Kontak ---");
        buku.cariKontak("Budi"); // 
        buku.cariKontak("izai");
        System.out.println();

        //hapus Kontak
        System.out.println("--- Pengujian Hapus Kontak ---");
        buku.hapusKontak("Andi");
        System.out.println();
  
        // Objek baru yang kosong, lalu memuat dari berkas 
        System.out.println("--- Memuat Dari Berkas Ke Objek Baru ---");
        BukuKontak bukuLain = new BukuKontak("kontak.txt"); 
        bukuLain.muatDariBerkas(); 
        bukuLain.tampilkanSemua(); 
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak()); 
   
  }
}