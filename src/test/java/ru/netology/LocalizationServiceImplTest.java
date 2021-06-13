package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @Test
    void localeRus() {
        Country RUS = Country.RUSSIA;
        String expectedRus = "Добро пожаловать";
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String actualRus = localizationService.locale(RUS);

        Assertions.assertEquals(actualRus, expectedRus);
    }

    @Test
    void localeUSA() {
        Country USA = Country.USA;
        String expectedUSA = "Welcome";
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String actualUSA = localizationService.locale(USA);

        Assertions.assertEquals(actualUSA, expectedUSA);
    }
}