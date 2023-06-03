package Latihan2;

public class Main {
    public static void main(String[] args) {
      
        // Jalankan kode program disini
        Perpustakaan perpustakaan = new Perpustakaan();

        Anggota rendy = new Anggota("Rendy", "A001");
        Anggota rihanna = new Anggota("Rihana", "A002");

        Buku buku1 = new Buku("Algoritma Pemrograman", "John Doe", 2022);
        Buku buku2 = new Buku("Sistem Jaringan Komputer", "Jane Smith", 2023);

        perpustakaan.pinjamBuku(buku1, rendy);
        perpustakaan.pinjamBuku(buku2, rihanna);
        perpustakaan.pinjamBuku(buku2, rendy);
        perpustakaan.kembalikanBuku(buku1, rendy);
        perpustakaan.kembalikanBuku(buku1, rihanna);
      }
}
