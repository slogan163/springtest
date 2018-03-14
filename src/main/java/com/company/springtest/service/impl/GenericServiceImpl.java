package com.company.springtest.service.impl;

import com.company.springtest.service.GenericService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericServiceImpl<E,K> implements GenericService<E,K> {

    private JpaRepository<E,K> repository;

    public GenericServiceImpl(JpaRepository<E, K> repository) {
        this.repository = repository;
    }

    public JpaRepository<E, K> getRepository() {
        return repository;
    }

    @Override
    public void saveOrUpdate(E entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public void saveAll(Iterable<E> entities) {
        repository.saveAll(entities);
    }

    @Override
    public void remove(E entity) {
        repository.delete(entity);
    }

    @Override
    public void removeAll(Iterable<E> entities) {
        repository.deleteAll(entities);
    }

    @Override
    public E findById(K key) {
        return repository.findById(key).orElse(null);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }
}
