package umkm;

public class Transaksi {

     private Barang barang;
     private int jumlahBarang;
     Transaksi transaksi = null;

     public Transaksi(Barang barang, int jumlahBarang) {
          this.barang = barang;
          this.jumlahBarang = jumlahBarang;
     }

     public Barang getBarang() {
          return barang;
     }

     public int getJumlahBarang() {
          return jumlahBarang;
     }

     public int getTotalHarga() {
          return barang.getHarga() * jumlahBarang;
     }

     public String toString() {
          return "Transaksi"
                  + "barang=" + barang.getNama()
                  + ", jumlahBarang=" + jumlahBarang
                  + ", totalHarga=" + getTotalHarga() ;
     }
}
