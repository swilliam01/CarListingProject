package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    public Set<Cars> car;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Cars> getCar() {
        return car;
    }

    public void setCar(Set<Cars> car) {
        this.car = car;
    }
}
