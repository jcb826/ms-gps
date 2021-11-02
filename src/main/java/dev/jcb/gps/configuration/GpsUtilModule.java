package dev.jcb.gps.configuration;

import dev.jcb.gps.service.GpsService;
import gpsUtil.GpsUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GpsUtilModule {

    @Bean
    public RestTemplate getRestemplate() {
        return new RestTemplate();
    }
    @Bean
    public GpsUtil getGpsUtil() {
        return new GpsUtil();
    }


}
