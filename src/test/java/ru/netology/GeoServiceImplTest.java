package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class GeoServiceImplTest {
    Country expectedRus = Country.RUSSIA;
    Country expectedUSA = Country.USA;
    GeoServiceImpl geoService = new GeoServiceImpl();

    @Test
    void byIp_assertNull() {
        Country localhost = geoService.byIp(GeoServiceImpl.LOCALHOST).getCountry();
        Assertions.assertNull(localhost);
    }

    @Test
    void byIp_assertRus() {
        Country moscow = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(expectedRus, moscow);
    }

    @Test
    void byIp_assertUSA() {
        Country ny = geoService.byIp(GeoServiceImpl.NEW_YORK_IP).getCountry();
        Assertions.assertEquals(expectedUSA, ny);
    }

    @Test
    void byIp_assertStartRUS() {
        Country russia = geoService.byIp("172.105.66.77").getCountry();
        Assertions.assertEquals(expectedRus, russia);
    }

    @Test
    void byIp_assertStartUSA() {
        Country usa = geoService.byIp("96.105.66.77").getCountry();
        Assertions.assertEquals(expectedUSA, usa);
    }
}