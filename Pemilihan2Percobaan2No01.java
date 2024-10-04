import java.util.Scanner;

public class Pemilihan2Percobaan2No01 {
    public static void main(String[] args) {
        Scanner absen01 = new Scanner(System.in);


        int pilihan_Menu;
        String member;
        double harga, diskon, total_bayar;


        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("4. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih = ");
        pilihan_Menu = absen01.nextInt();
        absen01.nextLine();
        System.out.print("Apakah punya memeber (y/n) ? = ");
        member = absen01.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_Menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            
            }else if (pilihan_Menu == 2) {
                harga = 3000;
                System.out.println("Harga Teh = " + harga);

            }else if (pilihan_Menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =  " + harga);

            }else {
                System.out.println("Masukan pilihan Menu dengan benar");
                return;
            }
        
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_Menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            
            }else if (pilihan_Menu == 2) {
                harga = 3000;
                System.out.println("Harga Teh = " + harga);

            }else if (pilihan_Menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =  " + harga);

            }else {
                System.out.println("Masukan pilihan Menu dengan benar");
                return;
            }
                System.out.println("Total Bayar = " + harga);

            
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("------------------------------------------");
    
    
    }

}   

