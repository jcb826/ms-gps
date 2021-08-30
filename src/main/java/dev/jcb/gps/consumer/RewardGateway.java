package dev.jcb.gps.consumer;

import gpsUtil.location.Attraction;
import gpsUtil.location.Location;
import gpsUtil.location.VisitedLocation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class RewardGateway {

    private  RestTemplate restTemplate;

    public RewardGateway() {
    }

    public RewardGateway(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public ResponseEntity<Boolean> isWithinAttractionProximity(Attraction attraction, Location location) {

        return restTemplate.getForEntity("localhost:8092/gps/", Boolean.class);
    }
}
