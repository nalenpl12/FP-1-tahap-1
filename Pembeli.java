package umkm;

public class Pembeli {
          //data

     private String namaPembeli;
     
     //method

     Pembeli() {
          System.out.println("Constructor Default");
     }

     Pembeli(String n, int h, int s) {
          namaPembeli = n;
          System.out.println("Object " + namaPembeli + " dibuat");
     }

     public String getNama() {
          return namaPembeli;
     }

}
