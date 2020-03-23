import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasTakenADrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void bottleIsEmpty(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void bottleIsFull(){
        assertEquals(100, waterBottle.fillUp());
    }
}
