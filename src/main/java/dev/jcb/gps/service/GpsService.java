package dev.jcb.gps.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class GpsService {

    private final GpsUtil gpsUtil;

    public GpsService(GpsUtil gpsUtil) {
        this.gpsUtil = gpsUtil;
    }

public VisitedLocation getUserLocation (UUID id){

        return gpsUtil.getUserLocation(id);
}


    public List<Attraction> getAttractions (){

        return gpsUtil.getAttractions();
    }
    // gps
    public List<Attraction> getNearByAttractions(VisitedLocation visitedLocation) {
        List<Attraction> nearbyAttractions = new ArrayList<>();
        for(Attraction attraction : gpsUtil.getAttractions()) {
            // gerer la connection à ms-reward
            if(rewardsService.isWithinAttractionProximity(attraction, visitedLocation.location)) {
                nearbyAttractions.add(attraction);
            }
        }

        return nearbyAttractions;
    }




}
