package dev.jcb.gps.controller;

import com.jsoniter.output.JsonStream;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class GpsUtilController {



@Autowired GpsUtil gpsUtil;


        @RequestMapping("/getLocation")
        public String getLocation(@RequestParam UUID id) {
            VisitedLocation visitedLocation = gpsUtil.getUserLocation(id);
            return JsonStream.serialize(visitedLocation.location);
        }
}
