package CheckoutBuah;

import java.util.*;

class Buah {
    String nama;
    int stok;

    public Buah(String nama, int stok){
        this.nama = nama;
        this.stok = stok;
        
    }
    
    void pembelian(int jmlh){
        if (jmlh <= stok) {
            stok -= jmlh;
            System.out.println("Berhasil checkout buah");
            System.out.println("Sisa buah = " + stok);
        }else{
            System.out.println("Gagal checkout buah");
        }
    }
}

class Manusia {
    String nama;
    int jumlahBeli;

    public Manusia(String nama, int jumlahBeli){
        this.nama = nama;
        this.jumlahBeli = jumlahBeli;
}
    
    void pembelian(Buah b1){
        b1.pembelian(jumlahBeli);

    }
}
public class Solution {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            String namaBuah = input.nextLine();
            int stokBuah = input.nextInt();
            int jumlahBeli = input.nextInt();
            
            if (stokBuah == 0 || jumlahBeli == 0){
                System.out.println("NA");
            }else{
                Buah b1 = new Buah(namaBuah, stokBuah);
                Manusia m1 = new Manusia("Ani", jumlahBeli);
                
                m1.pembelian(b1);
            }
        }
    }
}