package com.cydeo.service;

import java.util.List;

public interface CrudService<T, ID> { // need to pass T and unique identifier
    // because we have repeated steps in both services, we are using generics T-any object can be

    T save(T object);
    List<T> findAll();
    T findByID(ID id);
    void delete(T object);
    void deleteById(ID id);

}
