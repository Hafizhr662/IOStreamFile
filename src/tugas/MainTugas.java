/*
 * Nama : Moh Hafiz Anshari
 * NPM  : 2410010142
 */
package tugas;


public class MainTugas {
   public static void main(String[] args) {
        // 1. Menyimpan daftar nama kategori dalam sebuah array String (minimal 3) dan menampilkannya
        String[] kategori = {"Elektronik", "Aksesoris Hp", "Alat Tulis","Cctv& Jaringan"};
        System.out.println("== Kategori Barang Toko ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        // 2. Membuat objek Gudang pertama dan mengisi minimal 5 objek Barang
        Gudang gudangUtama = new Gudang("barang.txt");
        gudangUtama.tambahBarang(new Barang("Laptop lenovo", 8500000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 15));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanik", 450000, 8));
        gudangUtama.tambahBarang(new Barang("Kamera Cctv", 3560000, 10));
        gudangUtama.tambahBarang(new Barang("Smartphone", 3000000, 4));

        // Tampilkan awal dan simpan ke file teks
        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();

        // 3. Membuat objek Gudang baru, memuat kembali dari berkas, dan hitung total nilai persediaan
        System.out.println("--- Menguji Objek Gudang Baru (Memuat dari File) ---");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        
        // Menampilkan total nilai persediaan barang
        System.out.println("Total Nilai Persediaan Barang: Rp" + gudangBaru.totalNilai());
    } 
}
