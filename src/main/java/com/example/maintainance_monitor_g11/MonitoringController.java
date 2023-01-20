package com.example.maintainance_monitor_g11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    @GetMapping("/api/message")
    public String getStatus(){
        return "Everything works as expected";
    }

}
