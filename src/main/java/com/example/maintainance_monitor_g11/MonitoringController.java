package com.example.maintainance_monitor_g11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {
    String status = "Everything works as expected";

    @GetMapping("/api/message")
    public String getStatus(){
        return status;
    }

    @GetMapping("/api/message/set")
    public String setStatus(String status){
        this.status = status;
        return "ok";
    }

}
