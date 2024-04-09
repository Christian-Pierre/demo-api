package com.demo.demoapi.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demoapi.core.model.DemoObject;

@Repository
public interface DemoObjectRepository extends JpaRepository<DemoObject, Integer>{
    List<DemoObject> findByName(String name);
}
