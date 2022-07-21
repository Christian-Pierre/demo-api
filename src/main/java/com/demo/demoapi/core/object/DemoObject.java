package com.demo.demoapi.core.object;

import javax.persistence.*;


@Entity
@Table(name = "demonstration_object")
public class DemoObject {

    @Id
    @GeneratedValue
    @Column(name="do_id")
    private int id;

    @Column(name="do_name")
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

