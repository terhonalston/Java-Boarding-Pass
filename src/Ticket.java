import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        System.out.println("Enter Name: ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        System.out.println("Enter Email: ");
        String inputEmail = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String inputPhone = scanner.nextLine();
        System.out.println("Enter Gender: ");
        String inputGender = scanner.nextLine();
        System.out.println("Enter Age: ");
        String inputAge = scanner.nextLine();
        System.out.println("Enter Boarding pass: ");
        String inputPass = scanner.nextLine();
        System.out.println("Enter Date: ");
        String inputDate = scanner.nextLine();
        System.out.println("Enter Orgin: ");
        String inputOrigin = scanner.nextLine();
        System.out.println("Enter Destination: ");
        String inputDest = scanner.nextLine();
        System.out.println("Enter Estimated time of arrival (ETA): ");
        String inputETA = scanner.nextLine();
        System.out.println("Enter Departure time: ");
        String inputDeparture = scanner.nextLine();
    }
}
