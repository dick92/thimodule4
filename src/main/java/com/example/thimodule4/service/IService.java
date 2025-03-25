package com.example.thimodule4.service;

import java.util.List;

public interface IService<T>{

    List<T> getAll();

    void save(T s);

    void update(String id, T s);

    void remove(String id);

    T findById(String id);

    List<T> findByName(String name);

}
