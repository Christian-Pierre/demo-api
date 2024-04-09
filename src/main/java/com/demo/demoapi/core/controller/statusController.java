package com.demo.demoapi.core.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demoapi.core.service.StatusService;

import io.swagger.annotations.Api;

@Api(tags = "Status")
@RestController
@RequestMapping("/status")
public class statusController {
    private final StatusService service;
    public statusController (StatusService statusService){
        this.service = statusService;
    }

    //    private final DemoObjectService service;
    @GetMapping 
    public ResponseEntity<Date> getStatus(){
        return new ResponseEntity<>(
            service.getStatus(),
            HttpStatus.OK
        );
    }
}
