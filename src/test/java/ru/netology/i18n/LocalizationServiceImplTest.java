package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LocalizationServiceTest {


    @ParameterizedTest
    @ValueSource(strings = "RUSSIA")
    void locale(String country) {
        String salute = "Добро пожаловать";
        Assertions.assertEquals(country, salute);
    }


}