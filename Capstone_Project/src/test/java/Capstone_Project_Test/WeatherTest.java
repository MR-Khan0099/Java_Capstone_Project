package Capstone_Project_Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Capstone_Project.ChargingStationGUI;
import Capstone_Project.Weather;

public class WeatherTest {

    private Weather weather;
    private ChargingStationGUI mockGui;

    @Before
    public void setUp() {
        mockGui = mock(ChargingStationGUI.class);
        weather = new Weather(mockGui);
    }

    @Test
    public void testIsSunnyInitially() {
        assertTrue("Weather should initially be sunny", weather.isSunny());
    }
}
