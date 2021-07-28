package dev.jcb.gps.service;

import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;

import java.util.UUID;

public class GpsService {

    private final GpsUtil gpsUtil;

    public GpsService(GpsUtil gpsUtil) {
        this.gpsUtil = gpsUtil;
    }
public VisitedLocation getUserLocation (UUID id){

        return gpsUtil.getUserLocation(id);
}
    //  creer methos getlocation
    // implementer la couche service qui tuilisait gpsutil

    // creer un controleur pour ms-gps  qui apelle le Gpsservice url : location
    // le tester avec postman lui faire sortir un JSON


}
