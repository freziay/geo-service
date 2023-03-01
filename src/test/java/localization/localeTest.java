package localization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.EnumSource;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThat;

import static ru.netology.entity.Country.BRAZIL;
import static ru.netology.entity.Country.RUSSIA;

public class localeTest {
    @EnumSource

    @Test
    void checkingTheCountry (){
        String russia = "Добро пожаловать";
        String other = "Welcome";
        System.out.println("++++++");
        LocalizationServiceImpl lc = new LocalizationServiceImpl();
        assertEquals(lc.locale(RUSSIA),russia);
        assertEquals(lc.locale(BRAZIL),other);
        }
    }



