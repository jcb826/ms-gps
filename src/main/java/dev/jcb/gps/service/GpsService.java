package dev.jcb.gps.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Configuration
public class GpsService {

    private final GpsUtil gpsUtil;

    public GpsService(GpsUtil gpsUtil) {
        this.gpsUtil = gpsUtil;
    }
    @Bean
public VisitedLocation getUserLocation (UUID id){

        return gpsUtil.getUserLocation(id);
}





}
