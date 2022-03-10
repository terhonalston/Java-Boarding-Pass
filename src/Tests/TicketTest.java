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
    }

    @Test
    void setOrigin() {
    }

    @Test
    void getDestination() {
    }

    @Test
    void setDestination() {
    }

    @Test
    void getETA() {
    }

    @Test
    void setETA() {
    }

    @Test
    void getDepartureTime() {
    }

    @Test
    void setDepartureTime() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void testGetName() {
    }

    @Test
    void testSetName() {
    }

    @Test
    void testGetEmail() {
    }

    @Test
    void testSetEmail() {
    }

    @Test
    void testGetPhoneNumber() {
    }

    @Test
    void testSetPhoneNumber() {
    }

    @Test
    void testGetGender() {
    }

    @Test
    void testSetGender() {
    }

    @Test
    void testGetAge() {
    }

    @Test
    void testSetAge() {
    }

    @Test
    void testGetBoardingNumber() {
    }

    @Test
    void testSetBoardingNumber() {
    }

    @Test
    void testGetDate() {
    }

    @Test
    void testSetDate() {
    }

    @Test
    void testGetOrigin() {
    }

    @Test
    void testSetOrigin() {
    }

    @Test
    void testGetDestination() {
    }

    @Test
    void testSetDestination() {
    }

    @Test
    void testGetETA() {
    }

    @Test
    void testSetETA() {
    }

    @Test
    void testGetDepartureTime() {
    }

    @Test
    void testSetDepartureTime() {
    }

    @Test
    void testGetPrice() {
    }

    @Test
    void testSetPrice() {
    }
}