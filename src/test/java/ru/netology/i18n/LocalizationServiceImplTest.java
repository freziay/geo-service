package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.entity.Country;

import java.util.stream.Stream;

import static ru.netology.entity.Country.*;
import static ru.netology.geo.GeoServiceImpl.*;

class LocalizationServiceImplTest {
    LocalizationService localizationService = new LocalizationServiceImpl();

    @Test
    @EnumSource
    @MethodSource("localeSours")
    void locale(Country country) {
        String countryTest = localizationService.locale(country);
        System.out.println(countryTest);
        Assertions.assertEquals(countryTest, country);


    }

    public static Stream<Arguments> localeSours() {
        return Stream.of(
                Arguments.of(RUSSIA),
                Arguments.of(GERMANY),
                Arguments.of(USA),
                Arguments.of(BRAZIL));
    }
}