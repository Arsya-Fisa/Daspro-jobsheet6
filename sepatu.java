import java.util.Scanner;
public class sepatu {
    public static void main(String[] args) {
        Scanner absen01 = new Scanner(System.in);

        String merk, kategori;
        String slip_on;
        int ukuran;
        int harga = 0;

        System.out.println("Masukan jenis Merk: ");
        merk = absen01.nextLine();
        System.out.println("Masukan kategpri sepatu: ");
        kategori  = absen01.nextLine();
        System.out.println("Masukan ukuran sepatu: ");
        ukuran = absen01.nextInt();

        if (merk.equals("converse")) {
            if (kategori.equals("slip on")) {
                if (ukuran >= 36 && ukuran <=40) {
                    harga = 800000;
                }
            }else if (kategori.equals("high top")) {
                if (ukuran >= 40 && ukuran <=44) {
                    harga = 1200000;
                }
            } else
            System.out.println("Kategori tidak ada");
        }
        if (merk.equals("sketcher")) {
            if (kategori.equals("woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                }
               
            }else if (kategori.equals("man")) {
                if (ukuran >= 41 && ukuran <=44 ) {
                    harga = 1800000;
                }
                
            }else
            System.out.println("Kategori tidak ada");
        }
        if (merk.equals("nike")) {
            if (kategori.equals("kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                }
            }else if (kategori.equals("adults")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                }
                
            }else
            System.out.println("Kategori tidak ada");
        }
        
        System.out.println("harga sepatu: " + harga );
        
        
    }
}
