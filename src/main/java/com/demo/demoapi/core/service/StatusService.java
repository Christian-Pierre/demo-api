package com.demo.demoapi.core.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class StatusService {
    public Date getStatus(){
        final Date statusNow = new Date();
        return statusNow;
    }
}
