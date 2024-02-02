package Capstone_Project_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;

import Capstone_Project.Car;
import Capstone_Project.CarQueue;
import Capstone_Project.ChargingStationGUI;

public class CarQueueTest {

    private CarQueue carQueue;
    private ChargingStationGUI mockGui;

    @Before
    public void setUp() {
        mockGui = mock(ChargingStationGUI.class);
        carQueue = new CarQueue(mockGui);
        while (carQueue.getNextCar() != null)
            ;
    }

    @Test
    public void testAddCar() {
        Car car = new Car("777AAA");
        carQueue.addCar(car);
        assertEquals("Queue size should be 1 after adding a car", 1, carQueue.getQueueSize());
        verify(mockGui).updateQueue(0); // Verify GUI is updated with new queue size
    }

    @Test
    public void testGetNextCarFromEmptyQueue() {
        assertNull("getNextCar should return null for an empty queue", carQueue.getNextCar());
    }

    @Test
    public void testGetNextCar() {
        Car car = new Car("AAA700");
        carQueue.addCar(car);
        Car retrievedCar = carQueue.getNextCar();
        assertEquals("Retrieved car should be the same as the one added", car, retrievedCar);
    }
}
