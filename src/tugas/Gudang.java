
package tugas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Gudang {
    // ArrayList menampung objek bertipe Barang
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    // Menambahkan barang ke dalam ArrayList
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    // Menampilkan semua barang di gudang
    public void tampilkanSemua() {
        System.out.println("== Daftar Barang di Gudang ==");
        if (daftarBarang.isEmpty()) {
            System.out.println("(Gudang Kosong)");
        } else {
            for (int i = 0; i < daftarBarang.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBarang.get(i).info());
            }
        }
    }

    // Menyimpan semua data barang ke berkas teks (barang.txt)
    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftarBarang) {
                penulis.println(b.keBaris());
            }
            System.out.println("Data barang berhasil disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data barang: " + e.getMessage());
        }
    }

    // Membaca kembali data barang dari berkas teks ke dalam ArrayList
    public void muatDariBerkas() {
        daftarBarang.clear(); // Bersihkan list sebelum memuat data baru
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                    String nama = bagian[0];
                    double harga = Double.parseDouble(bagian[1]); // Konversi String ke double
                    int stok = Integer.parseInt(bagian[2]);       // Konversi String ke int
                    daftarBarang.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("Data barang berhasil dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat data barang: " + e.getMessage());
        }
    }

    // Menghitung total nilai persediaan (Harga * Stok) dari seluruh barang
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }
    
}
