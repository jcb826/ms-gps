package dev.jcb.gps.controller;

import com.jsoniter.output.JsonStream;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("gps")
public class GpsUtilController {


    @Autowired
    GpsService gpsService;


    @RequestMapping("/location/{id}")
    public VisitedLocation getLocation(@PathVariable String id) {
        VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString(id));
        return visitedLocation;
    }

    @GetMapping("/attractions")
    public List<Attraction> getAttractions() {
        return (gpsService.getAttractions());
    }

    @GetMapping("/getattractions/{id}")
    public List<Attraction> getNearByAttractions(@PathVariable String id) {
        VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString(id));
        return (gpsService.getNearByAttractions(visitedLocation));
    }
}
