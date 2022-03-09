import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> boardingPassList = new HashSet<>();
        Path path = Path.of("src/TicketInfo.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        Ticket ticket = new Ticket();
        inputInformation(ticket, scanner, boardingPassList, path);
        System.out.println(ticket.getName());
        System.out.println(ticket.getAge());
    }

    public static void inputInformation(Ticket ticket, Scanner scanner, HashSet<Integer>boardingPassList, Path filePath) throws IOException {
        ArrayList<String> oneTicket = new ArrayList<>();

        System.out.println("Enter your name.");
        ticket.setName(scanner.nextLine());
        oneTicket.add(ticket.getName());

        System.out.println("Enter your email.");
        ticket.setEmail(scanner.nextLine());
        oneTicket.add(ticket.getEmail());

        System.out.println("Enter your phone number.");
        ticket.setPhoneNumber(scanner.nextLine());
        oneTicket.add(ticket.getPhoneNumber());

        System.out.println("Enter your gender.");
        ticket.setGender(scanner.nextLine());
        oneTicket.add(ticket.getGender());

        System.out.println("Enter your age.");
        ticket.setAge(scanner.nextLine());
        oneTicket.add(ticket.getAge());

        ticket.setBoardingNumber(Integer.toString(boardingPassNumber(boardingPassList)));
        oneTicket.add(ticket.getBoardingNumber());

        System.out.println("Enter the date.");
        ticket.setDate(scanner.nextLine());
        oneTicket.add(ticket.getDate());

        System.out.println("Enter your origin.");
        ticket.setOrigin(scanner.nextLine());
        oneTicket.add(ticket.getOrigin());

        System.out.println("Enter your dest.");
        ticket.setDestination(scanner.nextLine());
        oneTicket.add(ticket.getDestination());

        System.out.println("Enter your ETA.");
        ticket.setETA(scanner.nextLine());
        oneTicket.add(ticket.getETA());

        System.out.println("Enter your departure.");
        ticket.setDeparture(scanner.nextLine());
        oneTicket.add(ticket.getDeparture());

        String ticketInfo = String.join(", ", oneTicket);
        Files.writeString(filePath, ticketInfo );
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
