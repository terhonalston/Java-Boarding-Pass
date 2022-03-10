import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> boardingPassList = new HashSet<>();
        Locations locations = new Locations();
        Path path = Path.of("src/TicketInfo.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        System.out.println(locations);
        Ticket ticket = new Ticket();
        inputInformation(ticket, scanner, boardingPassList, path, locations);
        System.out.println(ticket.getName());
        System.out.println(ticket.getAge());
        System.out.println(ticket.getETA());
        System.out.println(ticket.getPrice());
    }

    public static void inputInformation(Ticket ticket, Scanner scanner, HashSet<Integer>boardingPassList, Path filePath, Locations locations) throws IOException {
        ArrayList<String> passengersTicket = new ArrayList<>();

        System.out.println("Enter your name.");
        ticket.setName(scanner.nextLine());
        passengersTicket.add(ticket.getName());

        System.out.println("Enter your email.");
        ticket.setEmail(scanner.nextLine());
        passengersTicket.add(ticket.getEmail());

        System.out.println("Enter your phone number.");
        ticket.setPhoneNumber(scanner.nextLine());
        passengersTicket.add(ticket.getPhoneNumber());

        System.out.println("Enter your gender.");
        String gender = scanner.nextLine();
        if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")){
            ticket.setGender(gender);
            passengersTicket.add(ticket.getGender());
        }
        else System.out.println("Please enter your gender.");

        System.out.println("Enter your age.");
        ticket.setAge(scanner.nextLine());
        passengersTicket.add(ticket.getAge());

        //Boarding pass is generated
        ticket.setBoardingNumber(Integer.toString(boardingPassNumber(boardingPassList)));
        passengersTicket.add(ticket.getBoardingNumber());

        System.out.println("Enter the date.");
        ticket.setDate(scanner.nextLine());
        passengersTicket.add(ticket.getDate());

        System.out.println("Enter your origin. Choices are Atlanta, NYC, California.");
        ticket.setOrigin(scanner.nextLine());
        passengersTicket.add(ticket.getOrigin());

        //We can be creative with the destination in order to lower the difficulty.
        //For example, we can create our own world and come up with our own distances.
        System.out.println("Enter your dest. Choices are Atlanta, NYC, California.");
        ticket.setDestination(scanner.nextLine());
        passengersTicket.add(ticket.getDestination());

        //The ETA will need to be generated by us.
        locations.getEta(ticket);
        passengersTicket.add(ticket.getETA());

        System.out.println("Enter your departure time.");
        ticket.setDepartureTime(scanner.nextLine());
        passengersTicket.add(ticket.getDepartureTime());

        //We will also need to generate a total price for the ticket.
        //can try stack
        totalTicketPrice(ticket);
        passengersTicket.add(String.valueOf(totalTicketPrice(ticket)));
        String ticketInfo = String.join(", ", passengersTicket);
        Files.writeString(filePath, ticketInfo );
    }


    public static double totalTicketPrice(Ticket ticket){
        String gender = ticket.getGender();
        int age = Integer.parseInt(ticket.getAge());
        double price = Double.parseDouble(ticket.getETA());
        if(gender.equalsIgnoreCase("Female")){
            price-=price*.25;
            ticket.setPrice(price);
        }
        if(age<=12){
            price-=price * .50;

        }
        if(age>=60){
            price -= price * .60;

        }
        ticket.setPrice(price);
        return price;
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