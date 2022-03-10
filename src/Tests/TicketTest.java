import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    Ticket ticket = new Ticket("Ash", "ash1@yahoo.com", "123-456-7890",
            "Female", "25", "123456", "03/10/2022", "NYC", "Atlanta",
            "30", "10am");
    @BeforeEach
    void setUp() {
        Ticket ticket = new Ticket("Ash", "ash1@yahoo.com", "123-456-7890",
                "Female", "25", "123456", "03/10/2022", "NYC", "Atlanta",
                "30", "10am");
    }

    @Test
    void getName() {
        assertEquals(ticket.getName(), "Ash");
    }

    @Test
    void setName() {
        ticket.setName("Brock");
        assertEquals(ticket.getName(), "Brock");
    }

    @Test
    void getEmail() {
        assertEquals(ticket.getEmail(), "ash1@yahoo.com");
    }

    @Test
    void setEmail() {
        ticket.setEmail("pikachu@gmail.com");
        assertEquals(ticket.getEmail(), "pikachu@gmail.com");
    }

    @Test
    void getPhoneNumber() {
        assertEquals(ticket.getPhoneNumber(), "123-456-7890");
    }

    @Test
    void setPhoneNumber() {
        ticket.setPhoneNumber("098-765-4321");
        assertEquals(ticket.getPhoneNumber(), "098-765-4321");
    }

    @Test
    void getGender() {
        assertEquals(ticket.getGender(), "Female");
    }

    @Test
    void setGender() {
        ticket.setGender("Male");
        assertEquals(ticket.getGender(), "Male");
    }

    @Test
    void getAge() {
        assertEquals(ticket.getAge(), "25");
    }

    @Test
    void setAge() {
        ticket.setAge("30");
        assertEquals(ticket.getAge(), "30");
    }

    @Test
    void getBoardingNumber() {
        assertEquals(ticket.getBoardingNumber(), "123456");
    }

    @Test
    void setBoardingNumber() {
        ticket.setBoardingNumber("333444");
        assertEquals(ticket.getBoardingNumber(), "333444");
    }

    @Test
    void getDate() {
        assertEquals(ticket.getDate(), "03/10/2022");
    }

    @Test
    void setDate() {
        ticket.setDate("03/11/2022");
        assertEquals(ticket.getDate(), "03/11/2022");
    }

    @Test
    void getOrigin() {
        assertEquals(ticket.getOrigin(), "NYC");
    }

    @Test
    void setOrigin() {
        ticket.setOrigin("Atlanta");
        assertEquals(ticket.getOrigin(), "Atlanta");
    }

    @Test
    void getDestination() {
        assertEquals(ticket.getDestination(), "Atlanta");
    }

    @Test
    void setDestination() {
        ticket.setDestination("NYC");
        assertEquals(ticket.getDestination(), "NYC");
    }

    @Test
    void getETA() {
        assertEquals(ticket.getETA(), "30");
    }

    @Test
    void setETA() {
        ticket.setETA("50");
        assertEquals(ticket.getETA(), "50");
    }

    @Test
    void getDepartureTime() {
        assertEquals(ticket.getDepartureTime(), "10am");
    }

    @Test
    void setDepartureTime() {
        ticket.setDepartureTime("12pm");
        assertEquals(ticket.getDepartureTime(), "12pm");
    }

    @Test
    void getPrice() {
        ticket.setPrice(30);
        assertEquals(ticket.getPrice(), 30);
    }

    @Test
    void setPrice() {
        ticket.setPrice(30);
        assertEquals(ticket.getPrice(), 30);
    }
}