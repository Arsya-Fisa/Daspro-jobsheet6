import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        
        Scanner absen01 = new Scanner(System.in);

        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;

        
        int terbesar; 

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1; 
            } else {
                terbesar = bil3; 
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2; 
            } else {
                terbesar = bil3;
            }
        }

        
        System.out.println("Bilangan terbesar: " + terbesar);

        
        
    }
}
