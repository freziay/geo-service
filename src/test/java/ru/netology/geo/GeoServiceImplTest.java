package ru.netology.geo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;

import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Location;



import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.geo.GeoServiceImpl.*;

class GeoServiceImplTest {
    GeoService geoService = new GeoServiceImpl();

    @ParameterizedTest

    @ValueSource(strings = {"127.0.0.1", "172.0.32.11","96.44.183.149","172.","96."})
    void checkingLocation(String ip,Location location) {
        Location location1 = geoService.byIp(ip);
        System.out.println(location1);
        Assertions.assertEquals(location1, location);
    }
    @Test
    void byCoordinates() {

        GeoServiceImpl geo = new GeoServiceImpl();
        try {
            geo.byCoordinates(4.8, 8.9);
            fail(" ");
            assertTrue(true);
        } catch (RuntimeException ex) {

            assertTrue(true);
        }
    }
}
