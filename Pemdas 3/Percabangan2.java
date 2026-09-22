import java.util.Scanner;
public class Percabangan2 {

    public static void main(String[] args) {

        String statusMember ;
        double diskon ; 

        Scanner input = new Scanner(System.in);
        System.out.print("Status member (GOLD/SILVER/BRONZE/REGULER): ");
        statusMember = input.nextLine();

        if (statusMember.equals("GOLD")) {
            diskon = 0.2;
        } else if (statusMember.equals("SILVER")) {
            diskon = 0.15;
        } else if (statusMember.equals("BRONZE")) {
            diskon = 0.1;
        } else {
            diskon = 0;
        }
        System.out.println("Status member: " + statusMember);
        System.out.println("Diskon yang diberikan: " + (diskon * 100) + "%");
    }
}
