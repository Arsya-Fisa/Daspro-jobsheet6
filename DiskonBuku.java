import java.util.Scanner;

public class DiskonBuku {
    public static void main(String[] args) {
        Scanner absen01 = new Scanner(System.in);

        System.out.print("Masukkan harga buku: ");
        double hargaBuku = absen01.nextDouble();
        System.out.print("Masukkan jenis buku (kamus, novel, lainnya): ");
        String jenisBuku = absen01.next();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = absen01.nextInt();

        double diskon = 0;

        
        if (jenisBuku.equals("kamus")) {
            diskon = 10; 
            if (jumlahBuku > 2) {
                diskon += 2; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7; 
            if (jumlahBuku > 3) {
                diskon += 2; 
            } else {
                diskon += 1; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5; 
        }

        
        double totalDiskon = (hargaBuku * jumlahBuku * diskon) / 100;
        double totalPembayaran = (hargaBuku * jumlahBuku) - totalDiskon;

        
        System.out.printf("Total Diskon:" + totalDiskon);
        System.out.printf("Total Pembayaran" + totalPembayaran);
 
        
    }
}
}


