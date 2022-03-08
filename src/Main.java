import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> boardingPassList = new HashSet<>();
        Ticket ticket = new Ticket();
        inputInformation(ticket, scanner, boardingPassList);
        System.out.println(ticket.getInputName());
        System.out.println(ticket.getInputAge());
    }

    public static void inputInformation(Ticket ticket, Scanner scanner, HashSet<Integer>boardingPassList){
        System.out.println("Enter your name.");
        ticket.setInputName(scanner.nextLine());
        System.out.println("Enter your email.");
        ticket.setInputEmail(scanner.nextLine());
        System.out.println("Enter your phone number.");
        ticket.setInputPhone(scanner.nextLine());
        System.out.println("Enter your gender.");
        ticket.setInputGender(scanner.nextLine());
        System.out.println("Enter your age.");
        ticket.setInputAge(scanner.nextLine());
        ticket.setInputPass(Integer.toString(boardingPassNumber(boardingPassList)));
        System.out.println("Enter your date.");
        ticket.setInputDate(scanner.nextLine());
        System.out.println("Enter your origin.");
        ticket.setInputOrigin(scanner.nextLine());
        System.out.println("Enter your dest.");
        ticket.setInputDest(scanner.nextLine());
        System.out.println("Enter your ETA.");
        ticket.setInputETA(scanner.nextLine());
        System.out.println("Enter your departure.");
        ticket.setInputDeparture(scanner.nextLine());
    }
    public static int boardingPassNumber(HashSet<Integer>boardingPassList){
        boolean numberNotAdded = true;
        int boardingPassNumber = 0;
        while(numberNotAdded) {
            boardingPassNumber= (int) (100000+(Math.random()*999999));
            while (!boardingPassList.contains(boardingPassNumber)) {
                boardingPassList.add(boardingPassNumber);
                numberNotAdded = false;
            }
        }
        return boardingPassNumber;
    }
}
