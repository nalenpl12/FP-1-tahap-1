package umkm;

public class Barang {
     //data

     private String nama, kode;
     private int harga, stok;
     //method

     Barang() {
          System.out.println("Constructor Default");
     }

     Barang(String n, int h, int s) {
          nama = n;
          harga = h;
          stok = s;
          System.out.println("Object " + nama + " dibuat");
     }

     public void setHarga(int h) {
          harga = h;
     }

     public void setStok(int s) {
          stok = s;
     }

     public String getNama() {
          return nama;
     }

     public int getHarga() {
          return harga;
     }

     public int getStok() {
          return stok;
     }

     public String toString() {
          return nama + " => harga: " + harga + " stok: " + stok;
     }
}
