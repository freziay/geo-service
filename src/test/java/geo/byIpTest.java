package geo;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static ru.netology.geo.GeoServiceImpl.*;

public class byIpTest {
    @ValueSource(strings = {LOCALHOST, MOSCOW_IP, NEW_YORK_IP, "172.", "96."})
    @ParameterizedTest
    void a(String a) {
        GeoServiceImpl geoService = new GeoServiceImpl();
        List<Location> stringList = new ArrayList<Location>();
        stringList.add(new Location(null, null, null, 0));
        stringList.add(new Location("Moscow", Country.RUSSIA, "Lenina", 15));
        stringList.add(new Location("New York", Country.USA, " 10th Avenue", 32));
        stringList.add(new Location("Moscow", Country.RUSSIA, null, 0));
        stringList.add(new Location("New York", Country.USA, null, 0));
        for (int i = 0; i < 5; i++) {
            Location b = geoService.byIp(a);
            System.out.println(b);
            Assertions.assertThat(b).isEqualTo(stringList.get(1));
        }


    }
}




