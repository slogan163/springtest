package com.company.shared.entity;

public abstract class Entity {
    private Long id;

    public Entity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
