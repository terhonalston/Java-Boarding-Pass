import java.util.Scanner;

public class Ticket {
        Scanner scanner= new Scanner(System.in);

        String name;
        String email;
        String phoneNumber;
        String gender;
        String age;
        String boardingNumber;
        String date;
        String origin;
        String destination;
        String ETA;
        String departure;
        public Ticket(){

        }

        public Ticket(String Name, String Email, String phoneNumber, String Gender,
                      String Age, String boardingNumber, String Date, String Origin, String destination,
                      String ETA, String departure) {
                this.name = Name;
                this.email = Email;
                this.phoneNumber = phoneNumber;
                this.gender = Gender;
                this.age = Age;
                this.boardingNumber = boardingNumber;
                this.date = Date;
                this.origin = Origin;
                this.destination = destination;
                this.ETA = ETA;
                this.departure = departure;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {
                this.age = age;
        }

        public String getBoardingNumber() {
                return boardingNumber;
        }

        public void setBoardingNumber(String boardingNumber) {
                this.boardingNumber = boardingNumber;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }

        public String getOrigin() {
                return origin;
        }

        public void setOrigin(String origin) {
                this.origin = origin;
        }

        public String getDestination() {
                return destination;
        }

        public void setDestination(String destination) {
                this.destination = destination;
        }

        public String getETA() {
                return ETA;
        }

        public void setETA(String ETA) {
                this.ETA = ETA;
        }

        public String getDeparture() {
                return departure;
        }

        public void setDeparture(String departure) {
                this.departure = departure;
        }
}
