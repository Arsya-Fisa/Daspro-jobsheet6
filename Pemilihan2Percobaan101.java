import java.util.Scanner;

public class Pemilihan2Percobaan101 {

    public static void main(String[] args) {
        Scanner absen01 = new Scanner (System.in);

        int tahun;

        System.out.print("Masukan Tahun: ");
        tahun = absen01.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                  if ((tahun % 400) ==0) {
                    System.out.println("Tahun Kabisat ");
                  }else
                  System.out.println("Bukan tahun kabisat");
            }else
            System.out.println("Bukan tahun kabisat");
        } else
            System.out.println("Bukan tahun kabisat");
        
    }
}