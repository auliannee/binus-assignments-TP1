//import the scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        String name = scanner.nextLine().trim();

        System.out.println("Stok Gudang Input Barang");
        System.out.println("#########################");
        System.out.println("Selamat Datang " + name);

        System.out.print("Masukkan nama barang yang mau ditambah : ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        int jumlahBarang = scanner.nextInt();
        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        float hargaBeli = scanner.nextFloat();
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        double hargaJual = scanner.nextDouble();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("#########################");

        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.printf("Harga Beli : Rp.%.2f", hargaBeli);
        System.out.printf("\nHarga Jual : Rp.%.2f", hargaJual);
    }
}