package dev.jcb.gps.service;

import dev.jcb.gps.consumer.RewardGateway;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class GpsService {

    private final GpsUtil gpsUtil;
    private final RewardGateway rewardGateway;

    public GpsService(GpsUtil gpsUtil, RewardGateway rewardGateway) {
        this.gpsUtil = gpsUtil;
        this.rewardGateway = rewardGateway;
    }

    public VisitedLocation getUserLocation(UUID id) {

        return gpsUtil.getUserLocation(id);
    }


    public List<Attraction> getAttractions() {

        return gpsUtil.getAttractions();
    }

    public List<Attraction> getNearByAttractions(VisitedLocation visitedLocation) {
        List<Attraction> nearbyAttractions = new ArrayList<>();
        int count = 0;
        for (Attraction attraction : gpsUtil.getAttractions()) {

            if (rewardGateway.isWithinAttractionProximity(attraction, visitedLocation.location).getBody()) {
                nearbyAttractions.add(attraction);
                count++;
                if(count==5){
                    break;
                }


            }
        }

        return nearbyAttractions;
    }


}
