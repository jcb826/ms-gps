package dev.jcb.gps;

import dev.jcb.gps.consumer.RewardGateway;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootTest
class MsGpsApplicationTests {

@Autowired
GpsService gpsService;
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
    /*
    @Test
    public void highVolumeTrackLocation() {
        Locale.setDefault(new Locale("en", "US"));

        // Users should be incremented up to 100,000, and test finishes within 15 minutes



        List<String> allUsers = IntStream.range(0,10000).mapToObj(i->UUID.randomUUID().toString()).collect(Collectors.toList());

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();


        allUsers.parallelStream().forEach(u-> tourGuideService.trackUserLocation(u));
        stopWatch.stop();
        tourGuideService.tracker.stopTracking();

        System.out.println("highVolumeTrackLocation: Time Elapsed: " + TimeUnit.MILLISECONDS.toSeconds(stopWatch.getTime()) + " seconds.");
        Assertions.assertTrue(TimeUnit.MINUTES.toSeconds(15) >= TimeUnit.MILLISECONDS.toSeconds(stopWatch.getTime()));
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
