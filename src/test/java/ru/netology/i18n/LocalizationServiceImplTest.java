package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Country;

import static ru.netology.entity.Country.RUSSIA;
import static ru.netology.entity.Country.USA;

class LocalizationServiceTest {
    LocalizationService localizationService = new LocalizationServiceImpl();


    @ParameterizedTest
    @ValueSource(strings = {"Добро пожаловать"})
    void locale(String country) {
        String countryTest = localizationService.locale(RUSSIA);
        Assertions.assertEquals(country, countryTest);
    }
}