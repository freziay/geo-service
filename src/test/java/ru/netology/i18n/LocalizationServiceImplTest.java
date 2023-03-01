package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

enum Direction {
    RUSSIA, GERMANY, USA, BRAZIL;


    @EnumSource(Direction.class);
    @ParameterizedTest

    void locale(Direction country) {
        Assertions.assertNull(country);


    }


}