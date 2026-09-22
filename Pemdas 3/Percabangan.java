import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {

 
     Scanner input = new Scanner(System.in);
     System.out.print("Masukkan nilai: ");

     if (input.hasNextInt()) {
         int nilai = input.nextInt();
        
         if (nilai >= 85 && nilai <= 100) {
             System.out.println("A");
         } else if (nilai >= 70 && nilai < 84) {
             System.out.println("B");
         } else if (nilai >= 55 && nilai < 69) {
             System.out.println("C");
         } else if (nilai >= 40 && nilai < 54) {
             System.out.println("D");
         } else if (nilai < 40 && nilai >= 0) {
             System.out.println("E");
         } else {
             System.out.println("Nilai tidak valid");
         }
     }

    
}
}