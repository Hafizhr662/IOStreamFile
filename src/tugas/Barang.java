
package tugas;


public class Barang {
    // Atribut model barang
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah data objek menjadi satu baris teks dipisah ';' untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Menampilkan informasi detail barang
    public String info() {
        return nama + " - Harga: Rp" + harga + " | Stok: " + stok;
    }
}
