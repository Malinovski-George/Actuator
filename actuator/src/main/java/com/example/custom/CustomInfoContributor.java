package com.example.custom;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomInfoContributor implements InfoContributor {

    @Override
        public void contribute(Info.Builder builder) {
            Map<String, Integer> userDetails = new HashMap<>();
            userDetails.put("active", 15);
            userDetails.put("inactive", 134);
            builder.withDetail("users", userDetails);
    }
//    +properties
//    +git
//    +plugin

}
