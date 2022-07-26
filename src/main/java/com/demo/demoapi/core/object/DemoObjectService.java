package com.demo.demoapi.core.object;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoObjectService {

    @Autowired
    private DemoObjectRepository repository;
    
    public List<DemoObject> saveDemoObject(List<DemoObject> demoObjects){
        return repository.saveAll(demoObjects);
    }

    public List<DemoObject> getDemoObjects(){
        return repository.findAll();
    }

    public Optional<DemoObject> getDemoObjectById(Integer Id){
        return repository.findById(Id);
    }

    public List<DemoObject> getDemoObjectByName(String Name){
        return repository.findByName(Name);
    }

    public DemoObject updateDemoObject(DemoObject demoObject){
        
        DemoObject updatedDo = new DemoObject();
        
        updatedDo = repository.getReferenceById(demoObject.getId());
        updatedDo.setName(demoObject.getName());
        
        return repository.save(updatedDo);
    }
      
    public void deleteDemoObject(Integer Id){
        repository.deleteById(Id);
    }

      
}
