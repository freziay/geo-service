package geo;

import org.junit.jupiter.api.Test;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.assertTrue;
//
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class byCoordinatesTest {
    @Test
    void s(){
        GeoServiceImpl geo = new GeoServiceImpl();
        try {
            geo.byCoordinates(4.8,8.9);
            fail(" ");
            assertTrue(true);
        } catch (RuntimeException ex){

            assertTrue(true);
        }
    }
}
