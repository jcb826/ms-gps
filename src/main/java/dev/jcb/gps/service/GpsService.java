package dev.jcb.gps.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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




}
