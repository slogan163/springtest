package com.company.springtest.service;

import java.util.List;

public interface GenericService<E,K> {
    void saveOrUpdate(E entity);
    void saveAll(Iterable<E> entities);
    void remove(E entity);
    void removeAll(Iterable<E> entities);
    E findById(K key);
    List<E> findAll() ;
}
