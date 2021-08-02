package dev.jcb.gps.controller;

import com.jsoniter.output.JsonStream;
import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class GpsUtilController {


    @Autowired
    GpsService gpsService;


        @RequestMapping("/getLocation")
        public String getLocation(@RequestParam String id) {
            VisitedLocation visitedLocation = gpsService.getUserLocation(UUID.fromString(id));
            return JsonStream.serialize(visitedLocation.location);
        }
}
