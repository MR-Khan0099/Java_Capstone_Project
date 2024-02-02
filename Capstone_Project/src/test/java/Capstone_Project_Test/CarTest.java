package Capstone_Project_Test;

//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Capstone_Project.Car;

public class CarTest {

    @Test
    public void testCarConstructorAndLicensePlate() {
        String licensePlate = "ABC123";
        Car car = new Car(licensePlate);
        assertEquals("The license plate should match the constructor argument", licensePlate, car.getLicensePlate());
    }
}
