import java.util.Scanner;

public class KafeDoWhile07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int kopi, teh, roti, totalHarga;
       String namaPelanggan;
       int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

       do {
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = input.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Tranksaksi dibatalkan.");
            break;
        }
        System.out.println("jumlah kopi: ");
        kopi = input.nextInt();
        System.out.println("jumlah teh: ");
        teh = input.nextInt();
        System.out.println("jumlah roti: ");
        roti = input.nextInt();

        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        input.nextLine();
       } while (true);

       System.out.println("Semua transaksi selesai.");
    }
}
