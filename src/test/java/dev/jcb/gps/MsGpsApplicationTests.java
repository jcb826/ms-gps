package dev.jcb.gps;

import dev.jcb.gps.consumer.RewardGateway;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Locale;
import java.util.UUID;


@SpringBootTest
class MsGpsApplicationTests {

    @Autowired
    GpsService gpsService;


    @Test
    public void getUserLocationTest() {
        Locale.setDefault(new Locale("en", "US"));
        GpsUtil gpsUtil = new GpsUtil();
        RewardGateway rewardGateway = new RewardGateway();
        GpsService gpsService = new GpsService(gpsUtil, rewardGateway);
        VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString("2ac2923d-31a8-4ca3-a9d6-117bc50d86ed"));

    }
}
