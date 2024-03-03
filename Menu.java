package umkm;

import java.util.Scanner;

public class Menu {

     public static void main(String[] args) {
          Transaksi transaksi = null;
          Barang p = new Barang("Paket Sayur Sop", 12000, 25);
          Barang p2 = new Barang("Paket Sayur Asem", 12000, 25);
          Barang p3 = new Barang("Paket Sayur Lodeh", 18000, 20);
          Barang p4 = new Barang("Paket Sayur Bayam Jagung", 12000, 20);
          Scanner sc = new Scanner(System.in);
          int pilih = 0;
          do {
               System.out.println("\n===== MENU =====");
               System.out.println("| 1. Produk    |");
               System.out.println("| 2. Pembeli   |");
               System.out.println("| 3. Transaksi |");
               System.out.println("| 4. Exit      |");
               System.out.println("================");
               System.out.print("Pilih (1/4) : ");
               pilih = sc.nextInt();
               switch (pilih) {
                    case 1:
                         System.out.println("\n==== [Produk] ====");
                         System.out.println("| 1. Tambah      |");
                         System.out.println("| 2. Ubah        |");
                         System.out.println("| 3. Hapus       |");
                         System.out.println("| 4. Detail      |");
                         System.out.println("==================");
                         System.out.print("  Pilih (1/4) : ");
                         int pilih2 = sc.nextInt();
                         switch (pilih2) {
                              case 1:
                                   sc = new Scanner(System.in);
                                   System.out.print("  Nama  : ");
                                   String nm = sc.next();
                                   System.out.print("  Harga : ");
                                   int hg = sc.nextInt();
                                   System.out.print("  Stok  : ");
                                   int st = sc.nextInt();
                                   p2 = new Barang(nm, hg, st);
                                   break;
                              case 2:
                                   System.out.print("  Stok Baru : ");
                                   st = sc.nextInt();
                                   System.out.println(" Yakin Ubah?");
                                   System.out.println(" 1. Yakin");
                                   System.out.println(" 2. Batal");
                                   System.out.print("Jawab (1/2): ");
                                   int jwb = sc.nextInt();
                                   if (jwb == 1) {
                                        p2.setStok(st);
                                        System.out.println("  Stok berhasil diubah...");
                                   } else {
                                        System.out.println("  Batal merubah stok...");
                                   }
                                   break;
                              case 3:
                                   System.out.print("  Nama : ");
                                   nm = sc.next();
                                   if (nm.equalsIgnoreCase(p2.getNama())) {
                                        p2 = null;
                                        System.out.println("  Produk berhasil dihapus...");
                                   } else {
                                        System.out.println("  Produk tidak ditemukan...");
                                   }
                                   break;
                              case 4:
                                   if (p != null) {
                                        System.out.println(p.toString());
                                        System.out.println(p2.toString());
                                        System.out.println(p3.toString());
                                        System.out.println(p4.toString());
                                   } else {
                                        System.out.println("Objek kosong...");
                                   }
                         }
                         break;
                    case 2:
                         System.out.println("\n==== [Pembeli] ====");
                         System.out.println("| 1. Pilih Barang |");
                         System.out.println("| 2. Pembayaran   |");
                         System.out.println("| 3. Kembali      |");
                         System.out.println("===================");
                         System.out.print("Pilih (1/3) : ");
                         int pilih3 = sc.nextInt();
                         switch (pilih3) {
                              case 1:
                                   System.out.println("Pilih Barang : ");
                                   System.out.println("1. " + p.getNama() + " | harga : " + p.getHarga());
                                   System.out.println("2. " + p2.getNama() + " | harga : " + p2.getHarga());
                                   System.out.println("3. " + p3.getNama() + " | harga : " + p3.getHarga());
                                   System.out.println("4. " + p4.getNama() + " | harga : " + p4.getHarga());
                                   System.out.print("Pilih (1/4) : ");
                                   int pilihanBarang = sc.nextInt();
                                   Barang barangDipilih = null;
                                   switch (pilihanBarang) {
                                        case 1:
                                             barangDipilih = p;
                                             break;
                                        case 2:
                                             barangDipilih = p2;
                                             break;
                                        case 3:
                                             barangDipilih = p3;
                                             break;
                                        case 4:
                                             barangDipilih = p4;
                                             break;
                                        default:
                                             System.out.println("Pilihan tidak ditemukan...");
                                   }
                                   if (barangDipilih != null) {
                                        System.out.println("Anda memilih : " + barangDipilih.getNama());
                                        System.out.print("Berapa jumlah barang yang ingin Anda beli? : ");
                                        int jumlahBarang = sc.nextInt();
                                        transaksi = new Transaksi(barangDipilih, jumlahBarang);
                                        System.out.println("Barang berhasil ditambahkan ke keranjang belanja.");
                                   }
                                   break;

                              case 2:
                                   System.out.println("Hanya dapat melayani pembayaran secara cash");
                                   break;
                              case 3:
                                   break;
                              default:
                                   System.out.println("Pilihan tidak valid...");
                         }
                         break;
                    case 3:
                         System.out.println("\n==== [Transaksi] ====");
                         if (transaksi != null) {
                              System.out.println("=== Detail Pembelanjaan ===");
                              System.out.println("Owner : Nalen ");
                              System.out.println("Kepala Staff : Zyndi");
                              System.out.println("Karyawan : Gilang");
                              System.out.println("Barang : " + transaksi.getBarang().getNama());
                              System.out.println("Harga per barang : Rp." + transaksi.getBarang().getHarga());
                              System.out.println("Jumlah barang : " + transaksi.getJumlahBarang());
                              System.out.println("Total harga: Rp." + transaksi.getTotalHarga());
                              System.out.println("\n===           Struk Transaksi            ===");
                              System.out.println("Nama Barang : " + transaksi.getBarang().getNama());
                              System.out.println("Harga per barang : Rp." + transaksi.getBarang().getHarga());
                              System.out.println("Jumlah barang : " + transaksi.getJumlahBarang());
                              System.out.println("Total harga : Rp." + transaksi.getTotalHarga());
                              System.out.println("Terima Kasih Sudah Belanja Di Nalen Mart");
                              System.out.println("Semoga Sehat Selalu");
                         } else {
                              System.out.println("Belum ada transaksi yang dilakukan.");
                         }
                         break;
                    case 4:
                         System.out.println("Terima kasih");
               }
          } while (pilih != 4);
     }
}
