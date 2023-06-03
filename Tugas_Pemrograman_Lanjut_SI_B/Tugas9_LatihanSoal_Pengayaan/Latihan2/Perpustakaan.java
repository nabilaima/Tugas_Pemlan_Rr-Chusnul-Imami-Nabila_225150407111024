package Latihan2;

public class Perpustakaan implements Peminjaman {
    @Override
    public void pinjamBuku(Buku buku, Anggota anggota) {
        // Logika untuk melakukan peminjaman buku
        if (buku.isDipinjam()) {
            System.out.println("Buku '" + buku.getJudul() + "' sedang dipinjam oleh anggota lain.");
        } else {
            anggota.pinjamBuku(buku);
            System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + anggota.getNama());
        }
    }
  
    @Override
    public void kembalikanBuku(Buku buku, Anggota anggota) {
        // Logika untuk melakukan pengembalian buku
        if (!buku.isDipinjam()) {
            System.out.println("Buku '" + buku.getJudul() + "' tidak sedang dipinjam oleh anggota tersebut.");
        } else {
            anggota.kembalikanBuku(buku);
            System.out.println("Buku '" + buku.getJudul() + "' berhasil dikembalikan oleh " + anggota.getNama());
        }
    }
  }
