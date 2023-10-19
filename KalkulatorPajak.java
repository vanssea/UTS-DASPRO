import java.util.Scanner;
public class KalkulatorPajak {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        
        System.out.println("Apakah Anda memiliki usaha? (ya/tidak)");
        String memilikiUsaha = input28.nextLine();
        
        double penghasilan = 0;
        if (memilikiUsaha.equalsIgnoreCase("ya")) {
            System.out.println("Masukkan penghasilan Anda dalam 1 tahun:");
            penghasilan = input28.nextDouble();
            input28.nextLine();
        }
        
        double pajakPenghasilan = 0.15 * penghasilan;
        
        System.out.println("Masukkan jumlah jenis harta kekayaan yang Anda miliki:");
        int jumlahHarta = input28.nextInt();
        input28.nextLine();
        
        double totalHarta = 0;
        for (int i = 0; i < jumlahHarta; i++) {
            System.out.println("Masukkan nama harta " + (i + 1) + ":");
            String namaHarta = input28.nextLine();
            
            System.out.println("Masukkan nilai jual " + namaHarta + ":");
            double nilaiJual = input28.nextDouble();
            input28.nextLine();
            
            totalHarta += nilaiJual;
        }
        
        System.out.println("Apakah Anda sudah berkeluarga? (ya/tidak)");
        String berkeluarga = input28.nextLine();
        
        double potonganPajak = 0;
        if (berkeluarga.equalsIgnoreCase("ya")) {
            System.out.println("Berapa anak Anda yang berstatus kuliah?");
            int anakKuliah = input28.nextInt();
            
            System.out.println("Berapa anak Anda yang berstatus SMA?");
            int anakSMA = input28.nextInt();
            
            if (anakKuliah == 1 && anakSMA == 1 && totalHarta >= 50000000) {
                potonganPajak = 0.10;
            } else if (anakKuliah == 0 && anakSMA == 0 && totalHarta < 50000000) {
                potonganPajak = 0.05;
            }
        }
        
        double totalPajak = (pajakPenghasilan + totalHarta) * (1 - potonganPajak);
        
        System.out.println("Pajak yang harus Anda bayar adalah: Rp" + totalPajak);
    }
}

