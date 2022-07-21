package com.demo.demoapi.core.object;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoObjectRepository extends JpaRepository<DemoObject, Integer>{
    List<DemoObject> findByName(String name);
}
