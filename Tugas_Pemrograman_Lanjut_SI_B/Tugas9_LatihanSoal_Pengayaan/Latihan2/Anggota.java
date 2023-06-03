package Latihan2;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String nama;
    private String nomorAnggota;
    private List<Buku> riwayatPeminjaman;

  // constructor, getter, setter, dan method lainnya
public Anggota(String nama, String nomorAnggota) {
    this.nama = nama;
    this.nomorAnggota = nomorAnggota;
    this.riwayatPeminjaman = new ArrayList<>();
}
public String getNama() {
    return nama;
}
public String getNomorAnggota() {
    return nomorAnggota;
}
public List<Buku> getRiwayatPeminjaman() {
    return riwayatPeminjaman;
}
public void pinjamBuku(Buku buku) {
    riwayatPeminjaman.add(buku);
    buku.setDipinjam(true);
}
public void kembalikanBuku(Buku buku) {
    riwayatPeminjaman.remove(buku);
    buku.setDipinjam(false);
}
}
