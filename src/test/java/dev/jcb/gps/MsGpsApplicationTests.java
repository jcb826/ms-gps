package dev.jcb.gps;

import dev.jcb.gps.consumer.RewardGateway;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Locale;
import java.util.UUID;


@SpringBootTest
class MsGpsApplicationTests {

    @Autowired
    GpsService gpsService;


}
