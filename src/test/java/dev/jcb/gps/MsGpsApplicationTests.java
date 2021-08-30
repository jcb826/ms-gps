package dev.jcb.gps;

import dev.jcb.gps.consumer.RewardGateway;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


import java.util.Locale;
import java.util.UUID;

@SpringBootTest
class MsGpsApplicationTests {


    /*
        @Test
        void contextLoads() {
        }
        public void isWithinAttractionProximity() {

            GpsUtil gpsUtil = new GpsUtil();
            RewardsService rewardsService = new RewardsService(gpsUtil, new RewardCentral());
            Attraction attraction = gpsUtil.getAttractions().get(0);
            assertTrue(rewardsService.isWithinAttractionProximity(attraction, attraction));
        }

     */
    @Test
    public void getUserLocationTest() {
        Locale.setDefault(new Locale("en", "US"));
        GpsUtil gpsUtil = new GpsUtil();
        RewardGateway rewardGateway = new RewardGateway();
        GpsService gpsService = new GpsService( gpsUtil, rewardGateway);
        VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString("2ac2923d-31a8-4ca3-a9d6-117bc50d86ed"));

    }
}
