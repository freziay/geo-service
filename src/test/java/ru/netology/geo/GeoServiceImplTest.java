package ru.netology.geo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.function.Executable;

import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Location;

import static ru.netology.geo.GeoServiceImpl.MOSCOW_IP;

class GeoServiceImplTest {
    GeoService geoService = new GeoServiceImpl();

    @ParameterizedTest

    @ValueSource(strings = {MOSCOW_IP})
    void checkingLocation(String ip) {
        String location = "Moscow";
        Location actualLocation = geoService.byIp(ip);
        Assertions.assertEquals(location, actualLocation.getCity());
    }
    @Test
    void byCoordinates() {

        GeoServiceImpl geo = new GeoServiceImpl();
        double coordinate = 1.1;
        double coordinate1 = 1.2;

        Executable executable = ()-> geo.byCoordinates(coordinate,coordinate);

        Assertions.assertThrows(RuntimeException.class, executable);




    }
}
