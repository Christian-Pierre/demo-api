package com.demo.demoapi.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demoapi.core.model.DemoObject;
import com.demo.demoapi.core.service.DemoObjectService;

import io.swagger.annotations.Api;

@Api(tags = "Object Demonstrarion")
@RestController
@RequestMapping("/demoObject")
public class demoObjectController {

    private final DemoObjectService service;

    public demoObjectController(DemoObjectService demoObjectService){
        this.service = demoObjectService;
    }
    
    @PostMapping
    public ResponseEntity<List<DemoObject>> addDemoObjects(@RequestBody List<DemoObject> demoObjects){
        return new ResponseEntity<>(
            service.saveDemoObject(demoObjects),
            HttpStatus.CREATED
        );
    }
    
    @GetMapping 
    public ResponseEntity<List<DemoObject>> getDemoObjects(){
        return new ResponseEntity<>(
            service.getDemoObjects(),
            HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DemoObject>> getEspecificDemoObject(@PathVariable Integer id){
        return new ResponseEntity<Optional<DemoObject>>(service.getDemoObjectById(id), HttpStatus.OK);
    }

    @GetMapping("search/{name}")
    public ResponseEntity<List<DemoObject>> getForNameDemoObject(@PathVariable String name){
        return new ResponseEntity<List<DemoObject>>(
            service.getDemoObjectByName(name),
            HttpStatus.OK
        );
    }

    @PutMapping
    public ResponseEntity<DemoObject> updateDemoObject(@RequestBody DemoObject demoObject){
        return new ResponseEntity<DemoObject>(
            service.updateDemoObject(demoObject), 
            HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDemoObject(@PathVariable Integer id){
        service.deleteDemoObject(id);
        return new ResponseEntity<Void>( 
            HttpStatus.OK
        ); 
    }
}
