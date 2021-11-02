package dev.jcb.gps.consumer;

import gpsUtil.location.Attraction;
import gpsUtil.location.Location;
import gpsUtil.location.VisitedLocation;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;


@Component
public class RewardGateway {

    private final RestTemplate restTemplate;



    public RewardGateway(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }



    /*
        public ResponseEntity<Boolean> isWithinAttractionProximity(Attraction attraction, Location location) {

            HttpEntity<Attraction> httpEntity = new HttpEntity<Attraction>(attraction);
            HttpEntity<Location> httpEntity2 = new HttpEntity<Location>(attraction);
            return restTemplate.postForEntity("localhost:8092/reward/proximity", httpEntity,httpEntity2, Boolean.class);
        }

     */
    public ResponseEntity<Boolean> isWithinAttractionProximity(Attraction attraction, Location location) {
        ProximityDTO dto = new ProximityDTO(attraction,location);

        HttpEntity<ProximityDTO> httpEntity = new HttpEntity<>(dto);
        return restTemplate.postForEntity("http://localhost:8092/reward/proximity/", httpEntity, Boolean.class);
    }

    



}
