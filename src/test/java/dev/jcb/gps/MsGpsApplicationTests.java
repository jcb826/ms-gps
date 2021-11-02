package dev.jcb.gps;

import dev.jcb.gps.consumer.RewardGateway;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;


@SpringBootTest
class MsGpsApplicationTests {

    @Autowired
    GpsService gpsService;
    @Autowired
    RestTemplate restTemplate;


    @Test
    public void getNearbyAttractionsTest() throws InterruptedException {
        Locale.setDefault(new Locale("en", "US"));
        VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString("2ac2923d-31a8-4ca3-a9d6-117bc50d86ed"));


        List<Attraction> attractions = gpsService.getNearByAttractions(visitedLocation);


        Assertions.assertEquals(5, attractions.size());
    }


}
