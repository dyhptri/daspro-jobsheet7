import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total =0;

        
        do {
            System.out.println("Masukkan jenis kendaraan ( 1 mobi, 2 motor, 0 keluar)");
            jenis = input.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir(jam)");
                durasi = input.nextInt();

                if (durasi > 5){
                    total += 12500;
                } else {
                    if (jenis ==1){
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    } 
                } 
                System.out.println("Total pembayaran: " + total);
            } 
        } while (jenis != 0);
    }
    
}
